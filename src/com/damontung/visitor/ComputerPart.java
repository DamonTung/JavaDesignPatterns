/**
 * 
 */
package com.damontung.visitor;

/**
 * @author guangzhd
 *
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
