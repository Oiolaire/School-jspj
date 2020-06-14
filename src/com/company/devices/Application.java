package com.company.devices;

import java.util.Comparator;

public class Application {

    public String name;
    public String version;
    public Double price;

    public Application() {
        name = "-";
        version = "1.0";
        price = 0.;
    }

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String toString() {
        return name + " " + version + " cena: " + price;
    }
}