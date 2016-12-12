/**
 * 
 */
package com.damontung.template;

/**
 * @author guangzhd
 *
 */
public class Football extends Game {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.template.Game#initialize()
	 */
	@Override
	void initialize() {
		System.out.println("Football Game initialized. Starting Game.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.template.Game#startPlay()
	 */
	@Override
	void startPlay() {
		System.out.println("Football Game started. Enjoy the Game.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.template.Game#endPlay()
	 */
	@Override
	void endPlay() {
		System.out.println("Football Game Finished.");

	}

}
