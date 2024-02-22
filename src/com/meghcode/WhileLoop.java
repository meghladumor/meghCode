package com.meghcode;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int e = 0;
        boolean keepLooping = false;
        while(i<=5){ // if the condition is true it will keep looping
            System.out.println("hello"+i++);
        }

        // Bellow is the example of the do while loop :)

        do{
            System.out.println("hello"+e++);
        }while(keepLooping);
    }
}
