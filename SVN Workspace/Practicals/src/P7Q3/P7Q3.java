package P7Q3;

public class P7Q3 {

	
	public static void main(String args[]){
		
		int c = 0;
		int product = 1;
		int a = 0;
		int b = 1;
		int sum = 0;
		
		while (c <= 5){
			product = product *5;
			c = c + 1;
			
			System.out.println("c value "+ c + " product value: " + product);
			
			while ( a != b){
				sum = sum +a;
				b = b + 2;
				
			System.out.println("a value "+ a + " b value "+ b +  " sum value" + sum);
			}
		
		}
		
	}
}
