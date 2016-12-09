/**
 * 
 */
package com.damontung.abstractfactory;

/**
 * @author guangzhd
 *
 */
public class ShapeFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.damontung.abstractfactorypattern.AbstractFactory#getColor(java.lang.
	 * String)
	 */
	@Override
	public
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.damontung.abstractfactorypattern.AbstractFactory#getShape(java.lang.
	 * String)
	 */
	@Override
	public Shape getShape(String shapeType) {

		if (shapeType == null)
			return null;
		if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
