package OnePract3;

public class CarMain {
	
	public static void main (String args[]){
		
		
		Car c1 = new Car(10);
		
		c1.addFuel(1000);
		System.out.println("Car fuel is currently " + c1.getFuel());
		
		c1.canDrive();
		
		c1.drive();
		System.out.println("Car fuel is currently " + c1.getFuel());	
		
		c1.setDistance(10);
		System.out.println(c1.getFuel());
		
	
	}

	
	

}

