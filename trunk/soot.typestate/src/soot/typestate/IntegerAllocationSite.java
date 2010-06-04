package soot.typestate;

/**
 * An allocation sites that is an Integer. For use with points-to analysis
 * numbered allocation sites.
 * 
 * @author Haggai Eran
 */
public class IntegerAllocationSite implements AllocationSite {
	public final Integer id;
	
	IntegerAllocationSite(Integer id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		IntegerAllocationSite other = (IntegerAllocationSite) obj;
		return id.equals(other.id);
	}
}
