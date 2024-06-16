package com.techlabs.model;

public class Audio extends Playable{
	private String title;

	public Audio(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("Playing audio: " + title);
		
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
