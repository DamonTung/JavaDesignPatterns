/**
 * 
 */
package com.damontung.abstractfactory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.abstractfactory.AbstractFactory;
import com.damontung.abstractfactory.Color;
import com.damontung.abstractfactory.FactoryProducer;
import com.damontung.abstractfactory.Shape;

/**
 * @author guangzhd
 *
 */
public class FactoryProducerTest {

	@Test
	public void test() {
		// fail("Not yet implemented"); // TODO
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		Shape shape1 = shapeFactory.getShape("Rectangle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Circle");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		Color color1 = colorFactory.getColor("Red");
		color1.fill();
		Color color2 = colorFactory.getColor("Blue");
		color2.fill();
		Color color3 = colorFactory.getColor("Green");
		color3.fill();
	}

}
