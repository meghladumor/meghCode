package com.meghcode;

public class Enums {
    // below we dont have a datatype
    public static final String FEMALE = "FEMALE";
    public static final String MALE = "MALE";

    enum Gender{ // Here Enums have DATATYPE which is a GENder in this case
        MALE,
        FEMALE

        // we can also store more information in enums , that will be explained later :)

    }
    enum TshirtSize { // Data type is Tshirt size
        S,
        M,
        L,
        XL
    }

    public static void main(String[] args) {
        //Enums
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);
        // Or the String constants
        System.out.println(GenderConstants.FEMALE); // Female is a string type here and same will be for the male



    }
}
