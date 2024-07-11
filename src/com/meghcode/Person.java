package com.meghcode;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    private CatTwo[] catTwos;

    public Person(String firstName, String lastName, Gender gender, CatTwo[] catTwos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.catTwos = catTwos;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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

    public CatTwo[] getCatTwos() {
        return catTwos;
    }

    public void setCatTwos(CatTwo[] catTwos) {
        this.catTwos = catTwos;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", catTwos=" + Arrays.toString(catTwos) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Arrays.equals(catTwos, person.catTwos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender);
        result = 31 * result + Arrays.hashCode(catTwos);
        return result;
    }
}


