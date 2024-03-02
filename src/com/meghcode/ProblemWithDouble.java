package com.meghcode;

import java.math.BigDecimal;

public class ProblemWithDouble {
    public static void main(String[] args) {
        double number1 = 0.02;
        double number2 = 0.03;
        double result =number2 - number1;
        System.out.println(result
        ); // the result will be  0.009999999999999998, which is correct but its a problem
         /*
    when dealing with money, store prices  then we cant use this double primitive type :(
     */
        // Solution is to use the Bigdecimal object
        BigDecimal n1 = new BigDecimal("0.02");
        BigDecimal n2 = new BigDecimal("0.03");
        BigDecimal result2 = n2.subtract(n1);
        System.out.println(result2);
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = BigDecimal.ONE;
        System.out.println(num1.add(num2));
        System.out.println(num1.compareTo(num2));



    }

}
/*

 */