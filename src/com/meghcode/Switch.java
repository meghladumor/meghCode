package com.meghcode;

public class Switch {
    public static void main(String[] args) {
        // switch
        char grade = 'A';
        if(grade=='A'){
            System.out.println("excellent");
        }else if (grade=='B'|| grade=='C'){
            System.out.println("pass");
        }else {
            System.out.println(" Fail");
        }

        // In Switch

        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
        /*
        there are limited values which you can pass in the switch which are below:
        byte, short, int, char,enums,String.

       Also you cant pass the null value in the switch statements
         */
        // switch in the New version of Java also called as " Switch Expressions "

       String result= switch(grade){ // you have to store the value in String here with a variable
            case 'A' -> "Excellent";
            case 'B','C'-> "Pass";
            default -> "Fail";
        };
        System.out.println(result);




    }



}
