/**
 * 
 */
package com.damontung.prototype;

import java.awt.font.ShapeGraphicAttribute;
import java.util.Hashtable;

/**
 * @author guangzhd
 *
 */
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	public static Shape getShape(String shpeId) {
		Shape cacheShape = shapeMap.get(shpeId);
		return (Shape) cacheShape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
}
