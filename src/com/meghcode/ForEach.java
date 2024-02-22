package com.meghcode;

public class ForEach {
    public static void main(String[] args) {
        String[] names = new String[]{"james", "Nadia", "Apple", "Banana", "Grapes"};
        int e;
        for(e = 0; e < names.length; ++e) {
            String prev = names[e-1];
            String current = names[e];
            String next = names[e+1];
            System.out.println(names[e]);
        }


        // for( type variable : arrayName) Syntax for ForEach Loops
        for (String apple:names){
            System.out.println(apple);
        }


        /*
        Here the main difference between the ForEach loop and the For i loop is that I can access each index in the For i loop If i want to
        In the case of For Each loop I cant as it just runs though the Array with out any use of Index.
         */
    }
}
