/**
 * 
 */
package com.damontung.state.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.state.Context;
import com.damontung.state.StartState;
import com.damontung.state.StopState;

/**
 * @author guangzhd
 *
 */
public class StateTest {

	@Test
	public void test() {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
