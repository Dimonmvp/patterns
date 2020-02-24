package com.example.patterns.structural.lightweight;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> trees;
    public void plantTree(int x,int y,String name,String color,String texture)
    {
        TreeType type = TreeFactory.getTreeType(name,color,texture);
        Tree tree = new Tree(x,y,type);
        trees.add(tree);
    }
    public void draw(int canvas)
    {
        for (Tree tree : trees)
        {
            tree.draw(canvas);
        }

    }

}
