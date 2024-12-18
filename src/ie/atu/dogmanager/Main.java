package ie.atu.dogmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create DogManager object
        DogManager dogManagerObject = new DogManager();
        
        // Create Scanner object for user input
        Scanner userInput = new Scanner(System.in);

        int userSelection = 0;

        // Start loop for menu
        while (true) {
            // Print the menu with color
            printMenu();

            userSelection = userInput.nextInt();

            // Switch or if-else to handle user input
            switch (userSelection) {
                case 1: // Add Dog
                    System.out.println("Enter Dog Microchip Number");
                    int microchipNumber = userInput.nextInt();
                    System.out.println("Enter Dog Breed");
                    String breed = userInput.next();
                    System.out.println("Enter Dog weight (Kg)");
                    float weight = userInput.nextFloat();
                    System.out.println("Is the Dog hungry? (Yes/No):");
                    String hungerInput = userInput.next();  // Capture the input (Yes/No)

                    // Convert the "Yes" or "No" input to a boolean
                    boolean isHungry = hungerInput.equalsIgnoreCase("Yes");

                    // Create Dog Object
                    Dog myDog = new Dog(microchipNumber, breed, weight, isHungry);
                    dogManagerObject.addDog(myDog);
                    break;
                
                case 2: // Delete Dog
                    System.out.println("Enter Dog Microchip Number to delete:");
                    int microchipNumberToDelete = userInput.nextInt(); // Get the microchip number from the user

                    // Delete the dog using DogManager's delete method
                    boolean success = dogManagerObject.deleteDog(microchipNumberToDelete);

                    if (success) {
                        System.out.println("Dog with microchip number " + microchipNumberToDelete + " has been deleted.");
                    } else {
                        System.out.println("No dog found with Microchip Number: " + microchipNumberToDelete);
                    }
                    break;

                case 3: // Show Total Dogs
                    System.out.println("Total Number of Dogs: " + dogManagerObject.totalDogs());
                    break;

                case 4: // Search for Dog by ID
                    System.out.println("Enter Dog Microchip Number to search:");
                    int searchId = userInput.nextInt(); // Get the microchip number from the user

                    // Search for the dog using DogManager's search method
                    Dog foundDog = dogManagerObject.searchDogById(searchId);

                    if (foundDog != null) {
                        // Dog found, display its details
                        System.out.println("Dog Found!");
                        System.out.println("Microchip Number: " + foundDog.getmicrochipNumber());
                        System.out.println("Breed: " + foundDog.getbreed());
                        System.out.println("Weight: " + foundDog.getweight() + " Kg");
                        System.out.println("The dog is hungry: " + (foundDog.getisHungry() ? "Yes" : "No"));
                        System.out.println("Last Vet Visit: " + foundDog.getLastVetVisit());
                        System.out.println("Vaccination Status: " + foundDog.getVaccinationStatus());
                    } else {
                        // Dog not found
                        System.out.println("No dog found with Microchip Number: " + searchId);
                    }
                    break;

                case 5: // View All Dogs
                    dogManagerObject.showAllDogs();
                    break;

                case 6: // Print Dog Outline
                    DogOutline.printDogOutline(); // Call the method from DogOutline class
                    break;

                case 7: // Update Dog Details
                    System.out.println("Enter Dog Microchip Number to update:");
                    int microchipNumberToUpdate = userInput.nextInt();
                    
                    // Call the update method in DogManager to update the dog details
                    boolean updateSuccess = dogManagerObject.updateDogDetails(microchipNumberToUpdate);
                    
                    if (updateSuccess) {
                        System.out.println("Dog details updated successfully!");
                    } else {
                        System.out.println("No dog found with Microchip Number: " + microchipNumberToUpdate);
                    }
                    break;

                case 8: // Update Dog Medical Details
                    System.out.println("Enter Dog Microchip Number to update medical details:");
                    int microchipNumberToUpdateMedical = userInput.nextInt();
                    
                    // Call the update medical details method in DogManager
                    boolean updateMedicalSuccess = dogManagerObject.updateDogMedicalDetails(microchipNumberToUpdateMedical);

                    if (updateMedicalSuccess) {
                        System.out.println("Dog medical details updated successfully!");
                    } else {
                        System.out.println("No dog found with Microchip Number: " + microchipNumberToUpdateMedical);
                    }
                    break;

                case 9: // Quit
                    System.out.println("Student Application Closing - Goodbye!");
                    // Close the User Input Scanner
                    userInput.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid selection. Please choose again.");
            }
        }
    }

    public static void printMenu() {
        // Clear the screen (may not work in all environments but it helps in most terminals)
        System.out.print("\033[H\033[2J");
        System.out.flush();
    
        // Title with color
        System.out.println("\033[1;33m========================================\033[0m");
        System.out.println("\033[1;35m||   \033[1;32mDog Management App v1.0\033[1;35m   ||\033[0m");
        System.out.println("\033[1;33m========================================\033[0m");
    
        // Decorative line
        System.out.println("\033[1;36m-------------------------------------------------------------\033[0m");
    
        // Menu options with emojis and colors
        System.out.println("\033[1;36m(1)\033[0m \033[1;37mAdd a Dog \033[0m\033[1;32m🐶\033[0m");
        System.out.println("\033[1;36m(2)\033[0m \033[1;37mDelete a Dog \033[0m\033[1;31m❌\033[0m");
        System.out.println("\033[1;36m(3)\033[0m \033[1;37mShow Total Dogs \033[0m\033[1;34m📊\033[0m");
        System.out.println("\033[1;36m(4)\033[0m \033[1;37mSearch for Dog by ID \033[0m\033[1;34m🔍\033[0m");
        System.out.println("\033[1;36m(5)\033[0m \033[1;37mView All Dogs \033[0m\033[1;35m👀\033[0m");
        System.out.println("\033[1;36m(6)\033[0m \033[1;37mPrint Dog Outline \033[0m\033[1;32m📋\033[0m");
        System.out.println("\033[1;36m(7)\033[0m \033[1;37mUpdate Dog Details \033[0m\033[1;33m✏️\033[0m");
        System.out.println("\033[1;36m(8)\033[0m \033[1;37mUpdate Dog Medical Details \033[0m\033[1;33m💉\033[0m");
        System.out.println("\033[1;36m(9)\033[0m \033[1;37mQuit \033[0m\033[1;31m🚪\033[0m");
    
        // Another decorative line
        System.out.println("\033[1;36m-------------------------------------------------------------\033[0m");
    
        // Green prompt for user selection
        System.out.print("\n\033[1;32mSelect an option (1-9): \033[0m");
    }
}