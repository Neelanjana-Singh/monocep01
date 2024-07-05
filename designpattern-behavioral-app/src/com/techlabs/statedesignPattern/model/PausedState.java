package com.techlabs.statedesignPattern.model;

public class PausedState implements IMediaPlayer {
    public void play(MediaPlayer player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState());
    }

    public void stop(MediaPlayer player) {
        System.out.println("Stopping playback from paused state.");
        player.setState(new StoppedState());
    }
}
