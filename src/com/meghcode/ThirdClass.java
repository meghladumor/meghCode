package com.meghcode;

import java.sql.SQLOutput;

public class ThirdClass {
    public static void main(String[] args) {
        CatTwo cat = new CatTwo("Apple",4,"Blue");
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());

        /*
        Lets find  and string representation of the object
         */

        System.out.println(cat); // the tostring method is set to return the "hello" , so when we print the object it will print the
        // value passed in the toString :)
        CatTwo cat2 = new CatTwo("Apple",4,"Blue");
        System.out.println(cat2);
        System.out.println(cat == cat2); // this will compare the reference or the address , not the value, so it will be false :(
        System.out.println(cat.equals(cat2)); // this will be false , as the method .equals will  use the same == operator to compare the reference .
        CatTwo[] catTwos = {cat,cat2};
        Person Megh = new Person("Megh","Ladumor",Gender.MALE,catTwos);

        System.out.println(Megh);





    }
}
