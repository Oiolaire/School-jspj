package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Mikołaj";
        me.lastName = "Majkowski";
        me.pet = new Animal("dog");
        me.pet.name = "Reksio";
        me.pet.feed();

        Car fura = new Car("Mercedes","M4",1999,"Czarny",20000.);




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
