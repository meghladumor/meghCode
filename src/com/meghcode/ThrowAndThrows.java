package com.meghcode;

public class ThrowAndThrows {
    public static void main(String[] args) {
       // Throw and throwssss

        try {
            System.out.println(divide(10, 0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
    public static double divide(int a, int b) throws Exception{ // checked exception , this is need to be dealt before hand
        if(b == 0){
            throw new Exception("Can not divide by zero my friend ");
            // Here we are creating an throw to handle the exception before hand, as 10/0 will create the code to crash, we are
            // handling it before  hand :)
        }
        return a/b;
    }
    /*
       try {
            System.out.println(divide(10, 0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

     */
}
