package com.example.patterns.structural.linker;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    public ArrayList<Graphic> arrayList = new ArrayList<>();

    public void add(Graphic child)
    {
        // Добавить компонент в список дочерних.
    }
    public void remove(Graphic child)
    {
        // Убрать компонент из списка дочерних.
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {
        // 1. Для каждого дочернего компонента:
        //     - Отрисовать компонент.
        //     - Определить координаты максимальной границы.
        // 2. Нарисовать пунктирную границу вокруг всей области.
    }
}
