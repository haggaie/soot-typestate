/**
 * 
 */
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
 * @author fshaked
 *
 */
public class LatticeNode {
	private final Map<AllocationSiteSet, ASInfo> map;
	private final Map<Local, AssignStmt> liveConditionals;
	// A full ASInfo ready for insertion for missing allocation sites.
	private final ASInfo fullASInfo;
	
	LatticeNode(FlowUniverse<Integer> statesUniverse)
	{
		map = new HashMap<AllocationSiteSet, ASInfo>();
		liveConditionals = new HashMap<Local, AssignStmt>();
		fullASInfo = new ASInfo(statesUniverse);
		fullASInfo.getStates().complement();
	}

	LatticeNode(LatticeNode other)
	{
		map = new HashMap<AllocationSiteSet, ASInfo>();
		for (Entry<AllocationSiteSet, ASInfo> e : other.map.entrySet())
			map.put(e.getKey(), e.getValue().clone());
		liveConditionals = new HashMap<Local, AssignStmt>(other.liveConditionals);
		fullASInfo = other.fullASInfo;
	}
	
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
	
	// Return the ASInfo for a given allocation site.
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
	
	public interface ASInfoVisitor
	{
		void visit(AllocationSiteSet allocSite, ASInfo asInfo);
	}
	
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
	
	public boolean hasState(BoundedFlowSet state)
	{
		for (Map.Entry<AllocationSiteSet, ASInfo> entry : map.entrySet()) {
			if (entry.getValue().hasState(state))
				return true;
		}
		
		return false;
	}

	public void addASInfo(AllocationSiteSet allocSite, ASInfo newInfo) {
		assert !map.containsKey(allocSite);
		
		map.put(allocSite, newInfo);
	}

	public void setConditional(Local local, AssignStmt stmt) {
		liveConditionals.put(local, stmt);
	}

	public void killConditional(Local local) {
		liveConditionals.remove(local);
	}
	
	public AssignStmt getConditional(Local local) {
		if (liveConditionals.containsKey(local))
			return liveConditionals.get(local);
		else
			return null;
	}
}
