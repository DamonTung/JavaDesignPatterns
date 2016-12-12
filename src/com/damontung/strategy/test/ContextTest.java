/**
 * 
 */
package com.damontung.strategy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.strategy.Context;
import com.damontung.strategy.OperationAdd;
import com.damontung.strategy.OperationMultiply;
import com.damontung.strategy.OperationSubstract;

/**
 * @author guangzhd
 *
 */
public class ContextTest {

	@Test
	public void test() {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		Context context2 = new Context(new OperationMultiply());
		System.out.println("23 * 5 = " + context2.executeStrategy(23, 5));

		Context context3 = new Context(new OperationSubstract());
		System.out.println("23 - 8 = " + context3.executeStrategy(23, 8));
	}

}
