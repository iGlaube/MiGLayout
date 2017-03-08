package P5Q4;

public class Mobile {
	
	private int number;
	private String contract, name;
	private double balance;
	
	private static final double MAKE_CALL = 0.10;
	private static final double MAKE_TEXT = 0.05;
	
	
	
	
	public Mobile(int mNumber, String mContract, String mName, double mBalance) {
		number = mNumber; 
		contract = mContract; 
		name = mName;
		balance = mBalance; 
	
	}


	public int getNumber(){
		return number;
	}
	
	public String getContract(){
		return contract;
	}
	
	public String getName(){
		return name;
	}
	
	public void addCredit(double credit){
		balance = balance + credit;
			if(credit >= 20 && credit < 50){
				balance = balance + 5;
			}else
				if(balance >= 50){
					balance = balance + 10;
				}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double makeCall(int minutes){
		
		if (balance == 0){
			System.out.println("Not enough dosh to make call");
		}else{
		double callCost = minutes * MAKE_CALL;
		balance = balance - callCost;
			 }
		return balance;
		
	}
	
	public double makeText(int texts){
		if (balance == 0){
			System.out.println("Not enogh text credit");
		}else{
		double textCost = texts * MAKE_TEXT;
		balance = balance - textCost;
		}
		return balance;
	}

}
