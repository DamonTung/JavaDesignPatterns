/**
 * 
 */
package com.damontung.state;

/**
 * @author guangzhd
 *
 */
public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state.");
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
		return "Stop State";
	}

}
