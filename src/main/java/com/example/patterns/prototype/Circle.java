package com.example.patterns.prototype;

public class Circle extends Shape{
    int radius;

    public Circle() {
    }

    public Circle(Circle source)
    {
        super(source);
        this.radius=source.radius;
    }

    @Override
    Shape myClone() {
        return new Circle(this);
    }
}
