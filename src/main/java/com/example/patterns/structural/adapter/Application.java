package com.example.patterns.structural.adapter;

public class Application {
    RoundHole hole = new RoundHole(10);
    RoundPeg roundPeg = new RoundPeg(10);
    public Application() {
        hole.fits(roundPeg);

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        //hole.fits(small_sqpeg) // Ошибка компиляции, несовместимые типы

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        hole.fits(small_sqpeg_adapter); // TRUE
        hole.fits(large_sqpeg_adapter); //
    }


}
