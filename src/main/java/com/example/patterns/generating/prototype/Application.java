package com.example.patterns.generating.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {
    List<Shape> shapes = new ArrayList<>();

    public Application()
    {
        Circle circle = new Circle();
        circle.x=10;
        circle.y=10;
        circle.radius=20;
        shapes.add(circle);

        Circle anotherCircle = (Circle)circle.myClone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width=10;
        rectangle.height=20;
        shapes.add(rectangle);
    }
    public void businessLogic()
    {
        ArrayList <Shape> shapesCopy = new ArrayList<>();
        for (Shape s:shapes) {
            shapesCopy.add(s.myClone());
        }

    }
}
