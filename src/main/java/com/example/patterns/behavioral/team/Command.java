package com.example.patterns.behavioral.team;

import org.w3c.dom.Text;

abstract public class Command {
    protected Application app;
    protected Editor editor;
  //protected Text backup;

    public Command(Application app, Editor editor, Text backup) {
        this.app = app;
        this.editor = editor;
  //    this.backup = backup;
    }
    public void saveBackup()
    {
  //    backup = editor.text;
    }
    public void undo()
    {
  //    editor.text = backup;
    }
    abstract public boolean execute();
}
