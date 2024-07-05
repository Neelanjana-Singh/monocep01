package com.techlabs.statedesignPattern.test;

import com.techlabs.statedesignPattern.model.MediaPlayer;
import com.techlabs.statedesignPattern.model.PausedState;

public class MediaPlayerTest {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        // Play from stopped state
        player.pressPlay(); 
        player.pressPlay();  
        player.setState(new PausedState());
        player.pressPlay();  
        player.pressStop();  
    }
}
