/**
 * 
 */
package soot.typestate;

/**
 * @author Haggai Eran
 */
public class UnknownAllocationSite implements AllocationSite {
	@Override
	public int hashCode() {
		// Singleton
		return UnknownAllocationSite.class.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof UnknownAllocationSite;
	}
	
	@Override
	public String toString() {
		return "Unknown";
	}
}
