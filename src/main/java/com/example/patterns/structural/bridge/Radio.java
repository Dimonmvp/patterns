package com.example.patterns.structural.bridge;

public class Radio implements Device {

    @Override
    public boolean isEnabled() {
        //Реализация Radio
        return false;
    }

    @Override
    public void enable() {
        //Реализация Radio
    }

    @Override
    public void disable() {
        //Реализация Radio
    }

    @Override
    public int getVolume() {
        //Реализация Radio
        return 0;
    }

    @Override
    public void setVolume(int percent) {
        //Реализация Radio
    }

    @Override
    public int getChannel() {
        //Реализация Radio
        return 0;
    }

    @Override
    public void setChannel(int channel) {
        //Реализация Radio
    }
}
