/**
 * 
 */
package com.damontung.business_delegate;

/**
 * @author guangzhd
 *
 */
public class BusinessLookUP {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
