package com.example.patterns.generating.factoryMethod;

public class Application {
    Dialog dialog;
    void initialize() throws Exception {
        String string = new String("Windows");
        if(string=="Windows")
        {
            dialog = new WindowsDialog();
        }
        else if(string=="Web")
        {
            dialog = new WebDialog();
        }
        else
            throw new Exception("Error! UNKNOWN OS");
    }
}
