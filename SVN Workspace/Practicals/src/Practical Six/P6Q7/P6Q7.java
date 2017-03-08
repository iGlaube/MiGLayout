package P6Q7;

import java.util.Scanner;

public class P6Q7 {
	
	private static double totalCost;
	private static double tipCost;
	
	public static void main (String args[]){
		
		
		//Create scanner
		System.out.println("Do you want to leave  a tip?");
		Scanner resp = new Scanner(System.in);
		String ans = resp.nextLine();
		
		if(ans.equals("Yes") || ans.equals("y") || ans.equals("Y") || ans.equals("yes")){
			System.out.println("Please enter your bill total");
			Scanner bill = new Scanner(System.in);
			double billTotal = bill.nextDouble();
			
			
			if(billTotal >= 20){
				
				tipCost = billTotal * 0.2;
				totalCost = billTotal + tipCost;
				System.out.println("Your tip is: " + tipCost);
				System.out.println("You've been charged 20% on your original bill of: £" + billTotal + "\n" + "Total bill is now: £" + totalCost);
				
			}if (billTotal < 20){
				tipCost = billTotal * 0.1;
				totalCost = billTotal + tipCost;
				System.out.println("Your tip is: " + tipCost);
				System.out.println("You've been charged 20% on your original bill of: £" + billTotal + "\n" + "Total bill is now: £" + totalCost);
			}
			
		}
		
		
		
	}

}
