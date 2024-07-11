package com.meghcode2.Garage;

import com.meghcode2.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Garage {

    private int capacity;

    private int number;
    private Car[] cars;

    public Garage(int capacity,int number, Car[] cars){
        this.capacity = capacity;
        this.number = number;
        this.cars = cars;
    };

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return capacity == garage.capacity && number == garage.number && Arrays.equals(cars, garage.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, number);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "capacity=" + capacity +
                ", number=" + number +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
