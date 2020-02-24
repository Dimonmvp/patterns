package com.example.patterns.behavioral.snapshot;

public class Snapshot {
    private Editor editor;
    private String text,curX,curY,selectionWidth;

    public Snapshot() {
    }

    public Snapshot(Editor editor, String text, String curX, String curY, String selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }
    public void restore()
    {
        editor.setText(text);
        editor.setCursor(curX, curY);
        editor.setSelectionWidth(selectionWidth);
    }
}
