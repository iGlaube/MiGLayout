package P5Q10;

import java.util.Scanner;

public class Cinema {
	
	public static int age;
	private static String question;

	public static void main (String args[]){
		
		
		System.out.println("-----CINEMA TICKET PRICE CALCULATOR------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		age = sc.nextInt();
		
		System.out.println("What time is the movie you're going to see?");
		Scanner time = new Scanner(System.in);
		time.nextLine();
		
		
		System.out.println("Are you a student?");
		Scanner student  = new Scanner(System.in);
		question = student.nextLine();
		
		System.out.println("");
		price();
		
		
	}
	
	
	public static void  price(){
		if (age <= 11){
			System.out.println("Your ticket costs £ 4");
		}else if( age >= 12 && question.equals("Yes") || question.equals("y") || question.equals("Y")){
			System.out.println("You get a student ticket at £6");
		}else if (age > 11 && age <= 100){
			System.out.println("Your adult ticket costs £8");
		
	}
}
	
	
}
