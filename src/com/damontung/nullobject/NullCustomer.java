/**
 * 
 */
package com.damontung.nullobject;

/**
 * @author guangzhd
 *
 */
public class NullCustomer extends AbstractCustomer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.nullobject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.nullobject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return "Not Available in Customer Database.";
	}

}
