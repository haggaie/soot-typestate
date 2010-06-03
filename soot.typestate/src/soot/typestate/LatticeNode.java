/**
 * 
 */
package soot.typestate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fshaked
 *
 */
public class LatticeNode {
	private final Map<Integer, ASInfo> map;
	
	LatticeNode()
	{
		map = new HashMap<Integer, ASInfo>();
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
}
