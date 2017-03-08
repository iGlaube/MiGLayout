package P6Q3;

import java.util.Scanner;

public class P6Q4 {

	private static double itemTime  = 0;
	
	public static void main (String args[]){
		
		
		//Two items means increase the time by 50%
		//Three items, not recommended
		
		//# of items, single-item heating time
		
		
		System.out.println("----------MICROWAVE TIME CALCULATOR EXPERIENCE EXTRAVAGANZA------------");
		
		
		System.out.println("\n");
		System.out.println("How many items are you looking to cook? ");
		Scanner noOfItems = new Scanner(System.in);
		int foodItems = noOfItems.nextInt();
		
		if(foodItems == 1){
			oneItemTime();
		}
			if (foodItems == 2){
				twoItemTime();
			}
				if (foodItems >= 3){
					threeItemTime();
				}
		
		
	}
	
	public static  void oneItemTime(){
		System.out.println("Enter the time for heating your one item");
		Scanner one = new Scanner(System.in);
		double item = one.nextDouble();
		
		itemTime = itemTime + item;
		System.out.println("Heat your one item for: " + itemTime + " minutes / seconds.");
		
	}

	
	public static void twoItemTime(){
		System.out.println("Enter the time for heating for one of your items");
		Scanner two = new Scanner (System.in);
		double	time = two.nextDouble();
		
		itemTime = time + time*0.5;
		System.out.println("Heat your one item for: " + itemTime + " minutes / seconds.");
	}
	
	public static void threeItemTime(){
		System.out.println("You are repulsive. Cook less stuff.");
	}
}
