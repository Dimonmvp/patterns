package com.example.patterns.structural.decorator;

public class FileDataSource implements DataSource{
    String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        // Записать данные в файл.

    }

    @Override
    public String readData() {
        // Прочитать данные из файла.
        return new String();
    }
}
