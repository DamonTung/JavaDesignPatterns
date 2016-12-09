/**
 * 
 */
package com.damontung.builder;

/**
 * @author guangzhd
 *
 */
public class Pepsi extends ColdDrink {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
