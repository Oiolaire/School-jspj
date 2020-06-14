package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import java. util. Arrays;
import java.util.Comparator;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;

    public Car[] garage;

    private Double salary;

    public final static Double DEFAULT_HUMAN_WEIGHT = 70.;
    public final static Integer DEFAULT_GARAGE_SIZE = 1;
    public double cash;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000d;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garage_size) {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000d;
        this.garage = new Car[garage_size];
    }

//    public void shareCar(Car dzielony) {
//        Car = dzielony;
//    }

//    public void setCar(Car car) {
//        if (salary * 5 > car.price) {
//            System.out.println("Car bought for money");
//            this.car = car;
//        } else if (salary * 10 > car.price) {
//            System.out.println("Car bought thanks to the bank loan");
//            this.car = car;
//        } else {
//            System.out.println("You can't afford a car");
//        }
//    }
//
    public Car getCar(Integer spot) {
        return garage[spot];
    }

    public void setCar(Car c, Integer spot) {
        garage[spot] = c;
    }

    public Double cars_Value() {
        Double a = 0.;
        for (Car car : garage) {
            if (car != null) {
                a += car.value;
            }
        }
        return a;
    }

    public void sort_Garage() {
        Arrays.sort(garage);
    }

    public void setSalary(Double salary) {
        if (salary <= 1000) {
            System.out.println("Come on have more faith in yourself (new salary is below legal limit)");
        } else {
            System.out.println("Sending new data to the accountants");
            System.out.println("Make sure to send documentation to Ms. Hania");
            System.out.println("ZUS and US already know");
            System.out.println("Your new salary: " + salary);
            this.salary = salary;
        }
    }


    public Double getSalary() {
        return salary;
    }

    @Override
    public void beEaten() throws Exception {

    }
}

