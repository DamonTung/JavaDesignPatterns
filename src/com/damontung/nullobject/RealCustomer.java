/**
 * 
 */
package com.damontung.nullobject;

/**
 * @author guangzhd
 *
 */
public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.nullobject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {

		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.nullobject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {

		return name;
	}

}
