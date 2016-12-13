/**
 * 
 */
package com.damontung.service_locator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.service_locator.Service;
import com.damontung.service_locator.ServiceLocator;

/**
 * @author guangzhd
 *
 */
public class ServiceLocatorTest {

	@Test
	public void test() {
		Service service = ServiceLocator.getService("SErvice1");
		service.execute();

		service = ServiceLocator.getService("Service2");
		service.execute();

		service = ServiceLocator.getService("Service1");
		service.execute();

		service = ServiceLocator.getService("Service2");
		service.execute();

	}

}
