/**
 * 
 */
package com.damontung.composite_entity.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.composite_entity.Client;

/**
 * @author guangzhd
 *
 */
public class ClientTest {

	@Test
	public void test() {
		Client client = new Client();
		client.setData("Test", "Zhang jiang");
		client.printData();

		client.setData("Test2", "Jin qiao");
		client.printData();

	}

}
