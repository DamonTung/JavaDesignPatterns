/**
 * 
 */
package com.damontung.intercepting_filter.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.intercepting_filter.AuthenticationFilter;
import com.damontung.intercepting_filter.Client;
import com.damontung.intercepting_filter.DebugFilter;
import com.damontung.intercepting_filter.FilterManager;
import com.damontung.intercepting_filter.Target;

/**
 * @author guangzhd
 *
 */
public class ClientTest {

	@Test
	public void test() {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("Home");
	}

}
