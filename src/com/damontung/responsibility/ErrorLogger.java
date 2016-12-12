/**
 * 
 */
package com.damontung.responsibility;

/**
 * @author guangzhd
 *
 */
public class ErrorLogger extends AbstractLogger {
	public ErrorLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.responsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Error Console::Logger: " + message);
	}

}
