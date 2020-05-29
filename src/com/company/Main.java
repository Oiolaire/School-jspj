package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Mikołaj";
        me.lastName = "Majkowski";
        me.pet = new Pet("dog");
        me.pet.name = "Reksio";
        me.pet.feed();


      //  me.pet.beEaten();
      //  me.beEaten();
      //  me.pet.sell();
      //  me.sell();

        Pet dog = new Pet("dog");
        dog.name = "Akita";

        me.pet = dog;

        me.setSalary(4000.);
        System.out.println("My salary is: " + me.getSalary());


        Car fura = new Disel("Mercedes", "M4", 20000., 1999, "Czarny");
        Car fiat = new LPG("Fiat", "Scudo", 12000., 2000, "Czerwony");
        Car fiat2 = new LPG("Fiat", "Scudo", 12000., 2000, "Czerwony");

        me.setCar(fura);

        //if (fiat.equals(fiat2)) {
        //    System.out.println("Are equal");
        //} else {
        //    System.out.println("Are'nt equal");
        //}

        System.out.println(dog);
        System.out.println(fiat);
        System.out.println(me);

        FarmAnimal cow = new FarmAnimal("cow");
        cow.feed(5);
        cow.beEaten();
        cow.feed();

        dog.feed();
        dog.feed(1.5);

        fura.refuel();
        fiat.refuel();
        fiat2.refuel();

    }
}
