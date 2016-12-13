/**
 * 
 */
package com.damontung.business_delegate.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.business_delegate.BusinessDelegate;
import com.damontung.business_delegate.Client;

/**
 * @author guangzhd
 *
 */
public class BusinessDelegateTest {

	@Test
	public void test() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("MJ");
		client.doTask();
	}

}
