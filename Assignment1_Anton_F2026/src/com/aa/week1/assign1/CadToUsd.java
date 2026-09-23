package com.aa.week1.assign1;

public class CadToUsd {

    private final double USD_RATE = 0.73;

    public double convert(double cad) {
        return cad * USD_RATE;
    }
}
