package com.example.patterns.builder;

public class CarManualBuilder implements Builder{

    private Manual manual;

    @Override
    public void reset() {
        // Поместить новый объект Manual в поле "manual".
    }

    @Override
    public void setSeats() {
        // Описать, сколько мест в машине.
    }

    @Override
    public void setEngine() {
        // Добавить в руководство описание двигателя.
    }

    @Override
    public void setTripComputer() {
        // Добавить в руководство описание системы навигации.
    }

    @Override
    public void setGPS() {
        // Добавить в инструкцию инструкцию GPS.
    }
    public Manual getManual()
    {
        return manual;
        // Вернуть текущий объект руководства.
    }
}
