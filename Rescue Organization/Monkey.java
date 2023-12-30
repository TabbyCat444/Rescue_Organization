
public class Monkey extends RescueAnimal {
	
	//Instance variables - all strings to match the other classes's example
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	//Constructor
	public Monkey(String name, String species, String gender, String age,
	String weight, String tailLength, String height, String bodyLength, 
	String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}
	
	// Mutators and accessors
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setTailLength(String monkeyTail) {
		tailLength = monkeyTail;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setBodyLength(String monkeyBody) {
		bodyLength = monkeyBody;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
