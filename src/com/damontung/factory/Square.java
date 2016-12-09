/**
 * 
 */
package com.damontung.factory;

/**
 * @author guangzhd
 *
 */
public class Square implements Shape {

	/**
	 * 
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.factorypattern.Shape#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
