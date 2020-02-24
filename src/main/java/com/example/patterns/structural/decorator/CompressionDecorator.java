package com.example.patterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource wrapper) {
        super(wrapper);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
