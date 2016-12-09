/**
 * 
 */
package com.damontung.prototype;

/**
 * @author guangzhd
 *
 */
public class Rectangle extends Shape {

	/**
	 * 
	 */
	public Rectangle() {
		type = "Rectangle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}
