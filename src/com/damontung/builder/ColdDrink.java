/**
 * 
 */
package com.damontung.builder;

/**
 * @author guangzhd
 *
 */
public abstract class ColdDrink implements Item {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.builder.Item#packing()
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
