package One;

public class Mobile {
	
	//Sets up the values a mobile will have and has begun to identify some of the functions possible to test it.
	
	private String accType	, device, number;
	
	private double balance;
	
	final private double CALL_COST = 0.0025;
	final private double TEXT_COST = 0.05;
	
	public Mobile(String mAccType, String mDevice, String mNumber){
		
		accType = mAccType;
		device = mDevice;
		number = mNumber;
		balance = 0;
		

		
		/*
		 * So this functions accepts the type, (either PAYG or Monthly), the name of the device chosen and a mobile number as a string.
		 * It then sets eacch of the values into variables that can be called later. 
		 */
		
		
			
	}
	
	
	//We want to print out the values of the variables above but not at the same time. There are instances when we will only want the mobile number and balance. 
	
	public String getAccType(){
		
		return accType;
	}
	
	public String getNumber(){
		
		return number;
	}
	
	public String getDevice(){
		
		return device;
	}
	
	public double getBalance(){
		
		return balance;
	}
	
	
	public void addCredit (double amount){
		//balance is added and equals amount
		balance += amount;
	}
	
	public void makeCall (int minutes){
		
		balance -= minutes * CALL_COST;
	}
	
	public void sendText (int texts){
		
		balance -= texts * TEXT_COST;
	}
	
	
	

}
