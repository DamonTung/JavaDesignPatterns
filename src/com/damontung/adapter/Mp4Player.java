/**
 * 
 */
package com.damontung.adapter;

/**
 * @author guangzhd
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing MP4 file. Name: " + fileName);

	}

}
