package com.company.devices;

public class Car extends Device {
    public final String color;
    public final Double price;

    public Car(String producer, String model, Double price, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Wroom");
    }

}
