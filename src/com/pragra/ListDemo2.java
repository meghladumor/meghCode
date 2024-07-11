package com.pragra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // for every element in the lsit print the element

        for(Integer element:list){
            System.out.println(element);
        }

        // Iterator
       /*
        Why do we need iterator ?

        We can not easliy remove elements usinga for loop in collection  with out the cocurrent modification erroe and so we need iterator .

        Concurrent modification error  is a runtime exception in Java that occurs when a collection is modified
        while it is being iterated over using methods other than the iterator's own remove method.
        This exception is part of the fail-fast behavior of Java's Collection framework, which is designed to detect
        concurrent modifications and throw an exception to prevent unpredictable behavior.



        */

      /*  Iterator<Integer> iterator = list.iterator(); // specifying the type

        while(iterator.hasNext()){  // hasnext is just a condition here so that the loop continues
            Integer next = iterator.next(); // ( this will have the next item)
            System.out.println(next); // this will print it
        }

       */
        Iterator<Integer> iterator = list.iterator(); // specifying the type


        while(iterator.hasNext()){  // hasnext is just a condition here so that the loop continues
            Integer next = iterator.next(); // ( this will have the next item)
            if(next == 10){
                iterator.remove();
            }
        }
        System.out.println(list);

        /*
        Listiterator is same as the regular iterator but with more methods lets see its use bellow
         */
        ListIterator<Integer>listIterator= list.listIterator();

        // next
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        // here the iterator will be at the last index so the while loop condition bellow will be correct and it will be able to go back
        // nut if the iterator is at the start then it wont have a previous index and the condition will be false.
        // previous
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.hasPrevious());
        }




    }
}
