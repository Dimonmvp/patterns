package com.example.patterns.structural.adapter;

public class RoundHole {
    int radius;

    public boolean fits(RoundPeg peg)
    {
        return this.getRadius()>=peg.radius;
    }

    public RoundHole() {
    }

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
