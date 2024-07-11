package com.pragra;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(70);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(10);
        arrayList2.add(20);
        arrayList2.add(40);
        arrayList2.add(50);
        arrayList2.add(70);

        System.out.println(arrayList);
        arrayList.add(2,1000); // adding in the second index here using the add method

        System.out.println(arrayList);

        Integer element = arrayList.get(3); // get method to get a specific idex value from the arraylist :)
        System.out.println(element);

        arrayList.addAll(arrayList2); // adding both the collection using addall method here :)
        System.out.println(arrayList);

        int i = arrayList.indexOf(10); // using this method to find the index of the specific value
        System.out.println(i);





    }
}
