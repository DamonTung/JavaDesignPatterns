/**
 * 
 */
package com.damontung.prototype.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.prototype.Shape;
import com.damontung.prototype.ShapeCache;

/**
 * @author guangzhd
 *
 */
public class ShapeCacheTest {

	@Test
	public void test() {
		ShapeCache.loadCache();

		Shape shape1 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + shape1.getType());

		Shape shape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + shape2.getType());

		Shape shape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + shape3.getType());
	}

}
