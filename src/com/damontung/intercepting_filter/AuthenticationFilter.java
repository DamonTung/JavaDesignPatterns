/**
 * 
 */
package com.damontung.intercepting_filter;

/**
 * @author guangzhd
 *
 */
public class AuthenticationFilter implements Filter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.intercepting_filter.Filter#execute(java.lang.String)
	 */
	@Override
	public void execute(String request) {
		System.out.println("Authencating request: " + request);

	}

}
