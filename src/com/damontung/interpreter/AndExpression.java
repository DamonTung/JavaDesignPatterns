/**
 * 
 */
package com.damontung.interpreter;

/**
 * @author guangzhd
 *
 */
public class AndExpression implements Expression {
	private Expression exp1;
	private Expression exp2;

	public AndExpression(Expression exp1, Expression exp2) {
		super();
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.interpreter.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		return exp1.interpret(context) && exp2.interpret(context);
	}

}
