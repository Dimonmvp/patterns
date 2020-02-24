package com.example.patterns.behavioral.condition;

abstract public class State {
    protected AudioPlayer player;

    public State(AudioPlayer player) {
        this.player = player;
    }
    abstract public void clickLock();
    abstract public void clickPlay();
    abstract public void clickNext();
    abstract public void clickPrevious();
}
