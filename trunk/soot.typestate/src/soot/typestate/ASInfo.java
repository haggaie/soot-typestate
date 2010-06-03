/**
 * 
 */
package soot.typestate;

import soot.toolkits.scalar.ArrayPackedSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.FlowUniverse;

/**
 * @author fshaked
 *
 */
public class ASInfo {
	private final FlowSet states;
	
	ASInfo(FlowUniverse<Integer> statesUniverse)
	{
		states = new ArrayPackedSet(statesUniverse);
	}
	
	ASInfo(ASInfo other)
	{
		states = other.states.clone();
	}
	
	@Override
	public ASInfo clone() {
		return new ASInfo(this);
	}

	public void merge(ASInfo other) {
		states.union(other.states);
	}
}
