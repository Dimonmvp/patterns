package com.example.patterns.prototype;

abstract public class Shape {
    int x;
    int y;
    String color;

    public Shape() {

    }

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public Shape(Shape shape)
    {
        this.x=shape.x;
        this.y=shape.y;
        this.color=shape.color;
    }
    abstract Shape myClone();
}
