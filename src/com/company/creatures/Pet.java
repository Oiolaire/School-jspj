package com.company.creatures;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
    }


    @Override
    public void beEaten() throws Exception {
        System.out.println("You can not eat your pets");
    }
}
