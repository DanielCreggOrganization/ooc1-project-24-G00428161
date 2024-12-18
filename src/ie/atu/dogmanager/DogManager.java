package ie.atu.dogmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class DogManager {
    private ArrayList<Dog> dogs;

    public DogManager() {
        dogs = new ArrayList<>();
    }

    // Method to add a dog to the ArrayList
    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    // Method to delete a dog by its microchip number
    public boolean deleteDog(int microchipNumber) {
        for (Dog dog : dogs) {
            if (dog.getmicrochipNumber() == microchipNumber) {
                dogs.remove(dog);  // Remove the dog from the list
                return true;
            }
        }
        return false; // Return false if no dog with that microchip number is found
    }

    // Method to return the total number of dogs
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

    // Method to show all dogs in the system, including health info
    public void showAllDogs() {
        System.out.printf("%-15s%-20s%-15s%-10s%-20s%-20s\n", "Microchip", "Breed", "Weight (kg)", "Hungry", "Last Vet Visit", "Vaccination Status");
        System.out.println("--------------------------------------------------------------------------------------------------");

        for (Dog dog : dogs) {
            System.out.printf("%-15d%-20s%-15.2f%-10s%-20s%-20s\n",
                    dog.getmicrochipNumber(),
                    dog.getbreed(),
                    dog.getweight(),
                    dog.getisHungry() ? "Yes" : "No",
                    dog.getLastVetVisit(),
                    dog.getVaccinationStatus());
        }
    }

    // Method to update a dog's details (breed, weight, hunger status)
    public boolean updateDogDetails(int microchipNumber) {
        Scanner userInput = new Scanner(System.in);  // Instantiate Scanner here

        for (Dog dog : dogs) {
            if (dog.getmicrochipNumber() == microchipNumber) {
                // Dog found, proceed with updating details

                System.out.println("Enter new breed for the dog (current: " + dog.getbreed() + "):");
                String newBreed = userInput.nextLine();
                dog.setBreed(newBreed);

                System.out.println("Enter new weight for the dog (current: " + dog.getweight() + " kg):");
                float newWeight = userInput.nextFloat();
                dog.setWeight(newWeight);

                // Asking if the dog is hungry
                System.out.println("Is the dog hungry? (current: " + (dog.getisHungry() ? "Yes" : "No") + ")");
                userInput.nextLine();  // Consume the leftover newline
                String hungerInput = userInput.nextLine();  // Capture the input as a string
                boolean isHungry = hungerInput.equalsIgnoreCase("Yes");
                dog.setIsHungry(isHungry);

                System.out.println("Dog details updated successfully!");
                return true;  // Return true if the update was successful
            }
        }
        return false;  // Return false if no dog is found with the given microchip number
    }

    // Method to update a dog's medical details (last vet visit, vaccination status)
    public boolean updateDogMedicalDetails(int microchipNumber) {
        Scanner userInput = new Scanner(System.in);  // Instantiate Scanner here

        for (Dog dog : dogs) {
            if (dog.getmicrochipNumber() == microchipNumber) {
                // Dog found, proceed with updating medical details

                System.out.println("Enter the date of the last vet visit (current: " + dog.getLastVetVisit() + "):");
                String lastVetVisit = userInput.nextLine();
                dog.setLastVetVisit(lastVetVisit);

                // Asking for vaccination status
                System.out.println("Enter the vaccination status (Vaccinated/Not Vaccinated) (current: " + dog.getVaccinationStatus() + "):");
                String vaccinationStatus = userInput.nextLine().trim();
                dog.setVaccinationStatus(vaccinationStatus);

                System.out.println("Dog medical details updated successfully!");
                return true;  // Return true if the update was successful
            }
        }
        return false;  // Return false if no dog is found with the given microchip number
    }
}
