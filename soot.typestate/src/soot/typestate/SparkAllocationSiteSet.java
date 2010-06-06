package soot.typestate;

import soot.jimple.spark.sets.EqualsSupportingPointsToSet;

/**
 * An allocation sites that is an Integer. For use with points-to analysis
 * numbered allocation sites.
 * 
 * @author Haggai Eran
 */
public class SparkAllocationSiteSet implements AllocationSiteSet {
	public final EqualsSupportingPointsToSet allocSite;
	
	SparkAllocationSiteSet(EqualsSupportingPointsToSet allocSite) {
		assert !allocSite.isEmpty();
		
		this.allocSite = allocSite;
	}
	
	@Override
	public int hashCode() {
		return allocSite.pointsToSetHashCode();
	}
	
	@Override
	public String toString() {
		return allocSite.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		SparkAllocationSiteSet other = (SparkAllocationSiteSet) obj;
		return allocSite.pointsToSetEquals(other.allocSite);
	}
	
	@Override
	public boolean intersects(AllocationSiteSet obj) {
		SparkAllocationSiteSet other = (SparkAllocationSiteSet) obj;
		return allocSite.hasNonEmptyIntersection(other.allocSite);
	}
}
