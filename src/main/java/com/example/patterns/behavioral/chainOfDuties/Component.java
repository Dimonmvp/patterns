package com.example.patterns.behavioral.chainOfDuties;


abstract public class Component implements ComponentWithContextualHelp {
    public String tooltipText;
    public Container container;
    public void showHelp()
    {
        if(tooltipText!=null)
        {
            //Показ подсказки
        }
        else
        {
            container.showHelp();
        }
    }
}
