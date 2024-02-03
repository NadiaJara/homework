package hw8Methods;

public class FullName {

	public String fullName(String fName, String lName) {
		String fullName = fName + lName;
		System.out.println("Family Member: " + fName + " " + lName);
		return fullName;
	}
	
	public static void main(String[] args) {
		FullName fullName = new FullName();	
		fullName.fullName("Nadia", "Jara");
		fullName.fullName("Sabia", "Iqra");
		fullName.fullName("Fatema", "Aktar");
		fullName.fullName("Md", "Hossain");

	}
}
