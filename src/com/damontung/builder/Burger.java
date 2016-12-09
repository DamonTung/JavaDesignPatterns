/**
 * 
 */
package com.damontung.builder;

/**
 * @author guangzhd
 *
 */
public abstract class Burger implements Item {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.builder.Item#price()
	 */
	@Override
	public abstract float price();

}
