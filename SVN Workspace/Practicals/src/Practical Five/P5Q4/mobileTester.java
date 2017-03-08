package P5Q4;

public class mobileTester {
	
	public static void main (String args[]){
		
		Mobile mo = new Mobile(50, "Contract", "Brendan", 0);
		
		System.out.println("Number: " + mo.getNumber());
		System.out.println("Contract Type: " + mo.getContract());
		System.out.println("Name: " + mo.getName());
		System.out.println("Balance: " + mo.getBalance());
		
		mo.makeCall(10);
		mo.makeText(10);
		
		System.out.println("New Balance: " + mo.getBalance());
		
		mo.addCredit(55);
		System.out.println("New Balance: " + mo.getBalance());
		
	}

}
