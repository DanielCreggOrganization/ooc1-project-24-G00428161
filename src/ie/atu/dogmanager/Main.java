package ie.atu.dogmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instantiate Scanner class so we can start reading user input
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store user Menu option selection

        while (true) {
            // Display Menu to console
            System.out.println("");
            System.out.println("###################################");
            System.out.println("#     Dog Application v0.9  #");
            System.out.println("###################################");
            System.out.println("(1) Add a Dog.");
            System.out.println("(2) Delete a Dog");
            System.out.println("(3) Show total number of dogs.");
            System.out.println("(4) Search for Dog by Id");
            System.out.println("(5) Quit.");
            System.out.println("Select an option from 1 to 5 and press Enter>");

            // Store user Menu option selection
            userSelection = userInput.nextInt();

            if (userSelection == 5) { // Quit

                System.out.println("Student Application Closing - Goodbye!");
                // Close the User Input Scanner
                userInput.close();
                break; // Break out of display menu Infinite loop

            }
        }
    }
}