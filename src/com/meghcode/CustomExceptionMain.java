package com.meghcode;

public class CustomExceptionMain {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10,0));
        } catch (MycheckedException e) {
            System.out.println(e.getMessage());
        }

    }
    public static int divide(int a,int b) throws MycheckedException{ // throws this says it throws exception
        if(b==0){
            throw new MycheckedException("Cannot divide by zero :("); // our custom exception , this is not handled :( yet
        }
        return a/b;
    }
}
