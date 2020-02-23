package com.example.patterns.builder;

public class Application {
    public void makeCar()
    {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);
        Car car = builder.getCar();

        CarManualBuilder builder1 = new CarManualBuilder();
        director.constructSportsCar(builder1);

        Manual manual = builder1.getManual();
    }
}
