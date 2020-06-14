package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human(3);
        me.firstName = "Mikołaj";
        me.lastName = "Majkowski";
        me.pet = new Pet("dog");
        me.pet.name = "Reksio";
        me.pet.feed();

        Human wife = new Human();
        wife.cash = 5000.;
        wife.setSalary(500d);

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
        Car fiat2 = new Electric("Fiat", "Terra",25000., 2020,"niebieski");
        me.setCar(fura, 2);

        me.garage[0] = (fura);
        me.garage[1]= fiat;
        me.garage[2]= fiat2;

        fura.sell(wife,me,1000.);
//        fura.sell(wife,me,10000.);
        System.out.println("I'm driving: " + me.getCar(0) + ", " + me.getCar(1) + ", " + me.getCar(2));
        System.out.println("My cars worth: " + me.cars_Value());
        System.out.println("My spouse is driving: " + wife.getCar(0));
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
