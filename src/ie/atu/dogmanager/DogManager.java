package ie.atu.dogmanager;

public class DogManager {

    // Create an array to store dog objects
    private Dog[] dogs;

    // Constructor
    public DogManager() {
        // Initialize array to store 100 dog objects
        dogs = new Dog[100];
    }

    // Method to add a dog object to the array
    public void addDog(Dog dog) {
        // Loop through array to find first empty slot
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] == null) {
                // Add dog object to array
                dogs[i] = dog;
                break;
            }
        }
    }

    // Method to delete a dog by its microchip number
    public boolean deleteDog(int microchipNumber) {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null && dogs[i].getmicrochipNumber() == microchipNumber) {
                dogs[i] = null;  // Set the slot to null to "delete" the dog
                return true;  // Return true if deletion was successful
            }
        }
        return false;  // Return false if no dog was found with that microchip number
    }

    // Method to find the total number of dogs in the array
    public int totalDogs() {
        int total = 0;
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null) {
                total++;
            }
        }
        return total;
    }

    // Method to search for a dog by its microchip number
    public Dog searchDogById(int microchipNumber) {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null && dogs[i].getmicrochipNumber() == microchipNumber) {
                return dogs[i]; // Return the dog if found
            }
        }
        return null; // Return null if no dog is found with that ID
    }

    // Method to show all dogs stored in the system
    public void showAllDogs() {
        // Print the headers for the table
        System.out.printf("%-15s%-20s%-15s%-10s\n", "Microchip", "Breed", "Weight (kg)", "Hungry");
        System.out.println("------------------------------------------------------------");
        
        // Loop through the dogs array and print each dog in formatted table style
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null) {
                System.out.printf("%-15d%-20s%-15.2f%-10s\n",
                        dogs[i].getmicrochipNumber(),
                        dogs[i].getbreed(),
                        dogs[i].getweight(),
                        dogs[i].getisHungry() ? "Yes" : "No");
            }
        }
    }
}
