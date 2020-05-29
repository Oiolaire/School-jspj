package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Device implements Saleable{
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (price < buyer.cash) {

            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Sold to " + this.toString() + " for " + price + " zł");
        } else {
            System.out.println("You dont have enough money");
        }
    }
}
