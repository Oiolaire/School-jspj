package com.company.devices;

public class Disel extends Car {
    public Disel(String producer, String model, Double price, Integer yearOfProduction, String color) {
        super(producer, model, price, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("Grrrrr");
    }
}
