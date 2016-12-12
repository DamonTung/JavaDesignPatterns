/**
 * 
 */
package com.damontung.responsibility.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.responsibility.AbstractLogger;
import com.damontung.responsibility.ConsoleLogger;
import com.damontung.responsibility.ErrorLogger;
import com.damontung.responsibility.FileLogger;

/**
 * @author guangzhd
 *
 */
public class AbstractLoggerTest {

	@Test
	public void test() {
		AbstractLogger abstractLogger = getChainOfLoggers();

		abstractLogger.logMessage(AbstractLogger.INFO, "This is an infomation.");

		abstractLogger.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		abstractLogger.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

	AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}
}
