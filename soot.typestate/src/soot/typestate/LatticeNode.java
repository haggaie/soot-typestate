/**
 * 
 */
package soot.typestate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.FlowUniverse;

/**
 * @author fshaked
 *
 */
public class LatticeNode {
	private final Map<Integer, ASInfo> map;
	// An empty ASInfo ready for insertion for missing allocation sites.
	private final ASInfo emptyASInfo;
	
	LatticeNode(FlowUniverse<Integer> statesUniverse)
	{
		map = new HashMap<Integer, ASInfo>();
		emptyASInfo = new ASInfo(statesUniverse);
	}
	
	void union(LatticeNode other, LatticeNode dest)
	{
		other.copy(dest);
		for (Map.Entry<Integer, ASInfo> entry : map.entrySet()) {
			final Integer key = entry.getKey();
			if (dest.map.containsKey(key))
				dest.map.get(key).merge(entry.getValue());
			else
				dest.map.put(key, entry.getValue());
		}
	}
	
	void copy(LatticeNode other)
	{
		other.map.clear();
		for (Map.Entry<Integer, ASInfo> entry : map.entrySet()) {
			other.map.put(entry.getKey(), entry.getValue().clone());
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		LatticeNode other = (LatticeNode) obj;
		return map.equals(other.map);
	}
	
	// Return the ASInfo for a given allocation site.
	public ASInfo getASInfo(Integer allocSite)
	{
		if (!map.containsKey(allocSite))
			map.put(allocSite, emptyASInfo.clone());
		return map.get(allocSite);
	}
	
	// Convert to String for debugging.
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("LN(");
		
		Iterator<Integer> it = map.keySet().iterator();
		if (it.hasNext()) {
			Integer allocSite = it.next();
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
		void visit(Integer allocSite, ASInfo asInfo);
	}
	public void forEachAllocationSite(Collection<Integer> allocationSites,
		ASInfoVisitor visitor)
	{
		for (Integer allocSite : allocationSites) {
			visitor.visit(allocSite, getASInfo(allocSite));
		}
	}
}
