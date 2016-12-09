/**
 * 
 */
package com.damontung.prototype;

/**
 * @author guangzhd
 *
 */
public class Square extends Shape {

	/**
	 * 
	 */
	public Square() {
		type = "Square";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
