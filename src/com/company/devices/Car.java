package com.company.devices;

public class Car extends Device{
    public final String kolor;
    public Car(String producent, String model, Double cena, Integer yearOfProduction, String kolor) {
        super(producent, model, cena, yearOfProduction);
        this.kolor = kolor;
    }
    public String toString(){
    return producent+ " "+model+" "+yearOfProduction;
    }
}
