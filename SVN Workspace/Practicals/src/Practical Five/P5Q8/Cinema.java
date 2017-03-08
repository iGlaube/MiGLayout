package P5Q8;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Cinema {

	
	public static void main(String args[]){
		
		//Write  aprogram that calculates the cost of a cinema ticket
		//Prompt user for AGE  / TIME of Movie (24hr) / STUDENT???
		
		
		System.out.println("-----CINEMA TICKEY PRICE CALCULATOR------");
		
		System.out.println("What age are you? :");
		Scanner question = new Scanner(System.in);
		question.nextInt();
		
		System.out.println("What time is the movie at? (24hr)");
		
//		int time = timer.nextInt();
//		String fullTime;
//		
//		switch(time){
//		case 1: fullTime = "13:00"; break;
//		case 2: fullTime = "14:00";	break;
//		}
		
		
		Scanner date = new Scanner(System.in);
		String datePattern = "HH/mm";
		SimpleDateFormat format = new SimpleDateFormat(datePattern);
		
		
		
		
		
		
		
		
		
		
	}
}
