/**
 * 
 */
package com.damontung.factory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.factory.Shape;
import com.damontung.factory.ShapeFactory;

/**
 * @author guangzhd
 *
 */
public class ShapeFactoryTest {

	@Test
	public void test() {
		// fail("Not yet implemented"); // TODO
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();

		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();

		Shape square = shapeFactory.getShape("Square");
		square.draw();
	}

}
