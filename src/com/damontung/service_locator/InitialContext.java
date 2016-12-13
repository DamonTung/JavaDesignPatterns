/**
 * 
 */
package com.damontung.service_locator;

import static org.hamcrest.CoreMatchers.nullValue;

/**
 * @author guangzhd
 *
 */
public class InitialContext {
	public Object lookUp(String jndiName) {
		if (jndiName.equalsIgnoreCase("service1")) {
			System.out.println("Looking up and creating a new Service1 object.");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("Service2")) {
			System.out.println("Looking up and creating a new Service2 object.");
			return new Service2();
		}

		return null;
	}
}
