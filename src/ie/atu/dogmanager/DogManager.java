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
}




 