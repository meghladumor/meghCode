package com.meghcode;

import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java ");
        System.out.println( 10 + 10 );
       // single comment
        /*
        multi line commemnts
         */

        int num = 20 ;
        int num2 = 30;
        int result = num + num2;

        System.out.println(result);

        /*
         Primitives:

         byte  -128 to 127
         short -32K to + 32 K
         int
         long
         float
         double
         char
         boolean  true/false

         */

        System.out.println(num - num2);
        System.out.println(num + num2);
        System.out.println(num /num2);
      /*


        int number = 0 ;
        int increment = number + 1;
        int decrement = number -1;

         */
        int number = 0 ;
        System.out.println(number++);
        System.out.println(number);

        int numberTwo = 0;
        System.out.println("umberTwo"+ ++numberTwo);

        int numberThree = 1;
        System.out.println(--numberThree);




        numberThree += 1 ;

        /*
        x += y is x = x + y
        x -= y is x = x - y
        x *= y is x = x * y
        x /= y is x = x / y
        × %= y is x = x % y
        x ^= y is x = x ^ y
         */

        // String

        String brand = "Amigo Code";
        String amigos = "code";
        String apple = brand + "" + amigos ;

        System.out.println(apple.toUpperCase());
        System.out.println(apple.toLowerCase());
        System.out.println(apple.substring(0,4));
        System.out.println("".isEmpty());
        System.out.println("  b ".trim());


        // 36  Reference Types/ Objects



        int age = 21 ;
        Point pointA = new Point(10,10);
        System.out.println("pointA = " + pointA);
        pointA.move(12, 14);
        System.out.println("pointA = " + pointA);



        // Pass by value
        int age1 = 21 ;
        int ageCopy = increment(age1);

        System.out.println(age);
        System.out.println(ageCopy);

        // 40# Arrays

        int[] numbers = new int[3];
        numbers[0]= 1 ;
        numbers[1] = 33 ;
        numbers[2] = 6 ;
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);
        // another way to write an Array
        int[] numbers2 = {2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(numbers2));

        String[] names = { "Megh ", " Disha"};


        // #41 Null and 0 values with in Arrays

        int[] numbers3 = new int[3];
        Arrays.fill(numbers3, -1); // this will make the default values to be -1 instead of zerooooo!
        numbers3[0]= 1 ;
        // the output will be [1,0,0] the rest of the values will be 0!

        // For the Objects Now :

        String[] names1 = new String[2];
        names1[1] = "Megh";
        System.out.println(Arrays.toString(names1)); // the defauls values for string will be NULL ;

        // If statements

        if(true){
            System.out.println("this code runs");
        }

        // Package :)
       // Packages is nothing but a folder that allows any given project, its JUST a FOLDER :)))))

        // 66 Import Keywords

        Point point = new Point();

        // 68 Import with fully qualified name of package

        Date date = new Date(); // this will use the package called java.util.Date

        // now
        java.sql.Date date1 = new java.sql.Date(1); // here the package should be use is java.sql.date, but as the above anf this are the
        // same , it will cause an error , so this is the way to work around it
       // brand.indexOfNonWhitespace();

        //# 76 Static keywords
        /*
         static belongs to class itself and not to the " instance "
         If you remove the static keyword then it will become a method of the instance and you
          wont be able to call it for any further use

          Only a static method can call a static objcet,method or anything
         why is the main method Static, if the main method isnt static then first we have to create the ojject/instance of the class
         but the main is the stating point of the program.So there will be a deadlock, to solve this problem we have to make the
         main method as static :)))))
         // 77 Methods
         - Access modifiers
         -Optional static
         - Return type
         -name
         -optional Parameters
         -Method body
         -optional return value

         // 84 Understanding public static void main
         JVM always looks for the main method in the class first, the main method has to public as jvm has to find it ,so it cant be protected
         void : is the return type, the main method dosent return anything here :)
         In summary, the (String[] args) parameter in the main method allows your Java program
         to accept command-line arguments, enhancing its flexibility and usability.

         // 86 " Type Inference with Var Keyword "
         >    you can use the Var keyword " Only in local method variable " ,  cant be in a CLASS or out side static method variable :(

         example open the varExample java

         // 90 FINAL keyword
         Final can be used with a variable, method and Class

         Final when used with a variable it will make it constant :) ( upper case all )

         // 99
         This two strings will be created in the String pool and will have the same refernce.
         String name = "Jamila" ;
         String name1 = "Jamila" ;

         This two will be individual objects , and will have different reference :) each object will be created in Heap only
         and each will be unique, even thouuh the value is same :)
         String name2 = new String("Jamila");
         String name3 = new String("Jamila");

         // 141
          This keyword refers to the current instance of the current class :)













         */





































        }
    static int increment (int age1) {
        return ++age1;


    }
    }

