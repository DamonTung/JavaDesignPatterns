/**
 * 
 */
package com.damontung.responsibility;

/**
 * @author guangzhd
 *
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.responsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}

}
