/**
 * 
 */
package com.damontung.observer;

/**
 * @author guangzhd
 *
 */
public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
