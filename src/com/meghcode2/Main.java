package com.meghcode2;

import com.meghcode2.address.Address;
import com.meghcode2.car.Car;
import com.meghcode2.car.CarService;
import com.meghcode2.person.Gender;
import com.meghcode2.person.Person;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    private static  Person[] People = null;

    static{

        System.out.println(" Static is the main ");
        People = new Person[10];
    }
    public static void main(String[] args) {


        Address meghAddress = new Address(1,"Fountainhead","M3J1K6","North York","Canada");

        Car car1 = new Car("Tesla",new BigDecimal("45000"));

        Car[] cars = {car1};

        Person megh = new Person("Megh","Ladumor", Gender.MALE,"meghladumor9@gmail.com",meghAddress,cars);

        System.out.println(megh);

        System.out.println(Person.count); // print the static count variable.
        System.out.println(People);

        CarService carService = new CarService();
        carService.registerNewCar(car1);
        System.out.println(Arrays.toString(carService.getCars()));








    }
}
