package soot.typestate;

import java.util.ArrayList;
import java.util.List;

import soot.BooleanType;
import soot.Local;
import soot.RefType;
import soot.Scene;
import soot.SootMethod;
import soot.SootMethodRef;
import soot.Unit;
import soot.Value;
import soot.jimple.AbstractStmtSwitch;
import soot.jimple.AssignStmt;
import soot.jimple.Constant;
import soot.jimple.EqExpr;
import soot.jimple.IfStmt;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.options.Options;
import soot.toolkits.graph.UnitGraph;
import soot.toolkits.scalar.BoundedFlowSet;
import soot.toolkits.scalar.FlowUniverse;
import soot.toolkits.scalar.ForwardBranchedFlowAnalysis;
import soot.typestate.LatticeNode.ASInfoVisitor;
import soot.typestate.automata.ClassAutomaton;

/**
 * The TypestateAnalysis class implements the typestate analysis itself.
 * Given an automaton and a method, it performs dataflow analysis using 
 * its base class ForwardBranchedFlowAnalysis.
 */
public class TypestateAnalysis extends ForwardBranchedFlowAnalysis<LatticeNode> {
	/// Our automaton.
	private final ClassAutomaton automaton;
	/// Describes the complete set of states.
	private final FlowUniverse<Integer> statesUniverse;
	/// Allocation site handler that finds allocation sites of variables, using spark.
	private final AllocationSiteHandler allocationSiteHandler;
	
	/**
	 * Construct a new TypestateAnalysis object and perform the analysis.
	 * @param graph A flow-graph of the method to analyze.
	 * @param automaton The automaton to use in the analysis.
	 */
	TypestateAnalysis(UnitGraph graph, ClassAutomaton automaton)
    {
        super(graph);
        this.automaton = automaton;
        this.statesUniverse = automaton.getFlowUniverse();
    	this.allocationSiteHandler = new AllocationSiteHandler(Scene.v().getPointsToAnalysis());
        doAnalysis();
    }
	
	/**
	 * A helper method to determine if a given value is declared as the type
	 * we are analyzing.
	 * @param value The value to check.
	 * @return true if the value is a reference type to our class.
	 */
	private boolean ourType(Value value) {
		return value.getType() instanceof RefType &&
			((RefType) value.getType()).getSootClass().equals(automaton.getKlass());
	}

	/**
	 * Implement the transformation performed by a single statement.
	 * 
	 * @param in The statement's input lattice node.
	 * @param node The statement itself.
	 * @param fallOut A list of output lattice nodes, one for each fall-target 
	 * 				  of the statement.
	 * @param branchOuts A list of output lattice nodes, one for each 
	 * 					 branch-target of the statement.
	 */
	@Override
	protected void flowThrough(final LatticeNode in, final Unit node, 
            List<LatticeNode> fallOut, List<LatticeNode> branchOuts) {
		// New output nodes that will be copied to the fallOut and branchOuts 
		// lists according to the current statement.
		final LatticeNode out = new LatticeNode(in),
		      			  outBranch = new LatticeNode(in);
		/*
		 * This variable determines whether we need a different fall and branch
		 * output nodes. It is a singleton list of Boolean, since we need access
		 * to it by reference from within the visitor anonymous class.
		 */
		final List<Boolean> differentFallAndBranch = new ArrayList<Boolean>(1);
		differentFallAndBranch.add(false);
		
		// Use a visitor to handle the different types of statements
		node.apply(new AbstractStmtSwitch() {
			/**
			 * Handles assignment statements.
			 * 
			 * @param stmt An assignment statement.
			 */
			@Override
			public void caseAssignStmt(AssignStmt stmt) {
				checkObjectEscaping(stmt);
				
				if (stmt.getRightOp() instanceof InvokeExpr) {
					InvokeExpr invokeExpr = (InvokeExpr) stmt.getRightOp();
					handleInvokeExpr(invokeExpr);
				}
				
				if (!(stmt.getLeftOp() instanceof Local))
					return;
				Local local = (Local) stmt.getLeftOp();
				
				if (ourType(local)) {
					AllocationSiteSet allocSite = 
						allocationSiteHandler.getDefAllocationSite(stmt);
					
					if (allocSite != null)
						handleAllocation(allocSite);
				}
				else if (local.getType() instanceof BooleanType) {
					handleBooleanAssignment(stmt, local);
				}
			}

			/**
			 * Identify cases where we lose track of Type state and set the
			 * (sub)lattice of the relevant allocation site to TOP to preserve
			 * soundness (i.e. we will report error).
			 * 
			 * For example, if a data member of the class is accessed outside of
			 * the class it is possible that the automaton no longer reflect the
			 * true state of the class.
			 * 
			 * @param stmt The current assignment statement.
			 */
			private void checkObjectEscaping(AssignStmt stmt) {
				Value r = stmt.getRightOp();
				// Treat statements like "(not local) = our_class";
				if (!(stmt.getLeftOp() instanceof Local))
					setOutTop(r);
				
				// Treat statements like "? = our_class.b"
				if (r instanceof InstanceFieldRef) {
					InstanceFieldRef right = (InstanceFieldRef) r;
					setOutTop(right.getBase());
				}
				
				// Treat statements like "our_class.b = ?"
				if (stmt.getLeftOp() instanceof InstanceFieldRef) {
					InstanceFieldRef left = (InstanceFieldRef) stmt.getLeftOp();
					setOutTop(left.getBase());
				}
			}

			/**
			 * Handle an allocation site.
			 * 
			 * The current statement is an assignment whose right side is a
			 * <code>new</code> expression.
			 * 
			 * @param allocSite The allocation site object representing the
			 * 					result from Spark.
			 */
			private void handleAllocation(AllocationSiteSet allocSite) {
				final ASInfo inAsInfo  = in.getASInfo(allocSite),
							 outAsInfo = out.getASInfo(allocSite);
				if (inAsInfo != null) {
					// If we already have this allocation site in the input
					// lattice, then it cannot be unique.
					inAsInfo.copy(outAsInfo);
					outAsInfo.setUnique(false);
				}
				else {
					// Add this allocation site to the output lattice, in the
					// initial state.
					final ASInfo newOutInfo = new ASInfo(automaton.getInitialState());
					out.addASInfo(allocSite, newOutInfo);
				}
			}

			/**
			 * Handle the case of an assignment to a boolean local. 
			 * 
			 * This is used to keep track of the definitions of such locals that 
			 * are alive, they are defined by a method call to an object of our 
			 * class, and their object's state hasn't changed since the 
			 * definition.
			 * 
			 * @param stmt The assignment statement.
			 * @param local The boolean local.
			 */
			private void handleBooleanAssignment(AssignStmt stmt, Local local) {
				if (stmt.getRightOp() instanceof InstanceInvokeExpr) {
					InstanceInvokeExpr invokeExpr = (InstanceInvokeExpr) stmt.getRightOp();
					Local base = (Local) invokeExpr.getBase();
					if (!ourType(base))
						out.killConditional(local);
					
					out.setConditional(local, stmt);
				}
				else
					out.killConditional(local);
			}
			
			/**
			 * Handles method invocation statements.
			 * 
			 * @param stmt The invocation statement.
			 */
			@Override
			public void caseInvokeStmt(InvokeStmt stmt) {
				InvokeExpr invokeExpr = stmt.getInvokeExpr();
				handleInvokeExpr(invokeExpr);
			}

			/**
			 * Handle a method call expression.
			 * 
			 * These can be found both in invocation statements, handled by
			 * caseInvokeStmt(), when the return value is ignored, and also in
			 * assignment statements, handled by caseAssignStmt(), when the
			 * return value is stored.
			 * 
			 * @param invokeExpr - The method invocation expression.
			 */
			private void handleInvokeExpr(InvokeExpr invokeExpr) {
				final SootMethodRef methodRef = invokeExpr.getMethodRef();
				// Check if our type is passed as a parameter. 
				// If it is, turn it conservatively to top.
				for (Object arg : invokeExpr.getArgs()) {
					setOutTop(arg);
					if (arg instanceof InstanceFieldRef) {
						InstanceFieldRef fieldRef = (InstanceFieldRef) arg;
						setOutTop(fieldRef.getBase());
					}
				}
				if (!(invokeExpr instanceof InstanceInvokeExpr))
					return;
				InstanceInvokeExpr instanceInvokeExpr = (InstanceInvokeExpr) invokeExpr;

				Local base = (Local) instanceInvokeExpr.getBase();
				if (!ourType(base))
					return;
				if (!methodRef.declaringClass().equals(automaton.getKlass())) {
					// The method belongs to a super-class or a sub-class.
					// Since these are not part of the automaton, we do not know
					// how they might affect the state.
					setOutTop(base);
					return;
				}
				
				// For each allocation site referred to by base perform the 
				// state update.
				final AllocationSiteSet allocSites = 
					allocationSiteHandler.getUseAllocationSites(node, base);
				in.forEachAllocationSite(allocSites, 
						new PerformStateUpdate(allocSites, methodRef));
				
				out.killConditional(base);
			}

			/**
			 * A visitor that performs the state update for each allocation site.
			 */
			final class PerformStateUpdate implements ASInfoVisitor {
				private final boolean singleAllocationSite;
				private final SootMethodRef methodRef;
			
				/**
				 * Constructs the visitor.
				 * 
				 * @param allocSites The set of allocation sites to update.
				 * @param methodRef The method invoked.
				 */
				private PerformStateUpdate(AllocationSiteSet allocSites, 
						SootMethodRef methodRef) {
					this.singleAllocationSite = allocSites.size() == 1;
					this.methodRef = methodRef;
				}
			
				@Override
				public void visit(AllocationSiteSet allocSite, ASInfo inInfo) {
					ASInfo outInfo = out.getASInfo(allocSite);
					
					BoundedFlowSet states = inInfo.getStates(),
					nextStates = automaton.getDelta(methodRef.resolve(), states);
			
					if (inInfo.isUnique() && singleAllocationSite)
						// Perform a strong update.
						outInfo.setStates(nextStates);
					else
						// Perform a weak update
//						inInfo.copy(outInfo);
						outInfo.merge(nextStates);
				}
			}

			/**
			 * Check whether the argument is of our class, and if so set its
			 * ASInfo in the output lattice to top.
			 * 
			 * @param arg The value to check.
			 * @return true if the value was in fact set to top.
			 */
			private boolean setOutTop(Object arg) {
				if (!(arg instanceof Local))
					return false;
				
				Local local = (Local) arg;
				if (!ourType(local))
					return false;
				
				out.forEachAllocationSite(
					allocationSiteHandler.getUseAllocationSites(node, local), 
						new ASInfoVisitor() {
							@Override
							public void visit(AllocationSiteSet allocSite,
									ASInfo asInfo) {
								asInfo.setTop();
							}
						}); 
				return true;
			}
			
			/**
			 * Handles an if-statement.
			 * 
			 * Check if the condition is of the form <code>local == true</code>
			 * or <code>local == false</code>, and if so pass it to 
			 * handleBooleanCondition().
			 * 
			 * @param stmt The if-statement.
			 */
			@Override
			public void caseIfStmt(IfStmt stmt) {
				if (stmt.getCondition() instanceof EqExpr) {
					Local local; 
					final IntConstant constant;
					EqExpr eqExpr = (EqExpr) stmt.getCondition();
					if (eqExpr.getOp1() instanceof Local && eqExpr.getOp2() instanceof Constant) {
						local = (Local) eqExpr.getOp1();
						constant = (IntConstant) eqExpr.getOp2();
					}
					else if (eqExpr.getOp2() instanceof Local && eqExpr.getOp1() instanceof Constant) {
						local = (Local) eqExpr.getOp2();
						constant = (IntConstant) eqExpr.getOp1();
					}
					else
						return;
					
					handleBooleanCondition(local, constant);
				}
			}

			/**
			 * Handles a boolean condition of the form 
			 * <code>local == true/false</code>.
			 * 
			 * Checks if there is a live definition of the local as the returned
			 * value from our class' method call. If so change the state of the
			 * fall and branch output lattice accordingly.
			 * 
			 * @param local The boolean local.
			 * @param constant The constant it is being compared with.
			 */
			private void handleBooleanCondition(Local local,
					final IntConstant constant) {
				AssignStmt defStmt = in.getConditional(local);
				if (defStmt == null)
					return;
				if (!(defStmt.getInvokeExpr() instanceof InstanceInvokeExpr))
					return;
				InstanceInvokeExpr invokeExpr = (InstanceInvokeExpr) defStmt.getInvokeExpr();
				AllocationSiteSet allocSite = allocationSiteHandler.getUseAllocationSites(defStmt, (Local)invokeExpr.getBase());
				
				final SootMethod method = invokeExpr.getMethod();

				in.forEachAllocationSite(allocSite, new ASInfoVisitor() {
					@Override
					public void visit(AllocationSiteSet allocSite, ASInfo asInfo) {
						final BoundedFlowSet nextStatesTrue  = automaton.getDelta(method, 
								constant.value != 0, asInfo.getStates());
						final BoundedFlowSet nextStatesFalse = automaton.getDelta(method, 
								constant.value == 0, asInfo.getStates());
						if (asInfo.isUnique() && allocSite.size() == 1) {
							// Strong update
							differentFallAndBranch.set(0, true);
							out.getASInfo(allocSite).setStates(nextStatesFalse);
							outBranch.getASInfo(allocSite).setStates(nextStatesTrue);
						}
					}
				});
			}
		});
		
		// Copy the output lattice node to the fallOut and branchOut lists.
		for (LatticeNode latticeNode : fallOut) {
			out.copy(latticeNode);
		}
		
		for (LatticeNode latticeNode : branchOuts) {
			if(differentFallAndBranch.get(0))
				outBranch.copy(latticeNode);
			else
				out.copy(latticeNode);
		}

		if (Options.v().verbose()) {
			System.out.println("  Input: " + in);
			System.out.println("    " + node.getTag("LineNumberTag") + ": " + node);
			System.out.println("  Output: ");
			System.out.println("    Fall: " + fallOut);
			System.out.println("    Branch: " + branchOuts);
		}
	}

	@Override
	protected void copy(LatticeNode source, LatticeNode dest) {
		source.copy(dest);		
	}

	@Override
	protected void merge(LatticeNode in1, LatticeNode in2, LatticeNode out) {
		in1.union(in2, out);
	}

	@Override
	protected LatticeNode entryInitialFlow() {
		return new LatticeNode(statesUniverse);
	}

	@Override
	protected LatticeNode newInitialFlow() {
		return new LatticeNode(statesUniverse);
	}
}
