package com.example.patterns.behavioral.condition;

public class AudioPlayer {
     public State state;
     public String UI,volume,playlist,currentSong;

    public AudioPlayer() {
    }

    public AudioPlayer(State state, String UI, String volume, String playlist, String currentSong) {
        this.state = state;
        this.UI = UI;
        this.volume = volume;
        this.playlist = playlist;
        this.currentSong = currentSong;
    }
    public void changeState(State state)
    {
        this.state = state;
    }
    public void clickLock()
    {
        state.clickLock();
    }
    public void clickPlay()
    {
        state.clickPlay();
    }
    public void clickNext()
    {
        state.clickNext();
    }
    public void clickPrevious()
    {
        state.clickPrevious();
    }
    public void startPlayback()
    {

    }
    public void stopPlayback()
    {

    }
    public void nextSong()
    {

    }
    public void previousSong()
    {

    }
    public void fastForward(String time)
    {

    }
    public void rewind(String time)
    {

    }
}
