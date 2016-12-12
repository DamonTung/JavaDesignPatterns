/**
 * 
 */
package com.damontung.visitor;

/**
 * @author guangzhd
 *
 */
public class Keyboard implements ComputerPart {

	/* (non-Javadoc)
	 * @see com.damontung.visitor.ComputerPart#accept(com.damontung.visitor.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);

	}

}
