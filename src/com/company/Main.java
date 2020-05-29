package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Mikołaj";
        me.lastName = "Majkowski";
        me.pet = new Animal("dog");
        me.pet.name = "Reksio";
        me.pet.feed();

        Animal dog = new Animal("dog");
        dog.name = "Akita";

        me.pet = dog;

        me.setSalary(4000.);
        System.out.println("My salary is: " + me.getSalary());


        Car fura = new Car("Mercedes","M4",1999,"Czarny",20000.);
        Car fiat = new Car("Fiat", "Scudo",2000, "Czerwony",12000.);
        Car fiat2 = new Car("Fiat", "Scudo",2000, "Czerwony",12000.);

        me.setCar(fura);

        if (fiat.equals(fiat2)){
            System.out.println("Są równe");
        }else{
            System.out.println("Nie są równe");
        }

        System.out.println(dog);
        System.out.println(fiat);
        System.out.println(me);

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.feed();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.walk();
        me.pet.feed();

    }
}
