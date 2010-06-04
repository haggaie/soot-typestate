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

	// Merge the other node into this one.
	public void merge(ASInfo other) {
		merge(other.states);
	}
	
	// Add the new states to the current ones.
	public void merge(FlowSet newStates) {
		states.union(newStates);
	}
	
	// Return the set of states.
	public FlowSet getStates() {
		return states;
	}
	
	// Update the set of states.
	public void setStates(FlowSet states) {
		states.copy(this.states);
	}
	

	// Copy our data into another node.
	public void copy(ASInfo outInfo) {
		outInfo.setStates(states);
	}

	@Override
	public boolean equals(Object obj) {
		ASInfo other = (ASInfo) obj;
		
		return states.equals(other.states);
	}
	
	// Convert to string for debugging.
	@Override
	public String toString() {
		return "ASInfo(" + states.toString() + ")";
	}
}
