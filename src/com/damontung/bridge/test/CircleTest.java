/**
 * 
 */
package com.damontung.bridge.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.bridge.Circle;
import com.damontung.bridge.GreenCircle;
import com.damontung.bridge.RedCircle;
import com.damontung.bridge.Shape;

/**
 * @author guangzhd
 *
 */
public class CircleTest {

	@Test
	public void test() {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		redCircle.draw();

		Shape greenCircle = new Circle(50, 80, 80, new GreenCircle());
		greenCircle.draw();
	}

}
