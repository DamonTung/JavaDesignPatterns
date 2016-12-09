/**
 * 
 */
package com.damontung.adapter;

/**
 * @author guangzhd
 *
 */
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advMP;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advMP = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advMP = new Mp4Player();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.adapter.MediaPlayer#play(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advMP.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advMP.playMp4(fileName);
		}

	}

}
