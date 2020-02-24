package com.example.patterns.structural.decorator;

public class ApplicationsConfiguration {
    public void configurationExample()
    {
        FileDataSource source = new FileDataSource("Salary.dat");

        SalaryManager logger = new SalaryManager(source);

    }
}
