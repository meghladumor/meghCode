package com.meghcode;

public class StringLearn {
    public static void main(String[] args) {
        // Strings
        String name = "Jamila";
        System.out.println(name + " Don");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println(" Hello  : ".trim());
        System.out.println(name.startsWith("M"));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("J","A"));
        System.out.println(name.contains("Don"));

    }
}
/*
Here we can see that multiple variables are reference to the same string " Jamila" , now if we change one of them , let same
name 1 = jamila
name 2 = jamila
then , name2 = Alex .

the sting pool have create a new string alex and the refernece is name2, the Jamila has to stay .

This is the main reason why String are Immutable
 */
