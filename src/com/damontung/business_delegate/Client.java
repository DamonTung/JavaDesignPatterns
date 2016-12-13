/**
 * 
 */
package com.damontung.business_delegate;

/**
 * @author guangzhd
 *
 */
public class Client {
	BusinessDelegate businessDelegate;

	public Client(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	public void doTask() {
		businessDelegate.doTask();
	}
}
