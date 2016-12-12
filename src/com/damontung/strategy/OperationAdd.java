/**
 * 
 */
package com.damontung.strategy;

/**
 * @author guangzhd
 *
 */
public class OperationAdd implements Strategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.strategy.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
