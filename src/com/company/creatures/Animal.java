package com.company.creatures;

import com.company.creatures.Human;
import com.company.Saleable;


import java.io.File;

public class Animal implements Edible, Saleable {

    final String species;
    protected Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 20.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("dog")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("mouse")) {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species.equals("lion")) {
            this.weight = DEFAULT_LION_WEIGHT;
        }
    }

    public void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("You can't feed me because i am dead");
        }
    }

    public void walk() {

        if (--weight <= 0) {
            System.out.println("I'm freaking dead bro");
        } else if (weight <= 2) {
            System.out.println("Feed me!!! ");
        } else {
            System.out.println("Thx for tha walk bro my weight is now " + weight);
        }
    }


    @Override
     public void sell(Human buyer, Human seller, Double price) throws Exception {
            if (this instanceof Human) {
                throw new Exception("You can't sell people");
            } else if (price < buyer.cash) {

                buyer.cash -= price;
                seller.cash += price;
                System.out.println("You sold your pet for " + price);
            } else {
                System.out.println("You dont have enough money");
            }
     }






    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human) throw new Exception("Kanibalizm jest nielegalny");
        else {
            System.out.println("Mniam");
            this.weight = 0.0;
        }
    }
}
