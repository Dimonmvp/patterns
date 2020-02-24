package com.example.patterns.behavioral.condition;

public class LockedState extends State{
    public LockedState(AudioPlayer player) {
        super(player);
    }

    public void clickLock()
    {
//        if (player.playing)
//        {
//            player.changeState(new PlayingState(player));
//        }
//        else
//        {
//            player.changeState(new ReadyState(player));
//        }
    }

    @Override
    public void clickPlay() {

    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickPrevious() {

    }
}
