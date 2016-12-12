/**
 * 
 */
package com.damontung.observer;

/**
 * @author guangzhd
 *
 */
public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
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
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}
