/**
 * 
 */
package com.damontung.facade;

/**
 * @author guangzhd
 *
 */
public class Square implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.facade.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Square::draw() method.");
	}

}
