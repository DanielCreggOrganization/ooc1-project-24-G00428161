package ie.atu.dogmanager;

public class Dog extends Animal {

    // Fields (Attributes)
    private int microchipNumber;
    private String breed;
    private float weight;
    private boolean isHungry;

    // Constructor
    public Dog(int microchipNumber, String breed, float weight, boolean isHungry) {
        this.microchipNumber = microchipNumber;
        this.breed = breed;
        this.weight = weight;
        this.isHungry = isHungry;
    }

    // Getter Methods (Encapsulation)
    public int getmicrochipNumber() {
        return microchipNumber;
    }

    public String getbreed() {
        return breed;
    }

    public float getweight() {
        return weight;
    }

    public boolean getisHungry() {
        return isHungry;
    }

    // Overridden method from the abstract Animal class
    @Override
    public String showColour() {
        // Assuming all dogs are the same color for now. You can change this if you want to ask the user for color.
        return "Brown"; // Default color
    }

    // Setters (Optional, if you want to allow changes to the attributes)
    public void setMicrochipNumber(int microchipNumber) {
        this.microchipNumber = microchipNumber;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
}

