package ie.atu.dogmanager;

public class DogManager {

    // Create an aray to store dog object
    private Dog[] dogs;

    // Constructor
    public DogManager() {
        // initialize array to store 10 dog objects
        dogs = new Dog[100];
    }

    // Method to add dog object to the array
    public void addDog(Dog dog) {
        // Loop through array to find first empty slot
        for (int i = 0; i < dogs.length; i++) {
            // Check if slot is empty
            if (dogs[i] == null) {
                // Add dog object to array
                dogs[i] = dog;
                // Exit Loop
                break;

            }
        }

    }

    public boolean deleteDog(int microchipNumber) {
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null && dogs[i].getmicrochipNumber() == microchipNumber) {
                dogs[i] = null;  // Set the slot to null to "delete" the dog
                return true;  // Return true if deletion was successful
            }
        }
        return false;  // Return false if no dog was found with that microchip number
    }
    


// Method to find the total number of Watch objects in the array
public int totalDogs() {
    // Initialize counter
    int total = 0;
    // Loop through array
    for (int i = 0; i < dogs.length; i++) {
        // Check if slot is not empty
        if (dogs[i] != null) {
            // Increment counter
            total++;
        }
    }
    // Return total number of Watch objects
    return total;
}

    // Method to search for a dog by its microchip number
    public Dog searchDogById(int microchipNumber) {
        // Loop through the array of dogs
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null && dogs[i].getmicrochipNumber() == microchipNumber) {
                System.out.println("Dog found with microchip number: " + dogs[i].getmicrochipNumber());  // Debug message
                return dogs[i]; // Return the dog if found
            }
        }
        return null; // Return null if no dog is found with that ID
    }
}





 