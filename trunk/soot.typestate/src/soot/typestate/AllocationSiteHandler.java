/**
 * 
 */
package soot.typestate;

import soot.Local;
import soot.PointsToAnalysis;
import soot.Unit;
import soot.jimple.DefinitionStmt;
import soot.jimple.NewExpr;
import soot.jimple.spark.sets.EqualsSupportingPointsToSet;

/**
 * Create allocation sites based on Spark analysis results.
 * @author haggai
 *
 */
public class AllocationSiteHandler  {
	private final PointsToAnalysis pta;
	
	public AllocationSiteHandler(PointsToAnalysis pta) {
		this.pta = pta;
	}
	
	public AllocationSiteSet getUseAllocationSites(Unit unit, Local local) {
		EqualsSupportingPointsToSet pts = (EqualsSupportingPointsToSet) pta.reachingObjects(local);
		return new AllocationSiteSet(pts);
	}
	
	public AllocationSiteSet getDefAllocationSite(DefinitionStmt def) {
		if (!(def.getRightOp() instanceof NewExpr))
			return null;
		
		Local local = (Local) def.getLeftOp();
		EqualsSupportingPointsToSet pts = (EqualsSupportingPointsToSet) pta.reachingObjects(local);
		return new AllocationSiteSet(pts);
	}
}
