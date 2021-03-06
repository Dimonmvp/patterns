package com.example.patterns.generating.singleton;

public class Database {
    // Поле для хранения объекта-одиночки должно быть объявлено
    // статичным.
    private static Database instances;

    // Конструктор одиночки всегда должен оставаться приватным,
    // чтобы клиенты не могли самостоятельно создавать
    // экземпляры этого класса через оператор `new`.
    private Database()
    {
        // Здесь может жить код инициализации подключения к
        // серверу баз данных.
        // ...
    }
    public static Database getInstances()
    {
        if (Database.instances == null)
        Database.instances = new Database();
        return Database.instances;
    }
    // Наконец, любой класс одиночки должен иметь какую-то
    // полезную функциональность, которую клиенты будут
    // запускать через полученный объект одиночки.

    public void query(String sql)
    {
        // Все запросы к базе данных будут проходить через этот
        // метод. Поэтому имеет смысл поместить сюда какую-то
        // логику кеширования.
        // ...
    }
}
