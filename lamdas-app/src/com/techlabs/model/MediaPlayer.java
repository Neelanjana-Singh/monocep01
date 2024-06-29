package com.techlabs.model;

public interface MediaPlayer {
	public void start();
	//public void stop();
	//public void supportedFiles();
	
	default void stop()
	{
		System.out.println("Media player stopped");
	}
	static void supportedFiles()
	{
		System.out.println("Supported File List--> .mp3 ,.mp4 .vob,.mpeg,.aac,.wav");
	}
	

}
