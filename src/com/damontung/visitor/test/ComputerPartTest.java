/**
 * 
 */
package com.damontung.visitor.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.visitor.Computer;
import com.damontung.visitor.ComputerPart;
import com.damontung.visitor.ComputerPartDisplayVisitor;
import com.damontung.visitor.ComputerPartVisitor;
import com.damontung.visitor.Keyboard;
import com.damontung.visitor.Mouse;

/**
 * @author guangzhd
 *
 */
public class ComputerPartTest {

	@Test
	public void test() {
		ComputerPart computerPart = new Computer();
		computerPart.accept(new ComputerPartDisplayVisitor());

		ComputerPart mouse = new Mouse();
		mouse.accept(new ComputerPartDisplayVisitor());

		ComputerPart keyBoard = new Keyboard();
		keyBoard.accept(new ComputerPartDisplayVisitor());
	}

}
