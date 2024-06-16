package com.techlabs.model;

public class Video extends Playable {
	private String title;
	private String resolution;
	public Video(String title, String resolution) {
		super();
		this.title = title;
		this.resolution = resolution;
	}
	@Override
	public void play() {
		
		 System.out.println("Playing video: " + title + " at " + resolution + " resolution");
	}
	@Override
	public void pause() {
		System.out.println("Pausing audio: " + title);
		
	}
	@Override
	public void stop() {
		System.out.println("Stopping audio: " + title);
		
	}

}
