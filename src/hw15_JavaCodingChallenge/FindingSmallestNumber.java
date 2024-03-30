package hw15_JavaCodingChallenge;

public class FindingSmallestNumber {

	public static void main(String[] args) {
	
		int [] number = {2, 12, 1, 10, 50};
		
		int smallest = number[1];
		
		for (int i = 0; i < number.length; i--) {
			if(number[i] < smallest) {
				smallest = number[i];
			}
			System.out.println("The smallest number: " + i);
		}
}
}
