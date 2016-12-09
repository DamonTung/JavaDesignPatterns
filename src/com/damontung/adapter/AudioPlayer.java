/**
 * 
 */
package com.damontung.adapter;

/**
 * @author guangzhd
 *
 */
public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.adapter.MediaPlayer#play(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing MP3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}

	}

}
