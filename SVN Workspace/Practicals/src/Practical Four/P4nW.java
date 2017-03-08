import java.util.Scanner;


public class P4nW {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		double value = sc.nextDouble();
		
		

		if( value >= 69.4){
		System.out.println("Distinction");
		}
		else
		
			if(value >= 59.4 && value < 69.4){
				System.out.println("Commendation");
				
				if(value >= 49.4 && value < 59.4){
					System.out.println("Pass");
				}else
					if (value <= 50){
						System.out.println("Are you even trying m8");
					}
				
			}

}
}
