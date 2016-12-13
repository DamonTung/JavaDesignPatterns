/**
 * 
 */
package com.damontung.service_locator;

import java.util.ArrayList;
import java.util.List;

import org.junit.runners.Suite.SuiteClasses;

/**
 * @author guangzhd
 *
 */
public class Cache {
	private List<Service> services;

	public Cache() {
		this.services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (serviceName.equalsIgnoreCase(service.getName())) {
				System.out.println("Returning Cached " + serviceName + " object.");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		boolean exists = false;

		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(newService.getName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}
}
