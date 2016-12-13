/**
 * 
 */
package com.damontung.business_delegate;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * @author guangzhd
 *
 */
public class BusinessDelegate {
	private BusinessLookUP lookUPService = new BusinessLookUP();
	private BusinessService businessService;
	private String serviceType;

	/**
	 * @param serviceType
	 *            the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookUPService.getBusinessService(serviceType);
		businessService.doProcessing();
	}

}
