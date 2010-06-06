/**
 * 
 */
package soot.typestate;

/**
 * @author Haggai Eran
 */
public class ExternalAllocationSiteSet implements AllocationSiteSet {
	@Override
	public int hashCode() {
		// Singleton
		return ExternalAllocationSiteSet.class.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof ExternalAllocationSiteSet;
	}
	
	@Override
	public String toString() {
		return "Unknown";
	}

	@Override
	public boolean intersects(AllocationSiteSet other) {
		// TODO check if this is really the semantic we want.
		return other instanceof ExternalAllocationSiteSet;
	}
}
