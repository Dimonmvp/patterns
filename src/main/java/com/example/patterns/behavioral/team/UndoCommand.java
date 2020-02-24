package com.example.patterns.behavioral.team;

import org.w3c.dom.Text;

public class UndoCommand extends Command{
    public UndoCommand(Application app, Editor editor, Text backup) {
        super(app, editor, backup);
    }

    public boolean execute()
    {
//        app.undo();
        return false;
    }
}
