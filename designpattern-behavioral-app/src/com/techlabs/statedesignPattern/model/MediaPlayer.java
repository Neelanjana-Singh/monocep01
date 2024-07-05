package com.techlabs.statedesignPattern.model;

public class MediaPlayer {
    private IMediaPlayer currentState;

    public MediaPlayer() {
        this.currentState = new StoppedState(); // Default state
    }

    public void setState(IMediaPlayer state) {
        this.currentState = state;
    }

    public void pressPlay() {
        currentState.play(this);
    }

    public void pressStop() {
        currentState.stop(this);
    }
}
