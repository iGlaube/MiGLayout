package nextWeek;

/* Design an algorithm called VAT which calculates the
 * value-added tax to be paid on a purchase of £70, current
 * rate is 20%. 
 * 
 */


public class Vat {
	
	private  final double VATRATE = 20.00;
	private double price, vat;

	public static void main (String args[]){
	
	//calculation

		
	
}
	
	public Vat (double pPrice){
		price = pPrice;
	}
	
	/*this method akes the rice of the items purchased and calculates
	 * the vat to be paid using the equation
	 * price  (VARATE/100)
	 * @return vat - returns the amount of vat to be paid
	 */
	
	public double vatCalc(){
		
		vat = price * (VATRATE/100);
		return vat;
	}

}