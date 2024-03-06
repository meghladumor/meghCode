package com.meghcode;

public class ThrowsExample {
    public static void main(String[] args) { // we can pass the throws here but that will fail the code, so its not a good programming
        //Throwssss
        try{
            divide(10,0);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static void jamila() throws Exception{
        divide(10,10); // Jamila have two options now either she can deal with the exception or she can throws it
    }
    static void john() throws Exception{ // john dosent want to deal with the exception so here say i throws the exception
        divide(10,0);
    }
    public static double divide(int a, int b) throws Exception{ // checked exception , this is need to be dealt before hand
        if(b == 0){
            throw new Exception("Can not divide by zero my friend ");
            // Here we are creating an throw to handle the exception before hand, as 10/0 will create the code to crash, we are
            // handling it before  hand :)
        }
        return a/b;
    }
}
