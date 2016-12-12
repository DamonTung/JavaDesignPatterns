/**
 * 
 */
package com.damontung.interpreter;

/**
 * @author guangzhd
 *
 */
public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.interpreter.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
