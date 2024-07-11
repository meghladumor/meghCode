package com.meghcode;

public class SecondClass {
    public static void main(String[] args) {
        //Classes
        CatTwo rose = new CatTwo("Rose", 4);// passing the values at the point of initiallization
       // Cat.name = " Apple " ; // cant call the instance variable directly here :(
       // cat.name = "Apple"; //  if we dont assign the value, the default value will be NULL
        /*
        the way we are assigning the name is incorrect here an also a bad practise , as it gives direct access internals to the caller here
        to work around this we have to use , Getters and setters methods to set the name and get the value :)
         */
       // rose.setName("Rose");
        rose.meow();
        System.out.println(rose.getName());
        System.out.println(rose.getAge());


        // bellow using the default constructor :)

        CatTwo Star = new CatTwo(); // star is the currect instance of the class here
        Star.setName("star");
        Star.setAge(6);
        Star.meow();
        System.out.println(Star.getName());
    }

   static class Cat {
         private String name; // properties // Instance variable which belongs to the object not the class

        public void meow(){ // methods are the Behaviours :)
            System.out.println(name + ":meow");
        }
    }
}
/*
what we are doing here is making the variables private and allowing the access only via methods, so we are binding our data with methods
This is called encapsulation

when you create an object it will create an blank obj in the heap with a default values ( null ).
To assign the defauly values we can use Costructor :)
Constructor looks like method , but no return type. the constructor name shoud like the class name
Costructor never returns Anything.
If you dont create a constructor, the JVM will create it itself, with default values each time.



 */

