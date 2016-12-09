/**
 * 
 */
package com.damontung.prototype;

/**
 * @author guangzhd
 *
 */
public class Circle extends Shape {

	/**
	 * 
	 */
	public Circle() {
		type = "Circle";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.prototype.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");

	}

}
