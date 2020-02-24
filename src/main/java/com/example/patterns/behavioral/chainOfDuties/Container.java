package com.example.patterns.behavioral.chainOfDuties;

import java.util.ArrayList;

abstract public class Container extends Component {
    ArrayList<Component> children = new ArrayList<>();
    public void add(Component child)
    {
        children.add(child);
        child.container=this;
    }

}
