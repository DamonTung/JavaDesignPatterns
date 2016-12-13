/**
 * 
 */
package com.damontung.business_delegate;

/**
 * @author guangzhd
 *
 */
public class JMSService implements BusinessService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.businessdelegate.BusinessService#doProcessing()
	 */
	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service.");
	}

}
