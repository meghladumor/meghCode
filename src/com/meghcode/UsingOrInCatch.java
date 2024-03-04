package com.meghcode;

public class UsingOrInCatch {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1x"); // this will fail so the catch will print , this is called exception handeling
            System.out.println(number);
            for(int i =10;i>=0;i--){
                System.out.println(10/i);// this wil throw an expection hee as , 10 / 0 is undefined :(

            }
            System.out.println("end");
        }catch (NumberFormatException | ArithmeticException e){ // i am using OR "|" here to incapsulate both the exception in one catch
            System.out.println(e.getMessage()); // this will print the exception message that we got on the problematic code
            e.printStackTrace(); // this will give us the error with exception that we got before , but the code will be fully executed :)

        }
        /*
        For input string: "1x" // message

        Below is the StackTrace
java.lang.NumberFormatException: For input string: "1x"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at com.meghcode.UsingOrInCatch.main(UsingOrInCatch.java:6)

Process finished with exit code 0

         */
    }
}
