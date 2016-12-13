/**
 * 
 */
package com.damontung.intercepting_filter;

/**
 * @author guangzhd
 *
 */
public class DebugFilter implements Filter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.intercepting_filter.Filter#execute(java.lang.String)
	 */
	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);

	}

}
