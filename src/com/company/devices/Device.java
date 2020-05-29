package com.company.devices;

public abstract class Device {
    public final String producent;
    public final String model;
    public final Double cena;
    public final Integer yearOfProduction;

    public Device(String producent, String model, Double cena, Integer yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.cena = cena;
        this.yearOfProduction = yearOfProduction;
    }
}
