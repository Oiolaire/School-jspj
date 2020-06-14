package com.company.devices;

import java.util.ArrayList;
import java.util.List;
import com.company.creatures.Human;

public abstract class Car extends Device implements Comparable<Car> {
    public final String color;
    public List<Human> owners = new ArrayList<Human>();

    public Car(String producer, String model, Double value, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
    }

    public Boolean was_owner(Human owner) {
        return owners.contains(owner);
    }

    public Boolean have_they_sold(Human seller, Human buyer) {
        for (int i = 0; i < (owners.size() - 1); i++){
            if((owners.get(i) == seller) && (owners.get(i+1) == buyer)){
                return true;
            }
        }
        return false;
    }

    public int number_of_times_sold(){
        return (owners.size() -1) ;
    }

    public String toString() {
        return super.toString() + producer + " " + model + " " + yearOfProduction + " " + color + " " + value;
    }

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        try {
            boolean seller_owns_this_car = false;
            boolean buyer_has_a_parking_place = false;
            int i, j;

            for (i = 0; i < seller.garage.length; i++) {
                if (seller.garage[i] == this) {
                    seller_owns_this_car = true;
                    break;
                }
            }
            for (j = 0; j < buyer.garage.length; j++) {
                if (buyer.garage[i] == null) {
                    buyer_has_a_parking_place = true;
                    break;
                }
            }
            if (seller_owns_this_car && (owners.get(owners.size() - 1)) == seller) {
                if (buyer_has_a_parking_place) {
                    super.sell(buyer, seller, price);

                    buyer.setCar(this, j);
                    seller.setCar(null, i);
                    owners.add(buyer);
                }else {
                    System.out.println("The buyer doesn't have a free spot");
                    throw new Exception();
                }

            } else {
                System.out.println("The seller doesn't own car or he isn't most recent owner");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

    @Override
    public int compareTo(Car c) {
        int result = this.yearOfProduction.compareTo(c.yearOfProduction);
        return result;
    }

    @Override
    public void turnOn() {
        System.out.println("Wroom");
    }
    public abstract void refuel();

}
