package com.example.patterns.generating.abstractFactory;

public class Application
{
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory=factory;
    }
    void createUI()
    {
        this.button=factory.createButton();
    }
    void paint()
    {
        button.paint();
    }
}
