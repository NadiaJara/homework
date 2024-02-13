package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Nadia Jara");
		employee.setAge(12);
		employee.setGender('F');
		employee.setCitizen(true);

		System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nGender: "
				+ employee.getGender() + "\nI am US Citizen: " + employee.getCitizen());
	}
}
