package com.meghcode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String names[] = {"james","Nadia","Apple", "Banana","Grapes"};
        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
        for(int e= (names.length-1); e>=0;e--){
            System.out.println(names[e]);
        }
        System.out.println(Arrays.toString(names));
    }
}
