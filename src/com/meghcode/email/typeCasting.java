package com.meghcode.email;

import java.sql.SQLOutput;

public class typeCasting {
    public static void main(String[] args) {
        // Type casting - convert one data type to another
        // Implicit Type (Widening) casting
        System.out.println(" Implicit Type (widening) casting ");
        int balance = 100;
        double balanceDouble = balance;
        System.out.println(balance);
        System.out.println(balanceDouble);
        System.out.println("Explicit Type (Narrowing) casting");
        double balanceInDouble = 100.55;
        int balanceInInt = (int) balanceInDouble; // this will round it to 100 from 100.55 , so we will lose the decimals here .
        System.out.println(balanceInDouble);
        System.out.println(balanceInInt);


    }
}
