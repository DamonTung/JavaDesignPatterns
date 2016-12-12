/**
 * 
 */
package com.damontung.proxy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.proxy.Image;
import com.damontung.proxy.ProxyImage;

/**
 * @author guangzhd
 *
 */
public class ProxyImageTest {

	@Test
	public void test() {
		Image image = new ProxyImage("test.png");
		image.display();

		System.out.println("Second time: ");

		image.display();
	}

}
