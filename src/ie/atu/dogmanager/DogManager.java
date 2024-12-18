package ie.atu.dogmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class DogManager {
    // Use ArrayList to store Dog objects
    private ArrayList<Dog> dogs;

    // Constructor
    public DogManager() {
        // Initialize the ArrayList
        dogs = new ArrayList<>();
    }

    // Method to add a dog to the ArrayList
    public void addDog(Dog dog) {
        dogs.add(dog); // Simply add the dog to the list
    }

    // Method to delete a dog by its microchip number
    public boolean deleteDog(int microchipNumber) {
        for (Dog dog : dogs) {
            if (dog.getmicrochipNumber() == microchipNumber) {
                dogs.remove(dog); // Remove the dog from the list
                return true;
            }
        }
        return false; // Return false if no dog with that microchip number is found
    }

    // Method to find the total number of dogs
    public int totalDogs() {
        return dogs.size(); // Return the size of the ArrayList
    }

    // Method to search for a dog by its microchip number
    public Dog searchDogById(int microchipNumber) {
        for (Dog dog : dogs) {
            if (dog.getmicrochipNumber() == microchipNumber) {
                return dog; // Return the dog if found
            }
        }
        return null; // Return null if no dog found with that ID
    }

    // Method to show all dogs in the system
    public void showAllDogs() {
        System.out.printf("%-15s%-20s%-15s%-10s\n", "Microchip", "Breed", "Weight (kg)", "Hungry");
        System.out.println("------------------------------------------------------------");

        for (Dog dog : dogs) {
            System.out.printf("%-15d%-20s%-15.2f%-10s\n",
                    dog.getmicrochipNumber(),
                    dog.getbreed(),
                    dog.getweight(),
                    dog.getisHungry() ? "Yes" : "No");
        }
    }

    // Method to update a dog's details
    public boolean updateDogDetails(int microchipNumber) {
        for (Dog dog : dogs) {
            if (dog.getmicrochipNumber() == microchipNumber) {
                Scanner userInput = new Scanner(System.in);

                System.out.println("Enter new breed for the dog (current: " + dog.getbreed() + "):");
                String newBreed = userInput.nextLine();
                dog.setBreed(newBreed);

                System.out.println("Enter new weight for the dog (current: " + dog.getweight() + " kg):");
                float newWeight = userInput.nextFloat();
                dog.setWeight(newWeight);

                System.out.println("Is the dog hungry? (current: " + (dog.getisHungry() ? "Yes" : "No") + ")");
                boolean isHungry = userInput.nextBoolean();
                dog.setIsHungry(isHungry);

                System.out.println("Dog details updated successfully!");
                return true; // Update successful
            }
        }
        return false; // If no dog is found with the given microchip number
    }
}
