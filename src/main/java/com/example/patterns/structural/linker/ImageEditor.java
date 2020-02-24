package com.example.patterns.structural.linker;

import java.util.ArrayList;

public class ImageEditor {
    CompoundGraphic all = new CompoundGraphic();
    public void load()
    {
        all.add(new Dot(1,2));
        all.add(new Circle(5,3,10));
    }
    public void groupSelected(Graphic components)
    {
        CompoundGraphic group = new CompoundGraphic();
        group.add(components);
        all.remove(components);
        all.add(group);
        // Все компоненты будут отрисованы.
        all.draw();

    }
}
