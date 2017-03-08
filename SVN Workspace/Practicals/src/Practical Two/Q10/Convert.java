package Q10;

import javax.swing.JOptionPane;

public class Convert {
	
	 private static final double YARD = 1.25;
	 private static final double INCHES = 0.16;
	 private static final double FEET = 1.66;

	/*Design a program that prompts for measurement, then converts
	 * it yo YARDS, FEET and INCHES
	 * 
	 */
	 
	public static void main(String args[]){
		String yards, inches, feet;
		double y, i, f;
		
		yards = JOptionPane.showInputDialog(null, "Enter value to be converted to yards");
		
		inches = JOptionPane.showInputDialog(null, "Enter value to be converted to inches");
		
		feet = JOptionPane.showInputDialog(null, "Enter value to be converted to feet");
		
		//convert numbers from String to int
		y = Integer.parseInt(yards);
		i = Integer.parseInt(inches);
		f = Integer.parseInt(feet);
		
		//Calculate sum value
		
		y = (double) (y * YARD);
		i = (double) (i * INCHES);
		f = (double) (f * FEET);
		
		JOptionPane.showMessageDialog(null, "Value in yards is: " + y);
		JOptionPane.showMessageDialog(null, "Value in inches is: " + i);
		JOptionPane.showMessageDialog(null, "Value in feet is: " + f);
		
		
	}

	
}
