/**
 * 
 */
package soot.typestate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import soot.Local;
import soot.PointsToAnalysis;
import soot.Unit;
import soot.Value;
import soot.ValueBox;
import soot.jimple.DefinitionStmt;
import soot.jimple.FieldRef;
import soot.jimple.NewExpr;
import soot.jimple.spark.pag.Node;
import soot.jimple.spark.sets.EqualsSupportingPointsToSet;
import soot.jimple.spark.sets.P2SetVisitor;
import soot.jimple.spark.sets.PointsToSetInternal;

/**
 * Create allocation sites based on Spark analysis results.
 * @author haggai
 *
 */
public class SparkAllocationSiteHandler implements AllocationSiteHandler {
	private final PointsToAnalysis pta;
	
	public SparkAllocationSiteHandler(PointsToAnalysis pta) {
		this.pta = pta;
	}
	
	@Override
	public AllocationSiteSet getUseAllocationSites(Unit unit, Local local) {
		EqualsSupportingPointsToSet pts = (EqualsSupportingPointsToSet) pta.reachingObjects(local);
		return new SparkAllocationSiteSet(pts);
	}
	
	@Override
	public AllocationSiteSet getDefAllocationSite(DefinitionStmt def) {
		if (!(def.getRightOp() instanceof NewExpr))
			return null;
		
		Local local = (Local) def.getLeftOp();
		EqualsSupportingPointsToSet pts = (EqualsSupportingPointsToSet) pta.reachingObjects(local);
		return new SparkAllocationSiteSet(pts);
	}
}
