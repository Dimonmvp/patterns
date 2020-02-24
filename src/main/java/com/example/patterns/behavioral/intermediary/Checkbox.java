package com.example.patterns.behavioral.intermediary;

public class Checkbox extends Component{
    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    public void check()
    {
        dialog.myNotify(this, "check");
    }
}
