package com.example.patterns.generating.builder;

public class CarBuilder implements Builder {
    Car car;
    @Override
    public void reset() {
        // Поместить новый объект Car в поле "car".
    }

    @Override
    public void setSeats() {
        // Установить указанное количество сидений.
    }

    @Override
    public void setEngine() {
        // Установить поданный двигатель.
    }

    @Override
    public void setTripComputer() {
        // Установить поданную систему навигации.
    }

    @Override
    public void setGPS() {
        // Установить или снять GPS.
    }
    public Car getCar()
    {
        return car;
    }
}
