/**
 * 
 */
package com.damontung.flyweight;

import java.util.HashMap;

/**
 * @author guangzhd
 *
 */
public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating Circle of color: " + color);
		}
		return circle;
	}
}
