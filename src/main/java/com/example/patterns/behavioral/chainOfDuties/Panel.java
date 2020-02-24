package com.example.patterns.behavioral.chainOfDuties;

public class Panel extends Container{
    public String modalHelpText;

    public void showHelp()
    {
        if(modalHelpText != null)
        {
            // Показать модальное окно с помощью.
        }
        else
        {
            super.showHelp();
        }
    }
}
