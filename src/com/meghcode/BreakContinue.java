package com.meghcode;

public class BreakContinue {
    public static final String names = "apple";

    public static void main(String[] args) {
        // break and continue
        var numbers = new int[]{1,2,3,4,5};
        var names = new String[]{
                "Andre",
                "James",
                "Ali",
                "Apple",
                "Matt"

        };
        for(int number : numbers){
            if (number == 3){
                break; // this will break once it will find the number 3 here :)
            }
            System.out.println(number);
        }

        for(String name :names){
            if (name.startsWith("J")){
                continue; // continue will skip over the array values with J as a starting letter
            }
            System.out.println(name);
        }

        for(String name : names){
            if(name.startsWith("J")){
                return; // As the return type of our method is VOID, the return will exit us out of the whole method it self nad nothing will run after this line
            }
            System.out.println(name);
        }
        System.out.println("End od main method");

    }
}
