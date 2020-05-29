package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Whoom");
    }


}
