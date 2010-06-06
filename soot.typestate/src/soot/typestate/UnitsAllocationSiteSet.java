package soot.typestate;

import java.util.HashSet;

import soot.Unit;
import soot.jimple.DefinitionStmt;

/**
 * An allocation site that is defined by a line of code.
 * Contains a reference to where the object is allocated/defined.
 * 
 * @author Haggai Eran
 */
public class UnitsAllocationSiteSet extends HashSet<Unit> implements AllocationSiteSet {
	private static final long serialVersionUID = 3297701595357904822L;

	UnitsAllocationSiteSet(DefinitionStmt unit) {
		add(unit);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean intersects(AllocationSiteSet obj) {
		UnitsAllocationSiteSet other = (UnitsAllocationSiteSet) obj;
		HashSet<Unit> copy = (HashSet<Unit>) clone();
		copy.removeAll(other);
		return !copy.isEmpty();
	}
}
