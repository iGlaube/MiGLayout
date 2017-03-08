package OnePract7;

import javax.swing.JOptionPane;

public class Swap {

	
	public static void main (String args[]){
		
		
		//declare and initialise
		int first = 3; 
		int second = 4;
		
		
		//write out initial values
		JOptionPane.showMessageDialog(null, "First value is " + first);
		JOptionPane.showMessageDialog(null, "Second value is: " + second);
		
		//swap values 
		int s;
		int f;

		s = second;
		f = first;
			
		
		//
		System.out.println("first value:" + s);
		System.out.println("second value: " + f);
		
	}
}
