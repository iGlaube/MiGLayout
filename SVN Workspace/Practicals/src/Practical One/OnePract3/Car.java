package OnePract3;

public class Car {

	private double fuel = 0;
	private double fuelEfficiency;
	private double distance;

	final private double MPG = 10;

	// Implement a class Car with the following properties.
	/*
	 * - A car has a certain fuel efficiency: measured in (miles/gallon) - A
	 * certain amount of fuel in the tank (gallons)
	 * 
	 * HINT: Efficiency is specified in the constructor
	 * 
	 * METHODS: drive: simulate the driving the car for a certain DISTANCE,
	 * reducing the amount of FUEL fuel used = distance driven divided by the
	 * mpg
	 * 
	 * getFuel: should return the amount of FUEL in the tank
	 * 
	 * addFuel: add fuel to the tank
	 */
	public Car(double cFuel){
		
		cFuel = fuelEfficiency;
				
	}
	
	public void drive(){
		
		fuel -= distance * fuelEfficiency;
		
	}
	
	public void canDrive(){
		//By driving, I am going a specified distance, reducing the fuel amount and checking if I have enough fuel to keep going
		if ( fuel <= 0 ){
			System.out.println("The car is outta gas, please fill up");
			
		}else{
			if ( fuel >= 1){
			System.out.println("You have fuel remaining, keep driving");	
			
		
						
		}
			} 
		}
	
	
	public void setDistance(double d){
		reduceFuel();
	}
	
	
	public double getFE(double fe){
		fuelEfficiency = fe;
		return fe;
		
	}
	
	public void setFE(){
		fuelEfficiency = fuel / distance;
	}

	
	public double addFuel(double f){
		fuel += f;
		return fuel;
	}
	
	public double getFuel(){
		return fuel;
	}
	
	public void reduceFuel(){
		fuel -= distance * fuelEfficiency;
	}
	
}