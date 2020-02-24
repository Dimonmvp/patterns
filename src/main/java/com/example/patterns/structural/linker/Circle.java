package com.example.patterns.structural.linker;

public class Circle extends Dot{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {

    }
}
