package com.meghcode2.person;

public class PersonService {
    public int addperson(Person person){
        if(person.getFirstName().isBlank()){
            throw new IllegalArgumentException("First name cannot be null or empty");

        }
        return 1;
    }
}
