package ie.atu.dogmanager;

public class Dog {
    // Instanve Variables //
    private int microchipNumber; // Unique ID
    private String breed;
    private float weight;
    private boolean isHungry; // true if hungry, false if not

    //Constructor
    public Dog (int microchipNumber , String name , float breed , boolean isHungry){
        this.microchipNumber = microchipNumber;
        this.breed = name;
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

    public void setname(String breed) {
        this.breed = breed;
    }

    public void setbreed(float weight) {
        this.weight = weight;
    }

    public void setisHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

}
