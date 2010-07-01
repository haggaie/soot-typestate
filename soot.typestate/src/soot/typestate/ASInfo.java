package soot.typestate;

import soot.toolkits.scalar.BoundedFlowSet;

/**
 * ASInfo is the information in the lattice for specific AS.
 */
public class ASInfo {
	/** Contains the set of possible states of the AS. */
	private final BoundedFlowSet states;
	/** Determines if there is only a single object of this AS. */
	private boolean unique = true;
	/** When true, the AS information is the top node. */
	private boolean isTop = false;
	
	ASInfo(BoundedFlowSet states) {
		this.states = states;
	}
	
	ASInfo(ASInfo other)
	{
		states = (BoundedFlowSet) other.states.clone();
		unique = other.unique;
		isTop = other.isTop;
	}
	
	@Override
	public ASInfo clone() {
		return new ASInfo(this);
	}

	/** Merge the other node into this one. */
	public void merge(ASInfo other) {
		if (isTop || other.isTop)
			isTop = true;
		else {
			merge(other.states);
			unique = unique && other.unique;
		}
	}
	
	/** Add the new states to the current ones. */
	public void merge(BoundedFlowSet newStates) {
		states.union(newStates);
	}
	
	/** Return the set of states. */
	public BoundedFlowSet getStates() {
		return states;
	}
	
	/** Update the set of states. */
	public void setStates(BoundedFlowSet  states) {
		states.copy(this.states);
	}
	
	/** Copy our data into another node. */
	public void copy(ASInfo outInfo) {
		outInfo.setStates(states);
		outInfo.unique = unique;
	}

	@Override
	public boolean equals(Object obj) {
		ASInfo other = (ASInfo) obj;
		
		if (isTop && other.isTop)
			return true;
		return !isTop && !other.isTop && states.equals(other.states) && unique == other.unique;
	}
	
	// Convert to string for debugging.
	@Override
	public String toString() {
		if (isTop)
			return "ASInfo(top)";
		return "ASInfo(" + states.toString() + ")";
	}
	
	/** Check whether the given set of states intersects the AS' states. */ 
	public boolean hasState(BoundedFlowSet state) {
		if (isTop)
			return true;
		BoundedFlowSet result = (BoundedFlowSet) states.clone();
		result.intersection(state);
		return !result.isEmpty();
	}

	/** Returns whether the AS should be treated as unique. */
	public boolean isUnique() {
		return !isTop && unique;
	}
	
	/** Sets the unique flag. */
	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	/** Set the node to be top. */
	public void setTop() {
		this.isTop = true;
	}
}
