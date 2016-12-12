/**
 * 
 */
package com.damontung.iterator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.iterator.Iterator;
import com.damontung.iterator.NameRespository;

/**
 * @author guangzhd
 *
 */
public class NameRespositoryTest {

	@Test
	public void test() {
		NameRespository nameRespository = new NameRespository();

		for (Iterator iterator = nameRespository.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println("Name: " + name);
		}
	}

}
