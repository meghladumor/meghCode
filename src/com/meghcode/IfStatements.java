package com.meghcode;

public class IfStatements {
    public static void main(String[] args) {

        int age = 1;
        boolean isAdult = age >=16;
        String gender = "Female";
        if(true){
            System.out.println("this code will run");

        }else{
            System.out.println(" If the above condition is false then this line of code will run :))");
        }

      /*  if(isAdult){
            System.out.println("is adult:)");
        } else{
            System.out.println("is not an adult :(");
        }
        */

        if(isAdult){
            System.out.println("is adult:)");
        } else if(0<age && age<8){
            System.out.println("is a tobbler");
        } else{
            System.out.println("is not an adult :(");
        }

        if(gender.equalsIgnoreCase("Female")|| gender.equalsIgnoreCase("Male")){
            System.out.println(" Is a valid Gender");


        }else{
            System.out.println("Invalid Gender");
        }

        // !

        if(!isAdult){
            System.out.println("Not an Adult");
        }




    }
}
