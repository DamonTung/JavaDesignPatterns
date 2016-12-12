/**
 * 
 */
package com.damontung.mediator.test;

import org.junit.Test;

import com.damontung.mediator.User;

/**
 * @author guangzhd
 *
 */
public class UserTest {

	@Test
	public void test() {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi,John! \n ---from Robert.");
		john.sendMessage("Hello robert! \n ---from John");
	}

}
