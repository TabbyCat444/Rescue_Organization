import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
    	
    	
        initializeDogList();
        initializeMonkeyList();

    // Add a loop that displays the menu, accepts the users input and takes the appropriate action.
	// For the project submission you must also include input validation and appropriate feedback to the user.
    // Hint: create a Scanner and pass it to the necessary methods
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        
        displayMenu(); // displays menu first time
        
        Scanner scanner = new Scanner(System.in);
        char menuSelection;
        
        // Menu loop and switch, selecting q terminates the program
        do {
        	menuSelection = scanner.next().charAt(0);
        	
        	switch (menuSelection) {
        		case '1':
        			System.out.println("Intake a new dog.");
        			intakeNewDog(scanner);
        			break;
        			
        		case '2':
        			System.out.println("Intake a new monkey.");
        			intakeNewMonkey(scanner);
        			break;
        			
        		case '3':
        			System.out.println("Reserve an animal.");
        			reserveAnimal(scanner);
        			break;
        			
        		case '4':
        			System.out.println("Print list of all dogs.");
        			printAnimals("dog");
        			break;
        			
        		case '5':
        			System.out.println("Print a list of all monkeys.");
        			printAnimals("monkey");
        			break;
        			
        		case '6':
        			System.out.println("Print out a list of all animals that are not reserved.");
        			printAnimals("available");
        			break;
        		
        		// Included this case because although the do while loop would still terminate
        		// if q was entered, it would first print out the invalid input statement	
        		case 'q':
        			System.out.println("Goodbye.");
        			break;
        			
        		default:
        			System.out.println("Please enter a valid option");
        			displayMenu();
        	}
        }
        while (menuSelection != 'q');

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        scanner.nextLine();  // allows input for dog name
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }            	
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("Enter dog's breed: ");
    	String breed = scanner.nextLine();
    	
    	System.out.println("Enter gender: ");
    	String gender = scanner.nextLine();
    	
    	System.out.println("Enter age: ");
    	String age = scanner.nextLine();
    	
    	System.out.println("Enter weight: ");
    	String weight = scanner.nextLine();
    	
    	System.out.println("Enter acqusition date: ");
    	String acquisitionDate = scanner.nextLine();
    	
    	System.out.println("Enter acqusition country: ");
    	String acquisitionCountry = scanner.nextLine();
    	
    	System.out.println("Enter training status: ");
    	String trainingStatus = scanner.nextLine();
    	
    	System.out.println("Reserved? (true or false): ");
    	boolean reserved  = scanner.nextBoolean();
    	
    	System.out.println("Enter country of service: ");
    	String inServiceCountry = scanner.nextLine();
    	
    	Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
    	
    	dogList.add(dog);
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    	public static void intakeNewMonkey(Scanner scanner) {
    		System.out.println("What is the monkey's name?");
    		scanner.nextLine();
    		String name = scanner.nextLine();
    		for(Monkey monkey: monkeyList) {
    			if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
    			}
    		}
    		
    		//prompt for valid monkey species
    		System.out.println("Enter monkey's species: ");
        	String species = scanner.nextLine();
        	while (true) {
        		if (species.equalsIgnoreCase("Capuchin")) {
        			break;
        		}
        		else if (species.equalsIgnoreCase("Guenon")) {
        			break;
        		}
        		else if (species.equalsIgnoreCase("Macaque")) {
        			break;
        		}
        		else if (species.equalsIgnoreCase("Marmoset")) {
        			break;
        		}
        		else if (species.equalsIgnoreCase("Squirrel Monkey")) {
        			break;
        		}
        		else if (species.equalsIgnoreCase("Tamarin")) {
        			break;
        		}
        		else {
        			System.out.println("Please enter a valid species from the the following options:"
        					+ " capuchin, guenon, macaque, marmoset, squirrel monkey, or tamarin.");
        			species = scanner.nextLine();
        		}
        	}
        	
        	
        	System.out.println("Enter gender: ");
        	String gender = scanner.nextLine();
        	
        	System.out.println("Enter age: ");
        	String age = scanner.nextLine();
        	
        	System.out.println("Enter weight: ");
        	String weight = scanner.nextLine();
        	
    		System.out.println("Enter tail length: ");
    		String tailLength = scanner.nextLine();
    		
    		System.out.println("Enter height: ");
    		String height = scanner.nextLine();
    		
    		System.out.println("Enter body length: ");
    		String bodyLength = scanner.nextLine();
    		
    		System.out.println("Enter acqusition date: ");
        	String acquisitionDate = scanner.nextLine();
        	
        	System.out.println("Enter acqusition country: ");
        	String acquisitionCountry = scanner.nextLine();
        	
        	System.out.println("Enter training status: ");
        	String trainingStatus = scanner.nextLine();
        	
        	System.out.println("Reserved? (true or false): ");
        	boolean reserved  = scanner.nextBoolean();
        	
        	System.out.println("Enter country of service: ");
        	String inServiceCountry = scanner.nextLine();
        	
        	Monkey monkey = new Monkey(name, species, gender, age, weight, tailLength, height, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        	
        	monkeyList.add(monkey);
    	}

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Reserve a dog or a monkey?");
            scanner.nextLine();
            String animalChoice = scanner.nextLine();
            if (animalChoice.equalsIgnoreCase("dog")) {
            	System.out.println("Please enter country of service: ");
            	String dogCountry = scanner.nextLine();
            	//prints a list of dogs currently in the provided country of service
            	for (Dog dog: dogList) {
            		if (dog.getInServiceLocation().equalsIgnoreCase(dogCountry)) {
            			System.out.println("Name: " + dog.getName() + " - Training Status: " + dog.getTrainingStatus() + 
            					" - Country of service: " + dog.getInServiceLocation() + " - Reserved: " + dog.getReserved());
            		}
            	}
            	// Reserves selected dog
            	System.out.println("Please enter desired animal:");
            	String dogChoice = scanner.nextLine();
            		for (Dog dog1: dogList) {
            			if ((dog1.getName().equalsIgnoreCase(dogChoice)) && (dog1.getReserved() == false)) {
            				System.out.println(dog1.getName() + " is now reserved");
            				dog1.setReserved(true);
            			}
            		}
            	displayMenu();
            	
            }
            else if (animalChoice.equalsIgnoreCase("monkey")) {
            	System.out.println("Please enter country of service: ");
            	String monkeyCountry = scanner.nextLine();
            	// prints list of monkeys in provided service country
            	for (Monkey monkey: monkeyList) {
            		if (monkey.getInServiceLocation() == monkeyCountry) {
            			System.out.println("Name: " + monkey.getName() + " - Training Status: " + monkey.getTrainingStatus() + 
            					" - Country of service: " + monkey.getInServiceLocation() + " - Reserved: " + monkey.getReserved());
            		}
            	}
            	// Reserves selected animal
            	System.out.println("Please enter desired animal:");
            	String monkeyChoice = scanner.nextLine();
            	for (Monkey monkey1: monkeyList) {
            		if ((monkey1.getName().equalsIgnoreCase(monkeyChoice)) && (monkey1.getReserved() == false)) {
            			System.out.println(monkey1.getName() + " is now reserved.");
            			monkey1.setReserved(true);
            		}
            	}
            	displayMenu();
            }
            
            // input validation
            else {
            	System.out.println("Please chose 'dog' or 'monkey'.");
            	reserveAnimal(scanner);
            }

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String listChoice) {
        	if (listChoice == "dog") {
        		System.out.println("Rescue Dogs:");
        		for (Dog dog: dogList) {
        			System.out.println("Name: " + dog.getName() + " - Training Status: " + dog.getTrainingStatus() + 
        					" - Country acquired: " + dog.getAcquisitionLocation() + " - Reserved: " + dog.getReserved());
        		}
        		displayMenu();
        	}
        	else if (listChoice == "monkey") {
        		System.out.println("Rescue Monkeys:");
        		for (Monkey monkey: monkeyList) {
        			System.out.println("Name: " + monkey.getName() + " - Training Status: " + monkey.getTrainingStatus() + 
        					" - Country acquired: " + monkey.getAcquisitionLocation() + " - Reserved: " + monkey.getReserved());
        		}
        		displayMenu();
        	}
        	else if (listChoice == "available" ) {
        		System.out.println("Available Rescue Animals:");
        		
        		System.out.println("Available Dogs:");
        		for (Dog dog: dogList) {
        			if ((dog.getTrainingStatus() == "in service") && (dog.getReserved() == false)) {
        				System.out.println("Name: " + dog.getName() + " - Training Status: " + dog.getTrainingStatus() + 
            					" - Country acquired: " + dog.getAcquisitionLocation() + " - Reserved: " + dog.getReserved());
        			}
        		}
        		System.out.println();
        		System.out.println("Available Monkeys:");
        		for (Monkey monkey: monkeyList) {
        			if ((monkey.getTrainingStatus() == "in service") && (monkey.getReserved() == false)) {
        				System.out.println("Name: " + monkey.getName() + " - Training Status: " + monkey.getTrainingStatus() + 
            					" - Country acquired: " + monkey.getAcquisitionLocation() + " - Reserved: " + monkey.getReserved());
        			}
        		}
        		displayMenu();
        	}
        }
}

