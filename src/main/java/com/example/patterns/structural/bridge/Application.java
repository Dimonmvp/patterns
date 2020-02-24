package com.example.patterns.structural.bridge;

public class Application {
    Tv tv =new Tv();
    Remote remote = new Remote(tv);
    Radio radio = new Radio();


    public Application() {
        remote.togglePower();
        remote = new AdvancedRemote(radio);
    }
}
