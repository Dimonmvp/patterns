package com.example.patterns.builder;

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
