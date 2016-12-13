/**
 * 
 */
package com.damontung.intercepting_filter;

/**
 * @author guangzhd
 *
 */
public class Target {
	public void execute(String request) {
		System.out.println("Target Request: " + request);
	}
}
