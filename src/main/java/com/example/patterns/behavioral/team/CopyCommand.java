package com.example.patterns.behavioral.team;

import org.w3c.dom.Text;

public class CopyCommand extends Command{
    public CopyCommand(Application app, Editor editor, Text backup) {
        super(app, editor, backup);
    }

    public boolean execute()
    {
        saveBackup();
//        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }


}
