package com.company.devices;

public class Car {

    public final String marka;
    public final String model;
    public final Integer yearOfProduction;
    public final String kolor;
    public final Double cena;

    public Car(String marka, String model, Integer yearOfProduction, String kolor, Double cena) {
        this.marka = marka;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.kolor = kolor;
        this.cena = cena;
    }

    public String toString(){
        return marka+ " "+model+" "+yearOfProduction;
    }
}
