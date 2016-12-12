/**
 * 
 */
package com.damontung.responsibility;

/**
 * @author guangzhd
 *
 */
public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.responsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);

	}

}
