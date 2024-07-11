package com.project;

import java.util.Scanner;

public class main {

    private static int selectOption;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Print the menu
            System.out.println("1️⃣"+ "- Book car");
            System.out.println("2️⃣"+ "- View All user Booked Cars");
            System.out.println("3️⃣"+ "- View All Bookings");
            System.out.println("4️⃣"+ "- View Available Cars");
            System.out.println("5️⃣"+ "- View Available Electric Cars");
            System.out.println("6️⃣"+ "- View all users");
            System.out.println("7️⃣"+ "- Exit");

            // Prompt user to select an option
            System.out.println("Select the available option:");
            selectOption = sc.nextInt();

            // Handle the selected option
            if (selectOption == 1) {
                System.out.println("The selected option is 1 - Book car");

            } else if (selectOption == 2) {
                System.out.println("The selected option is 2 - View All user Booked Cars");


            } else if (selectOption == 3) {
                System.out.println("The selected option is 3 - View All Bookings");


            } else if (selectOption == 4) {
                System.out.println("The selected option is 4 - View Available Cars");


            } else if (selectOption == 5) {
                System.out.println("The selected option is 5 - View Available Electric Cars");


            } else if (selectOption == 6) {
                System.out.println("The selected option is 6 - View all users");

            } else if (selectOption == 7) {
                System.out.println("Exiting...");
                return; // Exit the program
            } else {
                System.out.println("Invalid option selected. Please try again.");
            }
            System.out.println("");
        }
    }
}