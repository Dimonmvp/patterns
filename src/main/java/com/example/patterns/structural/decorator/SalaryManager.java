package com.example.patterns.structural.decorator;

public class SalaryManager {
    DataSource source;

    public SalaryManager(DataSource dataSource) {
        this.source = dataSource;
    }

    public String load()
    {
        return source.readData();
    }
    public void save()
    {
        source.writeData("SalaryRecords");
    }
    // ...Остальные полезные методы...
}
