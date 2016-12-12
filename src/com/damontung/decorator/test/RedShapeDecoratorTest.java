/**
 * 
 */
package com.damontung.decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.decorator.Circle;
import com.damontung.decorator.Rectangle;
import com.damontung.decorator.RedShapeDecorator;
import com.damontung.decorator.Shape;

/**
 * @author guangzhd
 *
 */
public class RedShapeDecoratorTest {

	@Test
	public void test() {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Circle with normal border: ");
		circle.draw();

		System.out.println("\nCircle of Red border: ");
		redCircle.draw();

		System.out.println("\nRectangle of Red border: ");
		redRectangle.draw();
	}

}
