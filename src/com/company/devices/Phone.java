package com.company.devices;

import java.net.URL;
import java.util.List;
import com.company.creatures.Human;

public class Phone extends Device {

    static final String DEFAULT_SERVER = "www.google.pl";
    static final String DEFAULT_PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "2.0";

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Whoom");
    }

    public void installAanApp(String name) {
    }

    public void installAanApp(String name, String version) {
    }

    public void installAanApp(String name, String version, String server_name) {
    }

    public void installAanApp(List<String> names) {
    }

    public void installAanApp(URL url) {
    }
    


}
