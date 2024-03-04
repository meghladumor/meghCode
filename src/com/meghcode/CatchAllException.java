package com.meghcode;

import java.io.File;

public class CatchAllException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1"); // this will fail so the catch will print , this is called exception handeling
            System.out.println(number);
            for(int i =10;i>0;i--){
                System.out.println(10/i);// this wil throw an expection hee as , 10 / 0 is undefined :(

            }
            System.out.println("end");
        } catch(Exception e){ // this is a generic exception, which we can use, when we dont know what exception the code will give us
            System.out.println("Catch all Exception");
            System.out.println(e.getMessage());
        }finally{ // this will always runs regarless of any exceptions or not
            System.out.println("Finally Always runs");
        }
       // File file = new File("src/foo.txt");
       // if(!file.exists()){
         //   file.createNewFile(); // this will throw an I/O exception here, so the code will not run at all and we have to fix this before running it again
        }

        /*
         IMPORTANT !!!1
        Whenever you want to know what exception will the methods will give, click on the method and see the class and what it throws
         */

        /*catch (NumberFormatException | ArithmeticException e){ // i am using OR "|" here to incapsulate both the exception in one catch
             // this will print the exception message that we got on the problematic code
            e.printStackTrace(); // this will give us the error with exception that we got before , but the code will be fully executed :)

         */


    }


