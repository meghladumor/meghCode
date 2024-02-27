package com.meghcode;

public class StringCompare {
    public static void main(String[] args) {
        String name = "Disha" ;
        String name1 = "Disha" ;

       // This two will be individual objects , and will have different reference :) each object will be created in Heap only
      //  and each will be unique, even thouuh the value is same :)
        // "==" compares the reference
        String name2 = new String("Disha");
        String name3 = new String("Disha");
        System.out.println(name == name1); // this will be true, because in  stringpool the refernce will be the same
        System.out.println(name == name2); // here the refernce will be different , so it will result to false
        System.out.println(name.equals(name2)); // this will compare the value inside , so it will be correct :)
    }
}
