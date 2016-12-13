/**
 * 
 */
package com.damontung.front_controller;

/**
 * @author guangzhd
 *
 */
public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		this.studentView = new StudentView();
		this.homeView = new HomeView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("student")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
