/**
 * 
 */
package com.damontung.strategy;

/**
 * @author guangzhd
 *
 */
public class OperationMultiply implements Strategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.strategy.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {

		return num1 * num2;
	}

}
