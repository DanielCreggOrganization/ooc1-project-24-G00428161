[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17263130)
# OOC1 Project

**Title:** Computing and Digital Media Student
**Name:** Zain Haider
**Student ID:** G00428161

## Application Function

The Dog Management Application is a simple Java-based application that helps users manage a list of dogs. Users can add, delete, update, and search for dogs by their microchip number, as well as view details about all dogs in the system. Additionally, the program enables the maintenance of medical information, including the status of vaccinations and the most recent veterinary appointment.

In addition to being user-friendly and easily extensible, this project showcases object-oriented programming (OOP) concepts including inheritance, encapsulation, and polymorphism.

## Running the Application

-Ensure you have Java 8 or a later version installed.

-Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse) or use a text editor (e.g., Visual Studio Code).
Make sure all Java files (Main.java, DogManager.java, Dog.java, etc.) are in the correct directory (inside the src/ie/atu/dogmanager/ directory).

-You will have to manually compile the Java files if you are not using an IDE. Go to the project folder in your terminal or command prompt, then type the following command:

-Once the files are compiled, you can run the application using the following command - "java -cp bin ie.atu.dogmanager.Main"

- This will launch the application, and you'll see the menu displayed in the console.
 
 - You will be asked to select an option from the menu when the application launches. The user interaction operates as follows:
Option 1: Add a Dog: To add a dog, input its breed, weight, hunger status, last veterinarian visit, immunization history, and microchip number.
Option 2: Delete a Dog: Type in the dog's microchip number to remove it.
Option 3: Show Total Dogs: This option shows how many dogs are in the system as of right now.
Option 4: Dog ID Search: Use a dog's microchip number to find it.
Option 5: View All Dogs: This option shows a list of every dog along with all of their information.
Option 6: Print Dog Outline: This option shows a dog's outline.
Option 7: Update Dog Details: Modify a dog's breed, weight, and level of hunger.
Option 8: Update Dog Medical Details: Update the most recent veterinary visit and history of a dog.
Option 9: Quit: Get out of the application.

- Once you are finished interacting with the application, select Option 9 to quit and close the program.



## Minimum Project Requirements

Describe how you have met all minimum project requirements below:

* The repository contains, at minimum, two commits per week : The repository is updated frequently, and every change demonstrates the development of the Dog Management Application. Since every modification is done and saved in an understandable manner, it is simple to follow the project's progress.


* The project, including code and documentation, is fully contained in the provided GitHub Classroom repository. The GitHub Classroom repository houses the complete project, including the code and documentation. The files are clearly arranged, with Java classes kept in folders like src/ie/atu/dogmanager/. Everything required for the project is readily available in the repository.

* Methods = Add Item, Remove Item, Update Item, Find total items, Search Items and Quit.
The following necessary techniques are used in accordance with the guidelines:

-Add Dog: Applied in the DogManager class's addDog() function. A new dog object can be added to the system by the user.
-Delete Dog: Applied in the DogManager class's deleteDog() function. By entering the microchip number, it enables the user to delete a dog from the system.
-Update Dog Details: Applied to the DogManager class's updateDogDetails() and updateDogMedicalDetails() methods. These enable the user to edit a dog's medical records or other details.
-Show total number of dogs: Applied in the DogManager class's totalDogs() function. The total number of dogs in the system is returned by this.
-Search Dog: Applied in the DogManager class's searchDogById() function. By using the dog's microchip number, the user can find it.
-Quit: In the event that the user chooses to leave the main menu (option 9), the application efficiently handles the quit() process by utilizing return after showing a message.

* The code MUST compile.
The code successfully compiles without errors. All classes and methods are properly defined, and there are no syntax issues preventing the program from being compiled and run.


* The application code must be formatted in a consistent and standard way.
The application code is consistently formatted according to standard Java conventions. This makes it easier to understand and maintain by using consistent naming standards for variables and classes, explicit method separation, and appropriate indentation.


* The code must contain comments. One comment per class, method and variable at minimum.
Every class, function, and variable in the code has comments. Methods are explained with comments describing their functioning, variables are annotated to indicate their position inside the program, and each class gets a brief comment explaining its purpose. This contributes to the code's increased readability and clarity.


* The documentation and commentary must be free of a grammar and speling mistakes.
The documentation and comments in the code are free from grammar and spelling mistakes.To guarantee readability and professionalism in the codebase, all descriptions, variable names, and method explanations are written accurately and concisely.


## Project Requirements above and beyond

Discuss any application features or design elements that show you went above and beyond basic requirements.

-User-Friendly Interface with Color-Coding:: Color coding is used in the main menu to improve readability and user experience. The interface is made more interesting and user-friendly by employing distinct colors for the menu title and selections.

-Input Validation: When adding, editing, or removing dogs, the application verifies that the user input is correct. For instance, it politely responds to "Yes/No" questions about whether a dog is hungry, preventing erroneous inputs from being handled.

-Modularization of Methods: The DogManager class contains methods like addDog(), deleteDog(), and updateDogDetails() that are intended to manage particular tasks in a modular fashion. The code is easier to test and maintain because to this structure. It also encourages methods to be reused.

-Animal Class Inheritance:The Dog class uses inheritance to expand the Animal class. Future additions to the application (such as additional animal species like cats) can be made thanks to this architecture without significantly altering the current software.

-Clear Division of Duties: The application makes a clear division of duties. For instance, the DogManager class manages all dog-related tasks, whereas the Main class concentrates on user interaction. The code is easier to maintain and more modular as a result of this division.

-Interactive ASCII Art: An ASCII art representation of a dog is printed by the DogOutline class. This little yet captivating feature gives the app a little more originality and demonstrates an extra effort to make it more visually appealing.

-Error Handling for Edge Cases: When a dog cannot be located, the searchDogById() and deleteDog() methods notify the user of any problems with their input.


## Application Architecture

Overview of Classes and Application Structure
Using several classes to manage dogs and manage user interactions, the Dog Management Application has a simple, modular architecture. A thorough explanation of the classes and methods utilized in the program can be seen below.

-Main Class

Purpose: The entry point of the application. It is responsible for handling user interactions through a menu-driven interface. Users can choose various options, such as adding, deleting, or updating dog information.

Key Methods:
* main(): This is the main method that starts the application, displays the menu, and handles the user’s selection to perform actions on the dog records.
printMenu(): Displays a menu for the user to select actions.

-DogManager Class

Purpose: This class manages all dog records. It stores and performs operations on a collection of dogs. It includes methods for adding, deleting, updating, and searching for dogs.

Key Methods:
* addDog(Dog dog): Adds a new dog to the list of dogs.
* deleteDog(int microchipNumber): Removes a dog from the list based on its microchip number.
* totalDogs(): Returns the total number of dogs currently stored in the system.
* searchDogById(int microchipNumber): Searches for a dog by its microchip number and returns the dog if found.
* showAllDogs(): Displays all dogs in the system, showing their details like breed, weight, and medical status.
* updateDogDetails(int microchipNumber): Updates the non-medical details (e.g., breed, weight) of a specific dog based on its microchip number.
* updateDogMedicalDetails(int microchipNumber): Updates the medical details (e.g., last vet visit, vaccination status) of a specific dog.

-Dog Class

Purpose: Serves as a system representation of a dog's characteristics and actions. Microchip number, breed, weight, hunger condition, and medical information (latest veterinary visit and immunization history) are among the data it contains.

Key Methods:
* getmicrochipNumber(): Returns the dog’s microchip number.
* getbreed(): Returns the dog’s breed.
* getweight(): Returns the dog’s weight.
* getisHungry(): Returns whether the dog is hungry or not.
* getLastVetVisit(): Returns the last vet visit date.
* getVaccinationStatus(): Returns the vaccination status of the dog.
* setBreed(String breed): Sets the dog’s breed.
* setWeight(float weight): Sets the dog’s weight.
* setIsHungry(boolean isHungry): Sets whether the dog is hungry.
* setLastVetVisit(String lastVetVisit): Sets the last vet visit date.
* setVaccinationStatus(String vaccinationStatus): Sets the dog’s vaccination status.
* showColour(): This is an overridden method from the Animal class, which provides the dog’s color (in this case, "Brown").

-Animal Class (Abstract)

Purpose: This abstract class is the foundation of the Dog class. It guarantees that any subclass (such as Dog) implements its own version of the showColour() method by defining a common structure for all animal-related classes (in this case, dogs).

Key Methods:
* showColour(): An abstract method that must be implemented by subclasses to specify the color of the animal.

-DogOutline Class

Purpose: This class is responsible for displaying an ASCII art of a dog. It is an optional feature for added fun, enhancing the user experience with a visual representation of a dog.

Key Methods:
* printDogOutline(): Prints an ASCII art representation of a dog on the screen.



The Main class, which displays a menu of options, is where users can interact with the application. To add, remove, update, or search for dogs, the user choose which method from the DogManager class to utilize. The Dog class is based on the Animal class, which offers a structure for handling and storing dog-specific data and features. Along with methods to handle these variables, the Dog class includes information about the dog's breed, weight, medical status, and microchip number. The DogOutline class also gives the application a whimsical touch by showing ASCII art of a dog, which improves the user experience by adding an entertaining and eye-catching aspect.


## Roadblocks and Unfinished Functionality

While developing the Dog Management Application, there were a few aspects I was not able to fully complete or that presented challenges during the process.

Issues Faced:

-User Input Validation: One of the main issues encountered was ensuring robust input validation. For instance, the application asks the user for information about the dog, such as its breed, weight, and microchip number. However, input validation might be enhanced (e.g., verifying that the microchip number is unique or that the weight is a legitimate number). In its current state, unexpected behavior or crashes could result from invalid inputs.

Potential Solution: Putting in place more comprehensive user input checks would aid in error prevention. For example, the system's dependability would be increased by employing try-catch blocks to parse numerical input and by including checks to make sure that duplicate microchip numbers aren't entered.

-Menu Design: Users must input numbers to select options in this extremely simple menu interface. A more interactive, user-friendly menu design would be preferable, possibly using a graphical user interface (GUI) or improved error handling for erroneous inputs.

Potential Solution: A more user-friendly interface might be made by utilizing a GUI framework such as JavaFX. As an alternative, more sophisticated text-based menus with user-friendly feedback and instructions might be implemented.


What I Would Have Done Differently?

-Emphasis on Robust Input Validation: I would make sure that all user input is appropriately validated to prevent unexpected behavior, such inputting a date in the wrong format or a dog's weight in a non-numeric number.

-Enhance the Menu Interface: I would add a GUI or create a more elegant command-line menu with error handling to create a better user interface.

- I would allow users to search for dogs by multiple criteria (e.g., breed, weight range, last vet visit).
Reason: Right now, the application only allows searching by microchip number. Providing multiple search options would make the app more flexible and powerful for users.

## Resources

Provide links to resources used:

* https://www.w3schools.com/java/default.asp
* https://stackoverflow.com/questions/26183177/write-a-java-application-to-model-a-dog-with-attributes-and-behaviours
* https://www.javatpoint.com/internal-details-of-hello-java-program
* https://github.com/DanielCreggOrganization/w11-lab-abstraction-G00428161?tab=readme-ov-file#5-practical-applications
* https://github.com/DanielCreggOrganization/w10-lab-polymorphism-G00428161
* https://github.com/DanielCreggOrganization/w8-lab-inheritance-G00428161



