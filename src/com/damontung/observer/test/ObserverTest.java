/**
 * 
 */
package com.damontung.observer.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.observer.BinaryObserver;
import com.damontung.observer.HexaObserver;
import com.damontung.observer.OctalObserver;
import com.damontung.observer.Subject;

/**
 * @author guangzhd
 *
 */
public class ObserverTest {

	@Test
	public void test() {
		Subject subject = new Subject();

		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);

		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
