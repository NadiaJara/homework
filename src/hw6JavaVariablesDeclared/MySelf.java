package hw6JavaVariablesDeclared;

/*
 Variable names start with lowercase
 Variables follow camel case feature and snake case pattern
 The most common variables are: String, int, char, boolean, and double
 */

public class MySelf {

	public String myName; // variables declared
	public byte myBirthMonth;
	public short myHomeAddress;
	public int myAge;
	public long myBirthYear;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean fullTimeStudent;

	public MySelf() { // constructor declared
		System.out.println(":------------ This is all about Us ------------:");
	}

	public void mySelf() { // method implemented
		System.out.println("My Name: " + myName + "\nMy Birth Month: " + myBirthMonth + "\nMy Home Address: "
				+ myHomeAddress + "\nMy Age: " + myAge + "\nMy Birth Year: " + myBirthYear + "\nMy Height: " + myHeight
				+ "\nMy Grade: " + myGrade + "\nMy Gender: " + myGender + "\nI am full time student: "
				+ fullTimeStudent);
	}

}
