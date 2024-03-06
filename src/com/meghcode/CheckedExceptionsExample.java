package com.meghcode;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsExample {
    public static void main(String[] args) {
        // Checked exceptions or Complie time exception


        try{
            File file = new File("src/foo.txt");
        if(!file.exists()){
            file.createNewFile();
        } } catch(IOException e){
            System.out.println(e.getMessage());
        }



    }

    /*
    I wont be allowed to even run this code as the CreateNewFile will throw an IOexception here , due to many reason like
    file creation permission or any other, which mean i have to either use Try/Catch ot throw/throws :)
      // Checked exceptions or Complie time exception
        File file = new File("src/foo.txt");
        if(!file.exists()){
            file.createNewFile();
        }
     */
}
