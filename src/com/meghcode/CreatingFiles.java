package com.meghcode;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
    public static void main(String[] args) {
        // working with files
        try {
            File file = new File("src/fooo.txt");
            if (!file.exists()) {

                file.createNewFile(); // if in any case the file dosent creates it will throw an exception
                // createnew file throws an IOexception which is a chekced exception , so we have to handle it :(

            } if(file.exists()){
                file.delete();
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException();

        }
    }
}
