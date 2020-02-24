package com.example.patterns.behavioral.condition;

public class PlayingState  extends State{

    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickLock() {
//        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }

    @Override
    public void clickNext() {
//        if (event.doubleclick)
//            player.nextSong();
//        else
//            player.fastForward("");
    }

    @Override
    public void clickPrevious() {
//        if (event.doubleclick)
//            player.previous();
//        else
//            player.rewind(5);
    }
}
