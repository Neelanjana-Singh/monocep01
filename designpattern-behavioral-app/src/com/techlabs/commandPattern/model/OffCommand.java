package com.techlabs.commandPattern.model;

public class OffCommand implements ICommand {
    private Television tv;

    public OffCommand(Television tv) {
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
        tv.off();
    }
}
