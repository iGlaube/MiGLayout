package P7Q2;

public class P7Q2 {

	
	public static void main(String args[]){
		
		int upperbound = 100; 
		int sum = 0;
		
		int number = 0;
		
		while(number <= upperbound){
			sum += number;
			++number;
			System.out.println("Current number: " + number + " the sum is " + sum);
		}
		
		
		
	}
}
