package P5Q2;

import java.util.Scanner;

public class NumberSort {

	
	public static void main (String args[]){
		
		int fn, sn, tn;
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your first number");
		fn = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter second value");
		sn = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter final value");
		tn = sc3.nextInt();
		
		if (fn <= sn && sn <= tn){
			System.out.println("Increasing");
		}else
			if(fn >= sn && sn >= tn){
				System.out.println("Decreasing");
			}else
				if (fn >= sn || sn >= tn || tn <= fn){
					System.out.println("Neither");
				}
		
		
		
		
		
	}
}
