package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Double price, Integer yearOfProduction, String color) {
        super(producer, model, price, yearOfProduction, color);
    }
    @Override
    public void refuel() {
        System.out.println("Bzz");
    }
}
