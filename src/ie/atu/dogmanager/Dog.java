package ie.atu.dogmanager;

public class Dog extends Animal {

    // Fields (Attributes)
    private int microchipNumber;
    private String breed;
    private float weight;
    private boolean isHungry;
    private String lastVetVisit;
    private String vaccinationStatus;

    // Constructor
    public Dog(int microchipNumber, String breed, float weight, boolean isHungry) {
        this.microchipNumber = microchipNumber;
        this.breed = breed;
        this.weight = weight;
        this.isHungry = isHungry;
        this.lastVetVisit = "Not Available";  // Default value
        this.vaccinationStatus = "Not Available";  // Default value
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

    public String getLastVetVisit() {
        return lastVetVisit;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    // Setter Methods
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

    public void setLastVetVisit(String lastVetVisit) {
        this.lastVetVisit = lastVetVisit;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    // Overridden method from the abstract Animal class
    @Override
    public String showColour() {
        return "Brown"; // Default color, can be modified
    }
}
