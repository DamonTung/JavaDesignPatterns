/**
 * 
 */
package com.damontung.business_delegate;

/**
 * @author guangzhd
 *
 */
public class EJBService implements BusinessService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.businessdelegate.BusinessService#doProcessing()
	 */
	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service.");
	}

}
