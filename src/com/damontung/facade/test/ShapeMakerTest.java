/**
 * 
 */
package com.damontung.facade.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.facade.ShapeMaker;

/**
 * @author guangzhd
 *
 */
public class ShapeMakerTest {

	@Test
	public void test() {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
