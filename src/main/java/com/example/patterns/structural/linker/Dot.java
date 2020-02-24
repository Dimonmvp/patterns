package com.example.patterns.structural.linker;

public class Dot implements Graphic{
    int x,y;
    public Dot()
    {

    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x +=x;
        this.y +=y;
    }

    @Override
    public void draw() {
        // Нарисовать точку в координате X, Y.
    }
}
