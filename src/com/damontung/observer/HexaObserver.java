/**
 * 
 */
package com.damontung.observer;

/**
 * @author guangzhd
 *
 */
public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
	}

}
