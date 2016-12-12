/**
 * 
 */
package com.damontung.observer;

/**
 * @author guangzhd
 *
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
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
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}

}
