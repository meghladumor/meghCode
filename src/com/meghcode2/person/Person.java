package com.meghcode2.person;

import com.meghcode2.address.Address;
import com.meghcode2.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;

    private Gender gender;

    private String emailAddress;
    private Address address;

    private Car[] cars;

    public static int count = 0;

    public Person() {
        System.out.println(" this is the default constructor");
        count++;
    }

    public Person(String firstName, String lastName, Gender gender, String emailAddress, Address address, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.address = address;
        this.cars = cars;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.equals(emailAddress, person.emailAddress) && Objects.equals(address, person.address) && Arrays.equals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender, emailAddress, address);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                ", address=" + address +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
