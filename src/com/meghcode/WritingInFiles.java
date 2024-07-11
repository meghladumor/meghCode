package com.meghcode;

import java.io.*;
import java.util.Scanner;

public class WritingInFiles {
    public static void main(String[] args) {
        File file = createFile("src/dish.txt");
        writeToFile(file,true);// calling the method here :)
        try {
            Scanner scan = new Scanner(file); // this will read the file, same as it reads the from input console
            while(scan.hasNext()){ // there is a method to print the whole file at once but this is better if we want to perform
                // anything on each line here
                System.out.println(scan.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    public static void writeToFile(File file, boolean append){

        try{
            // FileWriter fileWriter = new FileWriter(file);
            FileWriter fileWriter = new FileWriter(file,true); // the new text will be
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Hello");
            writer.println("");
            writer.println("World");

            writer.flush(); // once we fisnish writing we have to flush it, to sure the data is saved in the file and in the disk from memory
            writer.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static File createFile(String path) { // creating a file Method

        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
           // return file; // return is here as the scope of the file object end after this block :(
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException();

        }

    }

}
/*    try( FileWriter fileWriter = new FileWriter(file,true);
            PrintWriter writer = new PrintWriter(fileWriter);)
     {
            writer.println("Hello");
            writer.println("");
            writer.println("World");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
 */