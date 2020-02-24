package com.example.patterns.behavioral.snapshot;

public class Command {
    private Snapshot backUp;

    public void makeBackUp()
    {
        Editor editor = new Editor();
        backUp = editor.createSnapshot();
    }
    public void undo()
    {
        if (backUp!=null)
        {
            backUp.restore();
        }
    }
}
