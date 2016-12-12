/**
 * 
 */
package com.damontung.state;

/**
 * @author guangzhd
 *
 */
public class Context {
	private State state;

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	public Context() {
		state = null;
	}

}
