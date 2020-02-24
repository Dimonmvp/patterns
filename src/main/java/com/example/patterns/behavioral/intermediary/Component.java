package com.example.patterns.behavioral.intermediary;

public class Component {
    public Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }
    public void Click()
    {
        dialog.myNotify(this,"click");
    }
    public void keyPress()
    {
        dialog.myNotify(this,"keyPress");
    }
}
