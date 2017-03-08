package One;

public class MobileViewer {

	
	public static void main (String args[]){
		
		Mobile mMobile = new Mobile("PAYG", "HTC", "078888888");
		
//		System.out.println("My device is on a contract: " + mMobile.getAccType() + " and is a " + mMobile.getDevice() + "\n " 
//		+ "with the phone number " +  mMobile.getNumber() +  "\n " 
//		+ " but has a balance of: " + mMobile.getBalance());
		
		//Calling setters and setting value of balance
		mMobile.addCredit(10.56);
		System.out.println("Device balance is now " + mMobile.getBalance());
		
		
		//Calling setters and setting duration of calls
		mMobile.makeCall(15);
		System.out.println("The number of minutes the on the phone are " + mMobile.getBalance());
		
		//Calling the sendText method and initialising with 30 texts
		mMobile.sendText(30);
		System.out.println("I've sent 30 texts to the number " + mMobile.getNumber() + " the balance is now: " + mMobile.getBalance());
		
		System.out.println("The balance is now " + mMobile.getBalance());
		
		
		//adding balance
		mMobile.addCredit(5);
		System.out.println("The balance after adding 5 quid is now " + mMobile.getBalance());
		
		
		
		
	}
}
