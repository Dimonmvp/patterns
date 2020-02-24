package com.example.patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    SquarePegAdapter(SquarePeg peg)
    {
        this.peg=peg;
    }

    public double getRadius()
    {
        return peg.width*Math.sqrt(2)/2;
    }
    public SquarePeg getPeg() {
        return peg;
    }

    public void setPeg(SquarePeg peg) {
        this.peg = peg;
    }
}
