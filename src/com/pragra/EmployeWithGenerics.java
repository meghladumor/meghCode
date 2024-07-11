package com.pragra;

public class EmployeWithGenerics<T,R> {
    T id;
    R name;

    public EmployeWithGenerics(T id, R name) {
        this.id = id;
        this.name = name;
    }
}
class main2 {
    public static void main(String[] args) {

        EmployeWithGenerics<Integer,String> employee = new EmployeWithGenerics<Integer,String>(2,"apple");


    }
}
/*

Here we have used the generic varibles and then at the object creattin we specified the data type :) this way we can
have the type cast intact!
 */