/**
 * 
 */
package com.damontung.template;

/**
 * @author guangzhd
 *
 */
public class Cricket extends Game {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.template.Game#initialize()
	 */
	@Override
	void initialize() {
		System.out.println("Cricket Game initialized. Starting playing.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.template.Game#startPlay()
	 */
	@Override
	void startPlay() {
		System.out.println("Cricket Game started. Enjoy the game.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.template.Game#endPlay()
	 */
	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished.");
	}

}
