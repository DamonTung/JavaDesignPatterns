/**
 * 
 */
package com.damontung.flyweight;

/**
 * @author guangzhd
 *
 */
public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		super();
		this.color = color;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.flyweight.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle::draw(). [Color: " + color + ", x: " + x + ", y: " + y + "]");
	}

}
