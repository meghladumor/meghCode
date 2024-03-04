package com.meghcode;

public class UnCheckedExceptions {
    public static void main(String[] args) {
        // Runtime exceptions, here the code is correct so the Inteliji wont show us any issues before hand ( complie time )

        for(int i =10;i>0;i--){ // i > = 0 will be an error here, which will cause unchecked exception.
            System.out.println(10/i);// this wil throw an expection hee as , 10 / 0 is undefined :(

        }
        int number = Integer.parseInt("1x"); // this will show us an exception here too
        System.out.println(number);

        System.out.println("end");
    }
}
