/**
 * 
 */
package com.damontung.nullobject.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.nullobject.AbstractCustomer;
import com.damontung.nullobject.CustomerFactory;

/**
 * @author guangzhd
 *
 */
public class CustomerFactoryTest {

	@Test
	public void test() {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Damon");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Julie");

		System.out.println("Customers: ");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
