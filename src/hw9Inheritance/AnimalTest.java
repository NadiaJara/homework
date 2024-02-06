package hw9Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("\n---------------------------------------------------------------------\n");
		Animal animal = new Animal();
		animal.animalInfo();

		// Hierarchical Inheritance: Mammal --> Animal - this is an example of hierarchical inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		// Hierarchical Inheritance: Reptile --> Animal - this is an example of hierarchical inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		// Hierarchical Inheritance: Birds --> Animal - this is an example of hierarchical inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		// Single Inheritance: Dog --> Mammal - this is an example of single inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		// Single Inheritance: Snake --> Reptile - this is an example of single inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		// Single Inheritance: Robin  --> Birds - this is an example of single inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		// Multilevel Inheritance: BullDog --> Dog --> Mammal --> Animal - this is an example of multilevel inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		// Multilevel Inheritance: Cobra --> Snake --> Reptile --> Animal - this is an example of multilevel inheritance
		System.out.println("\n---------------------------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}
}
