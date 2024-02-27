package com.meghcode;

public class GlobalAndLocal {
    // Global and Local Variables

    private static final String BRAND = "MeghCode"; // this is also a global variable but only for this class
    public static final double PI = 3.14; // this is a public class and its global variables
    public static void main(String[] args) {
        String BRAND = "Adidas"; // now there is a conflict , now this variable will be used instead of the global variable, the one in the method will have the prority :)
        String country = " England"; // this  is a local variable
        System.out.println(BRAND); // this will be Adidas :)
        foo(); // method called here , as its a static , no instance creation needed
    }
    private static void foo(){
        //System.out.println(country); // you cant call this variable here
        System.out.println(BRAND);
    }
}
