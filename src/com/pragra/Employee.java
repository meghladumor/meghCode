package com.pragra;

public class Employee {

    Object id;
    Object name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
class main {
    public static void main(String[] args) {
        Employee employee = new Employee("101","Lovepreet");
    }
}
// flexibility of working with any type of data
/*
We can use the Object here as well and then we can pass any values in it , it will take any variable
/
But then we sacrifice the type safety here ,any one can put any data/value here
Continue in readme..
 */
