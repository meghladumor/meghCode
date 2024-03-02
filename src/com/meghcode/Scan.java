package com.meghcode;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        System.out.println(" Hello! What is your name :)");
        Scanner Scanner = new Scanner(System.in); // System.in defines where the scanner will take the value from , which is console :)
       String input =  Scanner.nextLine(); // next line will scan the next string :)
        System.out.println(input);

        System.out.println(" What is your age ?");
       int age =  Scanner.nextInt(); // we can use netInt to scan the integer :)
       if(age<16){
           System.out.println(" You are a Child :[");
       }else {
           System.out.println("you are a MAN");
       }



    }
}
