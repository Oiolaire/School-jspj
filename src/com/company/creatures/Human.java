package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;

    private Car car;

    private Double salary;

    public final static Double DEFAULT_HUMAN_WEIGHT = 70.;
    public double cash;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash=1000d;
    }

    public void shareCar(Car dzielony) {
        car = dzielony;
    }

    public void setCar(Car car) {
        if (salary * 5 > car.price) {
            System.out.println("Car bought for money");
            this.car = car;
        } else if (salary * 10 > car.price) {
            System.out.println("Car bought thanks to the bank loan");
            this.car = car;
        } else {
            System.out.println("You can't afford a car");
        }
    }

    public void getCar() {
        System.out.println("I'm driving : " + car);
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
}
