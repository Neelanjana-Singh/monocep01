package com.techlabs.model;

public class PodcastPlayer implements MediaPlayer{
	@Override
	public void start() {
		System.out.println("Podcast Player Started");
		
	}

	@Override
	public void stop() {
		System.out.println("podcast Player Stopped");
		
	}

//	@Override
//	public void supportedFiles() {
//		System.out.println("Supported File List--> .mp3 ,.mp4 .vob,.mpeg,.aac,.wav");
//		
//
//}
}
