package com.example.patterns.prototype;

public class Rectangle extends Shape{

    int width;
    int height;

    public Rectangle() {
    }

    Rectangle(Rectangle source)
    {
        super(source);
        this.width=source.width;
        this.height=source.height;
    }

    @Override
    Shape myClone() {
        return new Rectangle(this);
    }
}
