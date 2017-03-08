package P5Q7;

import java.io.InputStream;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Car {
	
	private static  int BASIC_CAR = 11000;
	public static  String reply;

	public static void main (String args[]){
		
		System.out.println("BASIC CAR MODEL COSTS: �" + BASIC_CAR);
		System.out.println("It includes: " + "\n" + " - 1.2l petrol engine" + "\n" + " - Silver Colour");
		
		System.out.println("Would you like to upgrade the engine?");
		upgrade();
		
		Scanner question  = new Scanner(System.in);
		String ans = question.nextLine();
		ans.toUpperCase();
		
		
		
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("What engine upgrade would you like?");
			System.out.println("a. 1.4l petrol (add �200");
			System.out.println("b. 1.5l pertrol (add �400");
			System.out.println("c. 1.7l petrol (add �600");
			qEngine();
			
		}
		if (ans.equals("n") || ans.equals("N")){
			System.out.println("------------");
			qColour();
		}
		
		
		
	}
	public static void qEngine(){
		
		System.out.println("\n" + "Enter your choice: ");
		Scanner qE = new Scanner(System.in);
		String ans = qE.nextLine();
	
		if(ans.equals("a") || ans.equals("A")){
			BASIC_CAR = BASIC_CAR + 200;
			System.out.println("Current car value: " + BASIC_CAR);
		}
		if(ans.equals("b") || ans.equals("B")){
			BASIC_CAR = BASIC_CAR + 400;
			System.out.println("Current car value: " + BASIC_CAR);
			}
		if(ans.equals("c") || ans.equals("C")){
			BASIC_CAR = BASIC_CAR + 600;
			System.out.println("Current car value: " + BASIC_CAR);
		}
		System.out.println("-----------------");
		qColour();
		
		}
			
	
	public static void qColour(){
		System.out.println("Would you like to change the colour?");
		upgrade();
		Scanner qC = new Scanner(System.in);
		String ans = qC.nextLine();
		
		if(ans.equals("Y") || ans.equals("y")){
			System.out.println("a. Red (�200)");
			System.out.println("b. Blue (�400)");
			System.out.println("c. Black (�500)");
			
			Scanner sC = new Scanner(System.in);
			sC.nextLine();
			if(sC.equals("a")){
				BASIC_CAR = BASIC_CAR + 200;
				System.out.println("Car value is now: " + BASIC_CAR);
			}else if (sC.equals("b")){
				BASIC_CAR = BASIC_CAR + 400;
				System.out.println("Car value is now: " + BASIC_CAR);
			}else if (sC.equals("c")){
				BASIC_CAR = BASIC_CAR + 500;
			}
		}else{
			qSeats();
			}
		System.out.println("------------");
		qAirCon();
		}
		

	public static void qSeats(){
		System.out.println("Would you like heated seats? ");
		upgrade();
		Scanner qS = new Scanner(System.in);
		String reply = qS.nextLine();
		if(reply == "y" || reply == "Y"){
			BASIC_CAR = BASIC_CAR + 200;
			System.out.println("Car value is now: " + BASIC_CAR);
		}else{
			qAirCon();
		}
	}
	
	public static void qAirCon(){
		System.out.println("Do you want air con?");
		upgrade();
		Scanner ans = new Scanner(System.in);
		ans.nextLine();
		if(ans.equals("Y") || ans.equals("y")){
			BASIC_CAR = BASIC_CAR + 500;
			System.out.println("Car value is now: " + BASIC_CAR);
		}else{ System.out.println("You total car cost is: " + BASIC_CAR);
			
		}
	}
	
	public static void upgrade(){
		System.out.println("Y for yes" + "\n" + "N for no");
		}
	

	
}
