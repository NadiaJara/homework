package hw8Methods;

public class MyFamily {

	public int child1Age = 12;
	protected int child2Age = 8;
	int child3Age = 6;
	
	public int myFamily() {
		int sum = child1Age + child2Age + child3Age;
		System.out.println("The sum of my childrens age is: " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		MyFamily myFamily = new MyFamily();
		myFamily.myFamily();
	}
	
}
