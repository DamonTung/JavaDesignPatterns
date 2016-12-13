/**
 * 
 */
package com.damontung.service_locator;

/**
 * @author guangzhd
 *
 */
public class Service2 implements Service {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.service_locator.Service#getName()
	 */
	@Override
	public String getName() {
		return "Service2";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.service_locator.Service#execute()
	 */
	@Override
	public void execute() {
		System.out.println("Executing Service2 ...");
	}

}
