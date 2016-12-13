/**
 * 
 */
package com.damontung.service_locator;

/**
 * @author guangzhd
 *
 */
public class Service1 implements Service {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.service_locator.Service#getName()
	 */
	@Override
	public String getName() {
		return "Service1";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.service_locator.Service#execute()
	 */
	@Override
	public void execute() {
		System.out.println("Exectuing Service1 ...");
	}

}
