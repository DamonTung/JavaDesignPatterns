/**
 * 
 */
package com.damontung.flyweight.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.damontung.flyweight.Circle;
import com.damontung.flyweight.ShapeFactory;

/**
 * @author guangzhd
 *
 */
public class ShapeFactoryTest {

	@Test
	public void test() {

		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	String getRandomColor() {
		String[] colors = { "Red", "Green", "Blue", "White", "Black" };
		return colors[(int) (Math.random() * colors.length)];
	}

	int getRandomX() {
		return (int) (Math.random() * 100);
	}

	int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
