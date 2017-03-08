package Two;

public class DogMain {

	
	public static void main(String args[]){
		
		Dog d1 = new Dog("Ernie", "ShitHead", 'M', 4, 50.5, 60.00);
		
		System.out.println("Name: " +d1.getName());
		System.out.println("Breed: " + d1.getBreed());
		System.out.println("Gender: " + d1.getGender());
		System.out.println("Age: " + d1.getAge());
		System.out.println("Weight: " + d1.getWeight());
		System.out.println();
		
		d1.vet();
		d1.foodCost(5, 6);
		d1.finalBill();
		System.out.println("The bill total is: " + d1.billTotal);
		
		
		
	}
}
