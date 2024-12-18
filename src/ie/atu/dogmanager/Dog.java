package ie.atu.dogmanager;

public class Dog extends Animal {

    // Fields (Attributes)
    private int microchipNumber;
    private String breed;
    private float weight;
    private boolean isHungry;
    private String lastVetVisit;  // New field for the last vet visit date
    private String vaccinationStatus;  // New field for vaccination status

    // Constructor
    public Dog(int microchipNumber, String breed, float weight, boolean isHungry, String lastVetVisit, String vaccinationStatus) {
        this.microchipNumber = microchipNumber;
        this.breed = breed;
        this.weight = weight;
        this.isHungry = isHungry;
        this.lastVetVisit = lastVetVisit;
        this.vaccinationStatus = vaccinationStatus;
    }

    // Getter Methods
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

    // Setter Methods (Optional for updates)
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

    // Overridden method from the Animal class
    @Override
    public String showColour() {
        return "Brown"; // Default color
    }
}
