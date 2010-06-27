package soot.typestate;

import soot.jimple.spark.pag.Node;
import soot.jimple.spark.sets.EmptyPointsToSet;
import soot.jimple.spark.sets.EqualsSupportingPointsToSet;
import soot.jimple.spark.sets.P2SetVisitor;
import soot.jimple.spark.sets.PointsToSetInternal;

/**
 * An allocation sites that is an Integer. For use with points-to analysis
 * numbered allocation sites.
 * 
 * @author Haggai Eran
 */
public class AllocationSiteSet {
	public final EqualsSupportingPointsToSet allocSite;
	
	AllocationSiteSet(EqualsSupportingPointsToSet allocSite) {
		assert !allocSite.isEmpty();
		
		this.allocSite = allocSite;
	}
	
	@Override
	public int hashCode() {
		return allocSite.pointsToSetHashCode();
	}
	
	@Override
	public String toString() {
		 if (allocSite instanceof EmptyPointsToSet)
			return "{}";
		else if (allocSite instanceof PointsToSetInternal) {
			final StringBuffer buffer = new StringBuffer("{");
			PointsToSetInternal pts = (PointsToSetInternal) allocSite;
			pts.forall(new P2SetVisitor() {
				@Override
				public void visit(Node n) {
					buffer.append(n.getNumber() + ", ");
				}
			});
			buffer.append("}");
			return buffer.toString();
		}
		return allocSite.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		AllocationSiteSet other = (AllocationSiteSet) obj;
		return allocSite.pointsToSetEquals(other.allocSite);
	}
	
	public boolean intersects(AllocationSiteSet obj) {
		AllocationSiteSet other = (AllocationSiteSet) obj;
		return allocSite.hasNonEmptyIntersection(other.allocSite);
	}
}
