package P5Q6;

import java.util.Scanner;

public class Exam {
	
	public static void main (String args[]){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your exam percentage score.");
	int value = sc.nextInt();
	
	if (value < 1 || value > 100){
		System.out.println("Enter  a valid score. ");
	}else{
		System.out.println("Thank you, your score is being calculated...");
		if (value >= 90){
			System.out.println("A*");
		}
		if (value >= 80 && value <= 89){
			System.out.println("A");
		}
	}
		
		
	}
	
}
	
	

