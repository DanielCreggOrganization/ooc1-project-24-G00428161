package ie.atu.dogmanager;

public class Dog extends Animal {
    // Instance Variables
    private int microchipNumber; // Unique ID
    private String breed;
    private float weight;
    private boolean isHungry; // true if hungry, false if not

    // Constructor (Fixed version)
    public Dog(int microchipNumber, String breed, float weight, boolean isHungry) {
        this.microchipNumber = microchipNumber;
        this.breed = breed;
        this.weight = weight; 
        this.isHungry = isHungry;
    }

    // Getter and Setter Methods
    public int getmicrochipNumber() {
        return this.microchipNumber;
    }

    public String getbreed() {
        return this.breed;
    }

    public float getweight() {
        return this.weight;
    }

    public boolean getisHungry() {
        return this.isHungry;
    }

    public void setMicrochipNumber(int microchipNumber) {
        this.microchipNumber = microchipNumber;
    }

    public void setbreed(String breed) {
        this.breed = breed;
    }

    public void setweight(float weight) {
        this.weight = weight;
    }

    public void setisHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // Overridden method from Animal class
    @Override
    public String showColour() {
        return "Black"; // Example color
    }
}
