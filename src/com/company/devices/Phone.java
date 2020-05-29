package com.company.devices;

public class Phone extends Device {
    public Phone(String producent, String model, Integer yearOfProduction) {
        super(producent, model, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("Pstryk");
    }

    @Override
    public void sell() {
        System.out.println("Sprzedano telefon");
    }
}
