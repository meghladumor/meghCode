package com.pragra;

import java.util.ArrayList;
import java.util.List;

public class EmpList {
    public static void main(String[] args){



        List<employeewithlistiterator> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new employeewithlistiterator("Jhon","jhon@gmail.com",10,"canada"));
        listOfEmployee.add(new employeewithlistiterator("Mark","mark@gmail.com",20,"US"));
        listOfEmployee.add(new employeewithlistiterator("peter","peter@gmail.com",35,"US"));
        listOfEmployee.add(new employeewithlistiterator("Apple","apple@gmail.com",40,"canada"));
        listOfEmployee.add(new employeewithlistiterator("Orange","orange@gmail.com",90,"canada"));
        listOfEmployee.add(new employeewithlistiterator("Davis","davis@gmail.com",86,"canada"));
        listOfEmployee.add(new employeewithlistiterator("Poo","Poo@gmail.com",60,"canada"));
        listOfEmployee.add(new employeewithlistiterator("Joo","Joo@gmail.com",70,"Arfica"));

        // 1. All the employees with age greater than 35
        for (int i=0;i<listOfEmployee.size();i++){
            employeewithlistiterator employee = listOfEmployee.get(i);
            if (employee.getAge()> 35){
                System.out.println(employee.getEmail());

            }
        }

    }

}
