package P6Initial;

import java.time.Month;
import java.util.Scanner;

public class Main {
	
	public static void main (String args[]){
		
		System.out.println("Enter a value between 1 and 10 to convert to text");
		Scanner sc = new Scanner(System.in);
		
		
		int month = sc.nextInt();
		
		String monthString = "";
		
		
		try{
		switch (month){
		
		
		case 1: monthString = "One"	; break;
		case 2: monthString = "Two"	; break;
		case 3: monthString = "Three"; break;
		default: System.out.println("Enter a number between 1 and 10, cunt.");
		}
		
		}catch (RuntimeException e){
			System.out.println("Runtime error.");
			System.out.println(e.getMessage());
		}
		
		System.out.println(monthString);
		
		
	}

}
