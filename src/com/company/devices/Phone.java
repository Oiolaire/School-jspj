package com.company.devices;

import java.util.ArrayList;
import java.util.Comparator;
import java.net.URL;
import java.util.List;

import com.company.creatures.Human;

public class Phone extends Device {

    static final String DEFAULT_SERVER = "www.google.pl";
    static final String DEFAULT_PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "2.0";
    public List<Application> apps_installed = new ArrayList<Application>();
    public Human owner = null;

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

    public void installApp(Application app) {
        if (owner != null) {
            if (owner.cash > app.price) {
                if (isThisAppInstalled(app) == false) {
                    apps_installed.add(app);
                    owner.cash -= app.price;

                } else {
                    System.out.println("Aplikacja " + app.name + " już jest zainstalowana");
                }
            } else {
                System.out.println("Za mało pieniędzy aby kupić  " + app.name);
            }
        } else {
            System.out.println("Błąd: telefon nie ma przypisanego właściciela ");
        }
    }

    public boolean isThisAppInstalled(Application app) {
        return apps_installed.contains(app);
    }

    public boolean isThisAppInstalled(String name) {
        for (int i = 0; i < apps_installed.size(); i++) {
            if (name == apps_installed.get(i).name) {
                return true;
            }
        }
        return false;
    }


    public double valueOfAllApps() {
        double a = 0.;
        for (int i = 0; i < apps_installed.size(); i++) {
            a += apps_installed.get(i).price;
        }
        return a;
    }

    public void listAllFreeApps() {
        System.out.println("\nLista zainstalowanych darmowych aplikacji:");
        for (int i = 0; i < apps_installed.size(); i++) {
            if (apps_installed.get(i).price == 0.) {
                System.out.println(apps_installed.get(i).toString());
            }
        }
    }

    public void listAllAppsAlphabetical() {
        System.out.println("\nLista alfabetyczna:");
        List<Application> temp = apps_installed;
        Comparator<Application> Lambda = (app1, app2) -> app1.name.compareTo(app2.name);
        temp.sort(Lambda);
        System.out.println(temp);
    }

    public void listAllAppsSortedByPrice() {
        System.out.println("\nLista posortowana po cenie:");
        List<Application> temp = apps_installed;
        Comparator<Application> Lambda = (app1, app2) -> app1.price.compareTo(app2.price);
        temp.sort(Lambda);
        System.out.println(temp);
    }

}
