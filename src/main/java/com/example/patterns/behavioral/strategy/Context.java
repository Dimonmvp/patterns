package com.example.patterns.behavioral.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }
    public void executeStrategy(int a,int b)
    {
        strategy.execute(a, b);
    }
}
