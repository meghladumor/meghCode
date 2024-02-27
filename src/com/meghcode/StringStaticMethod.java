package com.meghcode;

public class StringStaticMethod {
    public static void main(String[] args) {
        String number = String.valueOf(1); // method to convert it to string
        System.out.println(number);

        String format =String.format("Number %s", number);
        System.out.println(format);

        String[] names = {"Jamila", "Alex", "Disha"};
        String join = String.join(",",names); // this will join all the array strings in to the join variable with a "," in between ;)
        System.out.println(join);
    }
}
