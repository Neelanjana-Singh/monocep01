package com.techlabs.statedesignPattern.model;

class StoppedState implements IMediaPlayer {
    public void play(MediaPlayer player) {
        System.out.println("Starting playback.");
        player.setState(new PlayingState());
    }

    public void stop(MediaPlayer player) {
        System.out.println("Already stopped.");
    }
}
