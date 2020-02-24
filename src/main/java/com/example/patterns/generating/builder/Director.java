package com.example.patterns.generating.builder;

public class Director {
    public void constructSportsCar(Builder builder)
    {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }
}
