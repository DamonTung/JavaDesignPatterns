/**
 * 
 */
package com.damontung.template.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.template.Cricket;
import com.damontung.template.Football;
import com.damontung.template.Game;

/**
 * @author guangzhd
 *
 */
public class GameTest {

	@Test
	public void test() {
		Game game = new Cricket();
		game.play();

		Game game2 = new Football();
		game2.play();
	}

}
