package com.meghcode;

public class Wrapper {
    public static void main(String[] args) {
        /* Primitive data types Wrapper class
        > byte -> Byte
        > short -> Short
        > int > Integer
        > long > Long
        > float > Float
        > double > Double
        > boolean > Boolean
        > char> Character


        */

        int age = 20;
        Integer age2 = 20; // this is a wrapper class or
        //Integer age2 = new Integer(age);
        double price = 206.33;
       // Double price2 = new Double(price);
        var ageStr = "55";
        int a = Integer.parseInt(ageStr); // a is a integer now
        System.out.println(a);
        System.out.println(Integer.min(-1,5));
        System.out.println(Double.MAX_VALUE);


    }
}
