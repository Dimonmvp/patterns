package com.example.patterns.behavioral.templateMethod;

public abstract class GameAI {
    public void run()
    {
        collectResources();
//        buildNewStructures();
//        buildUnits();
//        attack();
    }
    public void collectResources()
    {
        //цикл
    }
    abstract public void buildStructures();
    abstract public void buildUnits();
    public void attack()
    {
//        enemy=ClosestEnemy();
//        if (enemy == null)
//            sendScouts(map.center);
//        else
//            sendWarriors(enemy.position);
    }

    abstract public void sendScouts(String  position);
    abstract public void sendWarriors(String position);
}
