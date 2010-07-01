package soot.typestate;

import soot.Local;
import soot.PointsToAnalysis;
import soot.Unit;
import soot.jimple.DefinitionStmt;
import soot.jimple.NewExpr;
import soot.jimple.spark.sets.EqualsSupportingPointsToSet;

/**
 * Create allocation sites based on Spark analysis results.
 */
public class AllocationSiteHandler  {
	/** The soot points-to analysis interface. */
	private final PointsToAnalysis pta;
	
	/**
	 * @param pta Soot's points-to analysis interface. Must use Spark.
	 */
	public AllocationSiteHandler(PointsToAnalysis pta) {
		this.pta = pta;
	}
	
	/**
	 * Given a statement and a local variable, return the allocation site set that the
	 * variable may point to.
	 * 
	 * @param unit the statement.
	 * @param local the variable.
	 */
	public AllocationSiteSet getUseAllocationSites(Unit unit, Local local) {
		EqualsSupportingPointsToSet pts = (EqualsSupportingPointsToSet) pta.reachingObjects(local);
		return new AllocationSiteSet(pts);
	}
	
	/**
	 * Given a definition statement, containing a new allocation, return the allocation site 
	 * associated with this statement.
	 * 
	 * @param def the definition statement.
	 * @return the allocation site, or null if the statement doesn't contain an allocation.
	 */
	public AllocationSiteSet getDefAllocationSite(DefinitionStmt def) {
		if (!(def.getRightOp() instanceof NewExpr))
			return null;
		
		Local local = (Local) def.getLeftOp();
		EqualsSupportingPointsToSet pts = (EqualsSupportingPointsToSet) pta.reachingObjects(local);
		return new AllocationSiteSet(pts);
	}
}
