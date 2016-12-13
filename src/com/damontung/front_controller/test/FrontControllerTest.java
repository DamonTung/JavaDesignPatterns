/**
 * 
 */
package com.damontung.front_controller.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.front_controller.FrontController;

/**
 * @author guangzhd
 *
 */
public class FrontControllerTest {

	@Test
	public void test() {
		FrontController frontController = new FrontController();
		frontController.dispatchRequset("Home");
		frontController.dispatchRequset("Student");
		frontController.dispatchRequset("Test");
	}

}
