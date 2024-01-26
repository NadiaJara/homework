package hw5JavaVariablesInitialized;

/*
 Variable names start with lowercase
 Variables follow camel case feature and snake case pattern
 The most common variables are: String, int, char, boolean, and double
 */

public class MySelf {

	public String myCity; // variable declared
	public String myName = "Nadia Jara"; // lines 11-14 variables initialized
	public byte myBirthMonth = 03;
	public short myHomeAddress = 12047;
	public int myAge = 12;
	public long myBirthYear = 2011;
	public float myHeight = 5.4f;
	public double myGrade = 7.0;
	public char myGender = 'F';
	public boolean fullTimeStudent = true;

	public MySelf() {
		System.out.println("I am a Constructor");
	}

	public void mySelf() {
		System.out.println("My Name: " + myName + "\nMy Birth Month: " + myBirthMonth + "\nMy Home Address: "
				+ myHomeAddress + "\nMy Age: " + myAge + "\nMy Birth Year: " + myBirthYear + "\nMy Height: " + myHeight
				+ "\nMy Grade: " + myGrade + "\nMy Gender: " + myGender + "\nI am full time student: "
				+ fullTimeStudent);
	}

}
