package P6Q1;

import java.util.Scanner;

public class P6Q1 {


	
	public static void main (String args[]){
		
		System.out.println("Enter a value between 1 and 7");
		Scanner number = new Scanner(System.in);
		int value = number.nextInt();
		
		String day = "";
		
		switch (value){
		
		
		
		case 1: day = "Sunday"; break;
		case 2: day = "Monday"; break;
		case 3: day = "Tuesday"; break;
		
		default: System.out.println("Please enter a number between 1 and 7");
		}
		System.out.println("Your value translates to: " + day);
		
		
	}
}
