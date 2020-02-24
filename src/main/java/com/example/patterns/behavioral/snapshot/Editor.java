package com.example.patterns.behavioral.snapshot;

public class Editor {
    private String text,curX,curY,selectionWidth;

    public Editor() {
    }

    public Editor(String text, String curX, String curY, String selectionWidth) {
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCurX() {
        return curX;
    }

    public void setCurX(String curX) {
        this.curX = curX;
    }

    public String getCurY() {
        return curY;
    }

    public void setCurY(String curY) {
        this.curY = curY;
    }

    public String getSelectionWidth() {
        return selectionWidth;
    }

    public void setSelectionWidth(String selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public void setCursor(String curX, String curY) {
        this.curX=curX;
        this.curY=curY;
    }

    public Snapshot createSnapshot() {
        return null;
    }
}
