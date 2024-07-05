package com.techlabs.statedesignPattern.model;

class PlayingState implements IMediaPlayer {
    public void play(MediaPlayer player) {
        System.out.println("Already playing.");
    }

    public void stop(MediaPlayer player) {
        System.out.println("Stopping playback.");
        player.setState(new StoppedState());
    }
}
