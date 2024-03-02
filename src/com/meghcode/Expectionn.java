package com.meghcode;

public class Expectionn {
    public static void main(String[] args) {
        //Exceptions

        for(int i= 0;i<=10;i++){
            System.out.println(i);

        }
        try {
            int number = Integer.parseInt("1x"); // this will fail so the catch will print , this is called exception handeling
            System.out.println(number);
        }catch (NumberFormatException e){ // the name of the exception( find this once you run the problematic code the exception you get
                                         //  and the name , this can be anything , but normally its "e " for exception
            System.out.println(" Failed to parse 1x :[");

        }

       // for(int i =10;i>=0;i--){
         //   System.out.println(10/i);// this wil throw an expection hee as , 10 / 0 is undefined :(
            /*
            Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.meghcode.Expectionn.main(Expectionn.java:13)

             */
        }
        // also another example bellow :(
       // int number = Integer.parseInt("1x"); // this will also throw an exception here :(

        /*
        To handle the exceptions we can use Try and catch so that , if the code shows an exception we can
        print the th catch and our code will execute without anu errors :) See the code below

         */







}
