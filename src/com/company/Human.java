package com.company;

public class Human {

    public String firstName;
    public String lastName;
    public Animal pet;

    private Car car;

    private Double salary;

    public void setCar(Car car) {
        if(salary*5>car.cena) {
            System.out.println("Samochód gupiony za gotówke");
            this.car = car;
        }
        else if(salary*10>car.cena){
            System.out.println("Samochód kupiony na kredyt");
            this.car = car;
        }
        else{
            System.out.println("Na samochód cię nie stać cię biedaku");
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
