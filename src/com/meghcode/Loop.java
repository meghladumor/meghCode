package com.meghcode;

public class Loop {
    public static void main(String[] args) {
        // Loops
        for(int i=0;i<=10;i++){
            System.out.println(" Start of for loop");
            System.out.println("helllo"+ i);
            System.out.println(" end of for loop");



        }

        for ( int e=0;e<=10;e+=4){
            System.out.println("hello"+ e);
            // here e = 0 then its 4 then 8 so it will only be looped for 3 times as after then it will be 12 which is more than 10.
        }
    }
}
