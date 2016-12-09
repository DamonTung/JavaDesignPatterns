/**
 * 
 */
package com.damontung.bridge;

import com.damontung.bridge.*;

/**
 * @author guangzhd
 *
 */
public class Circle extends Shape {
	private int radius;
	private int x;
	private int y;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.prototype.Shape#draw()
	 */
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
