package com.example.patterns.generating.factoryMethod;

abstract public class Dialog {

    void render()
    {
        Button okButton = createButton();
        okButton.onClick(/*CloseDialog*/);
        okButton.render();
    }

    abstract Button createButton();

}
