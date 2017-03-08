package P4Q6;

import java.util.Scanner;

public class Q6 {
	
	public static void main (String args[]	){
		
		
		/*
		 * reads a number between 1000 and 999,999 from the user
		 * and prints a comma between the thousands. Then extract substrings
		 * consisting f the first n-4 characters and the last three 
		 * characters
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in a value between 1000 and 999,999");
		int scInput = sc.nextInt();
		
		
		if(scInput >= 1000 && scInput <= 9999){
			System.out.println("Value entered: " + scInput);
		}else{
		if(scInput < 1000 || scInput > 999999){
			System.out.println("Enter a valid number, twat!");
		}
		}
		
		
		//Enter in comma between thousand values.
		String str = Integer.toString(scInput);
		if(scInput >= 1000 && scInput <= 9999){
			
			String sn = str.substring(0,1);
			String ln = str.substring(1,4);
			
		}
		else
			if(scInput >= 10000 && scInput <= 99999){
			String sn = str.substring(0,2);
			String ln = str.substring(2,5);
			System.out.println("Value corrected to: " + sn + "," + ln);
		}
		else
			if(scInput >= 100000 && scInput <= 999999){
			String sn = str.substring(0,3);
			String ln = str.substring(3,6);
			System.out.println("Value corrected to: " + sn + "," + ln);
			}
			
		
		
	}

}
