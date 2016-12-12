/**
 * 
 */
package com.damontung.responsibility;

import java.io.WriteAbortedException;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * @author guangzhd
 *
 */
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	protected AbstractLogger nextLoger;

	public void setNextLogger(AbstractLogger logger) {
		this.nextLoger = logger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLoger != null) {
			nextLoger.logMessage(level, message);
		}
	}

	protected abstract void write(String message);
}
