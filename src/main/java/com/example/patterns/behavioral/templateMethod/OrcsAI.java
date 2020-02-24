package com.example.patterns.behavioral.templateMethod;

public class OrcsAI extends GameAI{
    public void buildStructures()
    {
        // Строить фермы, затем бараки, а потом цитадель.
    }
    public void buildUnits()
    {
        // Построить раба и добавить в группу
        // разведчиков.

        // Построить пехотинца и добавить в группу
        // воинов.
    }
    public void sendScouts(String position)
    {
        // Отправить разведчиков на позицию.
    }
    public void sendWarriors(String position)
    {
        // Отправить воинов на позицию.
    }
}
