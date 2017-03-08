package P7Q1;

import java.util.Scanner;

public class P7Q1 {
	
	//print the sum of 1,2,3,....
	//to an upper bound decided by the user
	//also compute and display the average of these numbers

	public static void main(String argsp[]){
		int sum = 0; 
		double average;
		int upperbound= 100;
		
		for ( int number = 1; number <= upperbound; ++number){
			sum += number; 
			System.out.println("Current sum: "+ sum + " Current number: " + number);
			
		}
		
		
		 average =  sum / (double) upperbound;
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: "+ average);
		
		
		
		
	}
	
	//Computer average in double.
			
	
	

}
