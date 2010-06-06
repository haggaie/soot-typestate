/**
 * 
 */
package soot.typestate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import soot.Local;
import soot.Unit;
import soot.Value;
import soot.jimple.DefinitionStmt;
import soot.jimple.NewExpr;
import soot.toolkits.scalar.LocalDefs;

/**
 * Finds allocation sites according to local definitions analysis.
 * @author Haggai Eran
 *
 */
public class LocalDefsAllocationSiteHandler implements AllocationSiteHandler {
	private final LocalDefs localDefs;
	private final ExternalAllocationSiteSet externalAllocationSiteSet = new ExternalAllocationSiteSet();
	
	public LocalDefsAllocationSiteHandler(LocalDefs localDefs) {
		this.localDefs = localDefs;
	}
	
	public Collection<AllocationSiteSet> getUseAllocationSitesCollection(Unit unit) {
		final Collection<AllocationSiteSet> allocationSites = new ArrayList<AllocationSiteSet>();
		
		Local local = (Local) unit.getUseBoxes().get(0).getValue();
		// Recursively try to find a local allocation site for the variable,
		// based on reaching definitions analysis in localDefs.
		// Use whatever local definition it finds if no allocation site is found.
		List<Unit> defs = localDefs.getDefsOfAt(local, unit);
		for (Unit def : defs) {
			DefinitionStmt stmt = (DefinitionStmt) def;
			if (stmt.getLeftOp().equivTo(local))
			{
				Value right = stmt.getRightOp();
				if (right instanceof NewExpr)
					allocationSites.add(new UnitsAllocationSiteSet(stmt));
				else if (right instanceof Local)
					allocationSites.addAll(getUseAllocationSitesCollection(def));
				else
					// Consider such definitions as coming from the unknown allocation site.				
					allocationSites.add(externalAllocationSiteSet);
			}
		}
			
		return allocationSites;
	}
	
	@Override
	public AllocationSiteSet getUseAllocationSites(Unit unit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AllocationSiteSet getDefAllocationSite(DefinitionStmt def) {
		if (def.getRightOp() instanceof Local) {
			// ignore
			return null;
		}
		if (def.getRightOp() instanceof NewExpr) {
			// An allocation statement
			// TODO other kinds of allocations (arrays).
			return new UnitsAllocationSiteSet(def);
		}
		else {
			// Consider such definitions as coming from the unknown allocation site.
			return null;
		}
	}
}
