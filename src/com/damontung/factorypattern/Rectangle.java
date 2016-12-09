/**
 * 
 */
package com.damontung.factorypattern;

/**
 * @author guangzhd
 *
 */
public class Rectangle implements Shape {

	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.factorypattern.Shape#draw()
	 */
	@Override
	public void draw() {
		
		System.out.println("Inside Rectangle::draw() method.");
	}

}
