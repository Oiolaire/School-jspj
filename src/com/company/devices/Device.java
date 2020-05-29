package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable{
    public final String producent;
    public final String model;
    public final Integer yearOfProduction;

    public Device(String producent, String model, Integer yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void turnOn();
}
