/**
 * 
 */
package com.damontung.factory;

/**
 * @author guangzhd
 *
 */
public class ShapeFactory {

	/**
	 * 
	 */
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	public Shape getShape(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (type.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;

	}
}
