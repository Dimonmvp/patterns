package com.example.patterns.structural.lightweight;

public class TreeType {
    public String name;
    public String color;
    public String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int canvas,int x,int y)
    {
        // 1. Создать картинку данного типа, цвета и текстуры.
        // 2. Нарисовать картинку на холсте в позиции X, Y.
    }

    public TreeType find(String name, String color, String texture) {
        return null;
    }

    public void add(TreeType type) {

    }
}
