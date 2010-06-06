/**
 * 
 */
package soot.typestate;

import java.util.Collection;

import soot.Unit;
import soot.jimple.DefinitionStmt;

/**
 * Wrapper that returns allocation sites for statements.
 * 
 * @author Haggai Eran
 */
public interface AllocationSiteHandler {
	// Return an allocation site that is defined at this statement.
	AllocationSiteSet getDefAllocationSite(DefinitionStmt def);
	// Return all allocation sites that may be used at this statement.
	AllocationSiteSet getUseAllocationSites(Unit unit);
}
