package com.meghcode;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1x"); // this will fail so the catch will print , this is called exception handeling
            System.out.println(number);
            for(int i =10;i>=0;i--){
                System.out.println(10/i);// this wil throw an expection hee as , 10 / 0 is undefined :(

        }
            System.out.println("end");
        }catch (NumberFormatException e){ // the name of the exception( find this once you run the problematic code the exception you get
            //  and the name , this can be anything , but normally its "e " for exception
            System.out.println(" Failed to parse 1x :[");

        } catch(ArithmeticException e){
            System.out.println(" Can not divide by zero lol ");
        }
    }
}
/*
Here we are using multiple catch statements, when the first code throws and exception , the catch will sout the failed statement,
now for the loop, we can another catch which will print the " can not divide ". If the first code throws an exception, the compiler will exit and print the catch
If the loop fails and not the first code then also the compiler will exit and print the catch " can not divide " and  sout (end ) wont be executed :(
 We can have as many exception we want, but we have to know which exception it will give us, what if it throws the one we dont know ?

 */