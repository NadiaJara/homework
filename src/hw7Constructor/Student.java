package hw7Constructor;

public class Student {

	public String stName;
	public int stID;
	public char gender;
	public float grade;
	public boolean isProgrammer;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class");
	}

	public Student(String stName, int stID, char gender, float grade, boolean isProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.gender = gender;
		this.grade = grade;
		this.isProgrammer = isProgrammer;
		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Gender: " + gender + ", Grade: " + grade
				+ ", Java Programmer? Ans: " + isProgrammer);
	}

}
