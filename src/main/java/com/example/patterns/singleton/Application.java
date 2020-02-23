package com.example.patterns.singleton;

public class Application {
    Database foo = Database.getInstances();
    foo.query("select ...");

    Database bar = Database.getInstances();
    bar.query("SELECT ...")
}
