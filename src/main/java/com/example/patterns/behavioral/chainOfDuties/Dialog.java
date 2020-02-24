package com.example.patterns.behavioral.chainOfDuties;

public class Dialog extends Container{
    public String wikiPageUrl;

    public void showHelp()
    {
        if (wikiPageUrl!=null)
        {
            // Открыть страницу Wiki в браузере.
        }
        else {
            super.showHelp();
        }
    }

}
