package com.example.patterns.structural.lightweight;

public class Tree {
    int x,y;
    TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(int canvas)
    {
        type.draw(canvas,this.x,this.y);
    }

    public void add(Tree tree) {

    }
}
