/**
 * 
 */
package soot.typestate.automata;

import soot.SootMethod;

/**
 * @author haggai
 *
 */
public class BranchedTransitionKey {
	private final SootMethod method;
	private final boolean returnValue;
	
	public BranchedTransitionKey(SootMethod method, boolean returnValue) {
		this.method = method;
		this.returnValue = returnValue;
	}
	
	public SootMethod getMethod() {
		return method;
	}
	
	public boolean getReturnValue() {
		return returnValue;
	}
	
	@Override
	public int hashCode() {
		return method.hashCode() + Boolean.valueOf(returnValue).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BranchedTransitionKey) {
			BranchedTransitionKey other = (BranchedTransitionKey) obj;
			return other.method.equals(method) && other.returnValue == returnValue;
		}
		return false;
	}
}
