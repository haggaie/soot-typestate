/**
 * 
 */
package soot.typestate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import soot.Local;
import soot.PointsToAnalysis;
import soot.Unit;
import soot.Value;
import soot.ValueBox;
import soot.jimple.DefinitionStmt;
import soot.jimple.FieldRef;
import soot.jimple.NewExpr;
import soot.jimple.spark.pag.Node;
import soot.jimple.spark.sets.P2SetVisitor;
import soot.jimple.spark.sets.PointsToSetInternal;

/**
 * Create allocation sites based on Spark analysis results.
 * @author haggai
 *
 */
public class SparkAllocationSiteHandler implements AllocationSiteHandler {
	private final PointsToAnalysis pta;
	
	public SparkAllocationSiteHandler(PointsToAnalysis pta) {
		this.pta = pta;
	}
	
	/* (non-Javadoc)
	 * @see soot.typestate.AllocationSiteHandler#getAllocationSites(soot.Unit)
	 */
	@Override
	public Collection<AllocationSite> getUseAllocationSites(Unit unit) {
		final Collection<AllocationSite> allocationSites = new ArrayList<AllocationSite>();
		PointsToSetInternal pts = null;
		
		Value value = unit.getUseBoxes().get(0).getValue();
		if (value instanceof Local) {
			Local local = (Local) value;
			pts = (PointsToSetInternal) pta.reachingObjects(local); 
		}
		else if (value instanceof FieldRef) {
			FieldRef fieldRef = (FieldRef) value;
			Local local = (Local) ((ValueBox) fieldRef.getUseBoxes().get(0)).getValue();
			pts = (PointsToSetInternal) pta.reachingObjects(local, fieldRef.getField());
		}
		// TODO other cases: ArrayRef, etc.
		pts.forall(new P2SetVisitor() {
			@Override
			public void visit(Node node) {
				allocationSites.add(new IntegerAllocationSite(node.getNumber()));
			}
		});
		
		return allocationSites;
	}

	@Override
	public AllocationSite getDefAllocationSite(DefinitionStmt def) {
		if (!(def.getRightOp() instanceof NewExpr))
			return null;
		
		Local local = (Local) def.getLeftOp();
		PointsToSetInternal pts = (PointsToSetInternal) pta.reachingObjects(local);
		
		final List<AllocationSite> result = new ArrayList<AllocationSite>(1);
		pts.forall(new P2SetVisitor() {
			@Override
			public void visit(Node n) {
				result.add(new IntegerAllocationSite(n.getNumber()));
			}
		});
		
		assert result.size() == 1;
				
		return result.get(0);
	}
}
