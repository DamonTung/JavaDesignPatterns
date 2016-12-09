/**
 * 
 */
package com.damontung.adapter.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.adapter.AudioPlayer;

/**
 * @author guangzhd
 *
 */
public class AudioPlayerTest {

	@Test
	public void test() {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp5", "111.mp5");
		audioPlayer.play("Mp4", "你的名字.mp4");
		audioPlayer.play("vlc", "hhhh.vlc");
		audioPlayer.play("mp3", "wind.mp3");
	}

}
