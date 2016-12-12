/**
 * 
 */
package com.damontung.interpreter.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.interpreter.AndExpression;
import com.damontung.interpreter.Expression;
import com.damontung.interpreter.OrExpression;
import com.damontung.interpreter.TerminalExpression;

/**
 * @author guangzhd
 *
 */
public class ExpressionTest {

	@Test
	public void test() {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));

		System.out.println("John is male? " + isMale.interpret("hohn"));
		System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("arried Julie"));

	}

	Expression getMaleExpression() {
		Expression rebert = new TerminalExpression("Rebert");
		Expression john = new TerminalExpression("John");

		return new OrExpression(rebert, john);
	}

	Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");

		return new AndExpression(julie, married);
	}
}
