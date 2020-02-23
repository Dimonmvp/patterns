package com.example.patterns.factoryMethod;

public class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
