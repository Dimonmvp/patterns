package com.example.patterns.structural.lightweight;

public class TreeFactory {
    static TreeType treeTypes;

    public static TreeType getTreeType(String name, String color, String texture)
    {
        TreeType type = treeTypes.find(name,color,texture);
        if (type==null)
        {
            type = new TreeType(name, color, texture);
            treeTypes.add(type);
        }
        return type;
    }
}
