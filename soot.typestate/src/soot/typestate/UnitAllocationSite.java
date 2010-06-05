package soot.typestate;

import soot.jimple.DefinitionStmt;

/**
 * An allocation site that is defined by a line of code.
 * Contains a reference to where the object is allocated/defined.
 * 
 * @author Haggai Eran
 */
public class UnitAllocationSite implements AllocationSite {
	public final DefinitionStmt unit;
	
	UnitAllocationSite(DefinitionStmt unit) {
		this.unit = unit;
	}
	
	@Override
	public int hashCode() {
		return unit.hashCode();
	}
	
	@Override
	public String toString() {
		return unit.getLeftOp().toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		UnitAllocationSite other = (UnitAllocationSite) obj;
		return unit.equals(other.unit);
	}
}
