/**
 * 
 */
package soot.typestate;

import soot.toolkits.scalar.ArrayPackedSet;
import soot.toolkits.scalar.BoundedFlowSet;
import soot.toolkits.scalar.FlowUniverse;

/**
 * @author fshaked
 *
 */
public class ASInfo {
	private final BoundedFlowSet states;
	private boolean unique = true;
	
	ASInfo(BoundedFlowSet states) {
		this.states = states;
	}
	
	ASInfo(FlowUniverse<Integer> statesUniverse)
	{
		states = new ArrayPackedSet(statesUniverse);
	}
	
	ASInfo(ASInfo other)
	{
		states = (BoundedFlowSet) other.states.clone();
		unique = other.unique;
	}
	
	@Override
	public ASInfo clone() {
		return new ASInfo(this);
	}

	// Merge the other node into this one.
	public void merge(ASInfo other) {
		merge(other.states);
		unique = unique && other.unique;
	}
	
	// Add the new states to the current ones.
	public void merge(BoundedFlowSet newStates) {
		states.union(newStates);
	}
	
	// Return the set of states.
	public BoundedFlowSet getStates() {
		return states;
	}
	
	// Update the set of states.
	public void setStates(BoundedFlowSet  states) {
		states.copy(this.states);
	}
	
	// Copy our data into another node.
	public void copy(ASInfo outInfo) {
		outInfo.setStates(states);
		outInfo.unique = unique;
	}

	@Override
	public boolean equals(Object obj) {
		ASInfo other = (ASInfo) obj;
		
		return states.equals(other.states) && unique == other.unique;
	}
	
	// Convert to string for debugging.
	@Override
	public String toString() {
		return "ASInfo(" + states.toString() + ")";
	}
	
	public boolean hasState(BoundedFlowSet state) {
		BoundedFlowSet result = (BoundedFlowSet) states.clone();
		result.intersection(state);
		return !result.isEmpty();
	}
	
	public boolean isUnique() {
		return unique;
	}
	
	public void setUnique(boolean unique) {
		this.unique = unique;
	}
}