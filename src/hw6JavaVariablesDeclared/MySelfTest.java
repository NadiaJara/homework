package hw6JavaVariablesDeclared;

public class MySelfTest {

	public static void main(String[] args) {
		MySelf nadia = new MySelf(); // constructor initialized
		nadia.myName = "Nadia Jara"; // variables initialized
		nadia.myBirthMonth = 3;
		nadia.myHomeAddress = 12047;
		nadia.myAge = 12;
		nadia.myBirthYear = 2011;
		nadia.myHeight = 5.4f;
		nadia.myGrade = 4.0;
		nadia.myGender = 'F';
		nadia.fullTimeStudent = true;
		nadia.mySelf(); // method initialized

		System.out.println("\n-------------------------------------------------------------------------------\n");

		MySelf alex = new MySelf();
		alex.myName = "Alex";
		alex.myBirthMonth = 2;
		alex.myHomeAddress = 26383;
		alex.myAge = 13;
		alex.myBirthYear = 2010;
		alex.myHeight = 5.6f;
		alex.myGrade = 4.0;
		alex.myGender = 'F';
		alex.fullTimeStudent = true;
		alex.mySelf();

	}

}
