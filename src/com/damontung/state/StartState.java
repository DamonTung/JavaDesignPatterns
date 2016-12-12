/**
 * 
 */
package com.damontung.state;

/**
 * @author guangzhd
 *
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state.");
		context.setState(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Start State";
	}

}
