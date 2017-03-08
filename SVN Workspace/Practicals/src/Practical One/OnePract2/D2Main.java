package OnePract2;

public class D2Main {

	
	public static void main (String args[]){
		
		DIY2 d2 = new DIY2("Brendan", 15);
		
		System.out.println("My employee is called: " + d2.getEmployee()+ "\n  " +  "and his salary is: " + d2.getSalary());
		
		
		d2.addWages(15);
		System.out.println("Salary has now been increased by: 15, and is now: " + d2.getSalary());
		
	}
}
