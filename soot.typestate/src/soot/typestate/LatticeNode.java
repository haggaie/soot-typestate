/**
 * 
 */
package soot.typestate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.toolkits.scalar.BoundedFlowSet;
import soot.toolkits.scalar.FlowUniverse;

/**
 * @author fshaked
 *
 */
public class LatticeNode {
	private final Map<AllocationSiteSet, ASInfo> map;
	// A full ASInfo ready for insertion for missing allocation sites.
	private final ASInfo fullASInfo;
	
	LatticeNode(FlowUniverse<Integer> statesUniverse)
	{
		map = new HashMap<AllocationSiteSet, ASInfo>();
		fullASInfo = new ASInfo(statesUniverse);
		fullASInfo.getStates().complement();
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
	}
	
	void copy(LatticeNode other)
	{
		other.map.clear();
		for (Map.Entry<AllocationSiteSet, ASInfo> entry : map.entrySet()) {
			other.map.put(entry.getKey(), entry.getValue().clone());
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		LatticeNode other = (LatticeNode) obj;
		return map.equals(other.map);
	}
	
	// Return the ASInfo for a given allocation site.
	public ASInfo getASInfo(AllocationSiteSet allocSite)
	{
		if (!map.containsKey(allocSite))
			map.put(allocSite, fullASInfo.clone());
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
}
