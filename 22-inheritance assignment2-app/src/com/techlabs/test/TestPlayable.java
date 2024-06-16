package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Audio;
import com.techlabs.model.Playable;
import com.techlabs.model.Video;

public class TestPlayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter title for audio: ");
	        String audioTitle = scanner.nextLine();
	        Playable audio = new Audio(audioTitle);

	        System.out.print("Enter title for video: ");
	        String videoTitle = scanner.nextLine();
	        System.out.print("Enter resolution for video: ");
	        String resolution = scanner.nextLine();
	        Playable video = new Video(videoTitle, resolution);

	        
	        System.out.println("\nTesting audio:");
	        audio.play();
	        audio.pause();
	        audio.stop();

	        System.out.println("\nTesting video:");
	        video.play();
	        video.pause();
	        video.stop();

	        scanner.close();
	}

}
