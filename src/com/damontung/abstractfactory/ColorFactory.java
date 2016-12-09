/**
 * 
 */
package com.damontung.abstractfactory;

/**
 * @author guangzhd
 *
 */
public class ColorFactory extends AbstractFactory {

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
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("Red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("Green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
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
	public
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
