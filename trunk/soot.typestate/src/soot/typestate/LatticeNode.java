package soot.typestate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import soot.Local;
import soot.jimple.AssignStmt;
import soot.toolkits.scalar.BoundedFlowSet;
import soot.toolkits.scalar.FlowUniverse;

/**
 * Represent the abstract state of the program for the TypestateAnalysis class. 
 * @author Shaked Flur
 * @author Haggai Eran
 */
public class LatticeNode {
	/**
	 * Map between known allocation sites, and their ASInfo objects.
	 */
	private final Map<AllocationSiteSet, ASInfo> map;
	/**
	 * Map between boolean local variables and their definition as a method call 
	 * return value.
	 */
	private final Map<Local, AssignStmt> liveConditionals;

	/**
	 * Construct a new lattice node given the total set of states.
	 * @param statesUniverse A FlowUniverse object containing all the 
	 * 						 automaton's states.
	 */
	LatticeNode(FlowUniverse<Integer> statesUniverse)
	{
		map = new HashMap<AllocationSiteSet, ASInfo>();
		liveConditionals = new HashMap<Local, AssignStmt>();
	}

	/**
	 * Copy another lattice node.
	 * @param other the node to copy.
	 */
	LatticeNode(LatticeNode other)
	{
		map = new HashMap<AllocationSiteSet, ASInfo>();
		// Make a deep copy of the map field.
		for (Entry<AllocationSiteSet, ASInfo> e : other.map.entrySet())
			map.put(e.getKey(), e.getValue().clone());
		liveConditionals = new HashMap<Local, AssignStmt>(other.liveConditionals);
	}
	
	/**
	 * Performs a join between this node and other, and store the result in dest.
	 * @param other The other node for the join operation.
	 * @param dest Destination of the result.
	 */
	void union(LatticeNode other, LatticeNode dest)
	{
		other.copy(dest);
		for (Map.Entry<AllocationSiteSet, ASInfo> entry : map.entrySet()) {
			final AllocationSiteSet key = entry.getKey();
			if (dest.map.containsKey(key))
				dest.map.get(key).merge(entry.getValue());
			else
				dest.map.put(key, entry.getValue());
		}
		for (Map.Entry<Local, AssignStmt> entry : liveConditionals.entrySet()) {
			final Local key = entry.getKey();
			if (!dest.liveConditionals.containsKey(key)) {
				dest.liveConditionals.put(key, null); // null designates Top.
				continue;
			}
			AssignStmt otherStmt = dest.liveConditionals.get(key);
			if (otherStmt != null && !otherStmt.equals(entry.getValue()))
				dest.liveConditionals.put(key, null); // null designates Top.
		}
	}
	
	/**
	 * Copy this node into another.
	 * 
	 * @param other The destination of the copy.
	 */
	void copy(LatticeNode other)
	{
		other.map.clear();
		for (Map.Entry<AllocationSiteSet, ASInfo> entry : map.entrySet()) {
			other.map.put(entry.getKey(), entry.getValue().clone());
		}
		other.liveConditionals.clear();
		other.liveConditionals.putAll(liveConditionals);
	}
	
	@Override
	public boolean equals(Object obj) {
		LatticeNode other = (LatticeNode) obj;
		return map.equals(other.map) && liveConditionals.equals(other.liveConditionals);
	}
	
	/**
	 * Return the ASInfo for a given allocation site.
	 * 
	 * The allocation site set must be a singleton.
	 * 
	 * @param allocSite The allocation site to find.
	 * @return The ASInfo object, or null if it is not in the map.
	 */
	public ASInfo getASInfo(AllocationSiteSet allocSite)
	{
		if (!map.containsKey(allocSite))
			return null;
		return map.get(allocSite);
	}
	
	// Convert to String for debugging.
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("LN(");
		
		Iterator<AllocationSiteSet> it = map.keySet().iterator();
		if (it.hasNext()) {
			AllocationSiteSet allocSite = it.next();
			buffer.append(allocSite);
			buffer.append(" -> ");
			buffer.append(map.get(allocSite));
			
			while (it.hasNext()) {
				buffer.append(", ");
				
				allocSite = it.next();
				buffer.append(allocSite);
				buffer.append(" -> ");
				buffer.append(map.get(allocSite));
			}
		}
		buffer.append(", live conditionals: ");
		buffer.append(liveConditionals);
		buffer.append(")");
		
		return buffer.toString();
	}
	
	/**
	 * A visitor interface for performing an operation on an allocation site
	 * in our map.
	 */
	public interface ASInfoVisitor
	{
		/**
		 * Visit an allocation site, and pass along its ASInfo value.
		 */
		void visit(AllocationSiteSet allocSite, ASInfo asInfo);
	}

	/**
	 * Visit all allocation sites in the given set.
	 * 
	 * @param allocationSiteSet The set of allocation sites to visit.
	 * @param visitor An ASInfoVisitor object.
	 */
	public void forEachAllocationSite(AllocationSiteSet allocationSiteSet,
		ASInfoVisitor visitor)
	{
		for (Map.Entry<AllocationSiteSet, ASInfo> entry : map.entrySet())
		{
			AllocationSiteSet allocSite = entry.getKey();
			if (allocSite.intersects(allocationSiteSet))
				visitor.visit(allocSite, entry.getValue());
		}
	}
	
	/**
	 * Check if a given state set intersects with any of the states stored in
	 * this node, for any of the allocation sites.
	 * 
	 * Used for printing the errors in the output.
	 * 
	 * @param state The set of states to check.
	 * @return true if for any allocation site, state intersects with one of the
	 * 		   states in its ASInfo.
	 */
	public boolean hasState(BoundedFlowSet state)
	{
		for (Map.Entry<AllocationSiteSet, ASInfo> entry : map.entrySet()) {
			if (entry.getValue().hasState(state))
				return true;
		}
		
		return false;
	}

	/**
	 * Insert a new allocation site info.
	 * 
	 * The method expects that the allocation site will not be in this node 
	 * already.
	 * 
	 * @param allocSite The new allocation site to add.
	 * @param newInfo The new ASInfo object.
	 * 
	 */
	public void addASInfo(AllocationSiteSet allocSite, ASInfo newInfo) {
		assert !map.containsKey(allocSite);
		
		map.put(allocSite, newInfo);
	}

	/**
	 * Set the defining statement of a local.
	 * 
	 * @param local a local variable.
	 * @param stmt its current defining statement.
	 */
	public void setConditional(Local local, AssignStmt stmt) {
		liveConditionals.put(local, stmt);
	}

	/**
	 * Remove a defining statement for a local.
	 * 
	 * @param local a local variable.
	 */
	public void killConditional(Local local) {
		liveConditionals.remove(local);
	}
	
	/**
	 * Return a defining statement for a given local, if it exists.
	 * 
	 * @param local a local variable
	 * @return its defining statement, or null if not in the node.
	 */
	public AssignStmt getConditional(Local local) {
		if (liveConditionals.containsKey(local))
			return liveConditionals.get(local);
		else
			return null;
	}
}
