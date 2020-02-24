package com.example.patterns.structural.decorator;

public class Application {

    public void dumbUsageExample() {
        FileDataSource source = new FileDataSource("Some file.dat");
        source.writeData("SalaryRecords");
        // В файл были записаны чистые данные.

        CompressionDecorator source1 = new CompressionDecorator(source);
        source1.writeData("SalaryRecords");
        // В файл были записаны сжатые данные.

        EncryptionDecorator source2 = new EncryptionDecorator(source1);
        // Сейчас в source находится связка из трёх объектов:
        // Encryption > Compression > FileDataSource

        source.writeData("SalaryRecords");
        // В файл были записаны сжатые и зашифрованные данные.
    }

}
