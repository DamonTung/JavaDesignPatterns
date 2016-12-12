/**
 * 
 */
package com.damontung.decorator;

/**
 * @author guangzhd
 *
 */
public class Circle implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.decorator.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Circle::draw() method.");
	}

}
