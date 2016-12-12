/**
 * 
 */
package com.damontung.memento;

/**
 * @author guangzhd
 *
 */
public class Memento {
	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

}
