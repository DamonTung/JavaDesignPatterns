/**
 * 
 */
package com.damontung.adapter;

/**
 * @author guangzhd
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {

		System.out.println("Playing Vlc file. Name: " + fileName);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {

	}

}
