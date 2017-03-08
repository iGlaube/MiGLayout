package main_screen;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

public class Home {
	

	
	public static void main (String args[]){
		
		JFrame frame = new JFrame("This is a JFrame");					
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,300);
		frame.setVisible(true);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("GUI #1"));
		frame.add(panel);								//adding panel to JFrame
		
		
		panel.setLayout(new MigLayout("debug", "[]10[] []", " [] [] [] []")); // two columns and three rows
		
		JLabel lLoc = new JLabel("Select your location");
		JLabel lNewry = new JLabel("Newry");
		JLabel lDown = new JLabel("Down");
		JLabel lDescription = new JLabel("Description");
		
		JTextField tNewry = new JTextField(20);
		JTextField tDown = new JTextField(20);
		JTextArea aDescription = new JTextArea(20,30);
		aDescription.setBorder(BorderFactory.createEtchedBorder());
		
		panel.add(lLoc, "left, wrap");

		panel.add(lNewry, "left, sg 1, split");		//Newry Text Field  -- Split (the cell this occupies, adds all components on that line into the same cell 
		panel.add(tNewry, "pushx, growx, wrap");	//Allows cell to grow in 'x' direction and has permission to do so. Wrap comes to the next line
		
		panel.add(lDown, "left, sg 1, split");		//size group - considers all items within this size group as the same size
		panel.add(tDown, "pushx, growx, wrap");
		
		
		panel.add(lDescription, "left, wrap");
		panel.add(aDescription, "span2, push, grow, wrap");   //span -- should occupy amount of cells (columns) specified
															  // push -- local allowance to grow, push allows permission
		
		
		
//		SwingUtilities.invokeLater (new Runnable(){
//			@Override
//			public void run(){
//				
//				
//				
//			}
//		});
	}

}
