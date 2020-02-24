package com.example.patterns.behavioral.team;

public class PasteCommand extends Command{
    public boolean execute()
    {
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }

}
