package com.example.patterns.behavioral.chainOfDuties;

public class Application {
    public void createUI()
    {
        Dialog dialog = new Dialog();
        dialog.wikiPageUrl ="some/text/";
        Panel panel = new Panel();
        panel.modalHelpText="There is some text here";
        Button ok = new Button();
        ok.tooltipText="This is a button";
        Button cancel = new Button();
        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);
    }
}

