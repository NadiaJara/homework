package hw15_JavaCodingChallenge;

public class FindingSmallestNumber {

	public static void main(String[] args) {
	
		int [] number = {2, 16, 4, 94, 438};
		
		int smallest = number[0];
		
		for (int i = 0; i > number.length; i--) {
			if(number[i] < smallest) {
				smallest = number[i];
			}
			System.out.println("The smallest number: " + i);
		}
}
}
