package com.meghcode;

import java.util.Objects;

public class CatTwo {
    private String name;// properties // Instance variable which belongs to the object not the class
    private int age;
    private String color;

    public CatTwo(String name, int age, String color) { // this is a constructor to setup the default values
        // this.name = name; // this is so that i can pass any name i want when i create an Obj
        // this.age = age;
        this(name, age); // this is called an inside construtor, this will call the constructor bellow:)
        this.color = color;
    }

    public CatTwo(String name, int age) { // this is a constructor to setup the default values
        this.name = name; // this is so that i can pass any name i want when i create an Obj
        this.age = age;
    }

    public CatTwo() { // empty cnstructor , to emulate  what JVM does with the default construcotr

    }

    public void meow() { // methods are the Behaviours :)
        System.out.println(name + ":meow");
    }

    public void setName(String name) { // Setter Method :)
        this.name = name; // this.name belongs to the each object and the name is the local variable of the method here
    }

    public String getName() {
        return this.name; // will return the name of specific object :) each instance object
    }

    public int getAge() {
        return age; // not need of this workd here , because we dont have any other variables here :)
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Name:" + name + "Color:" + color + "Age:" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatTwo catTwo = (CatTwo) o;
        return age == catTwo.age && Objects.equals(name, catTwo.name) && Objects.equals(color, catTwo.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }
}


