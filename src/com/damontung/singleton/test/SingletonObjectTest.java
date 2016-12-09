package com.damontung.singleton.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.singleton.SingletonObject;

public class SingletonObjectTest {

	@Test
	public void test() {
		// fail("Not yet implemented"); // TODO
		SingletonObject singletonObject = SingletonObject.getInstance();
		singletonObject.showMessage();
	}

}
