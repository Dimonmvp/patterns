package com.example.patterns.structural.bridge;

public class Tv implements Device{


    @Override
    public boolean isEnabled() {
        //Реализация Tv
        return false;
    }

    @Override
    public void enable() {
        //Реализация Tv
    }

    @Override
    public void disable() {
        //Реализация Tv
    }

    @Override
    public int getVolume() {
        //Реализация Tv
        return 0;
    }

    @Override
    public void setVolume(int percent) {
        //Реализация Tv
    }

    @Override
    public int getChannel() {
        //Реализация Tv
        return 0;
    }

    @Override
    public void setChannel(int channel) {
        //Реализация Tv
    }
}
