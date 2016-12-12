/**
 * 
 */
package com.damontung.memento.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.memento.CareTaker;
import com.damontung.memento.Originator;

/**
 * @author guangzhd
 *
 */
public class MementoTest {

	@Test
	public void test() {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("state #1");
		originator.setState("state #2");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("state #3");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("state #4");
		System.out.println("Current state: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());

		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());

	}

}
