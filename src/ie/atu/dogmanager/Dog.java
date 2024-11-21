package ie.atu.dogmanager;

public class Dog {
    // Instanve Variables //
    private int microchipNumber; // Unique ID
    private String name;
    private float breed;
    private boolean isHungry; // true if hungry, false if not

    //Constructor
    public Dog (int microchipNumber , String name , float breed , boolean isHungry){
        this.microchipNumber = microchipNumber;
        this.name = name;
        this.breed = breed;
        this.isHungry = isHungry;

    }
    // Getter and Setter Methods
    public int getmicrochipNumber() {
        return this.microchipNumber;
    }

    public String getname() {
        return this.name;
    }

    public float getbreed() {
        return this.breed;
    }

    public boolean getisHungry() {
        return this.isHungry;
    }

    public void setMicrochipNumber(int microchipNumber) {
        this.microchipNumber = microchipNumber;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setbreed(float breed) {
        this.breed = breed;
    }

    public void setisHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

}
