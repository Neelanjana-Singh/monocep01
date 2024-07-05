package com.techlabs.commandPattern.model;

public class OnCommand implements ICommand {
    private Television tv;

    public OnCommand(Television tv) {
        this.tv = tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public Television getTv() {
        return tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}