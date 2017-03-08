package Project.src.main_screen.LayoutOne;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;



public class Main{


	public static void main(String args[]){
		
		JFrame frame = new JFrame("This is a layout");
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("GUI: #1"));
		frame.add(panel);
		
		
		panel.setLayout(new MigLayout("debug", "[]10[] ", "[] [] []")); //two columns, and three rows.
		
		JLabel printerLabel = new JLabel("Printer Name: ");
		JLabel inkLabel = new JLabel("Ink Short Code: ");
		
		JTextField printerTF = new JTextField(30);
		JTextField inkShortTF = new JTextField(10);
		
		JLabel detailsLabel = new JLabel("Printer Details");
		JTextArea dArea = new JTextArea(30, 20);
		dArea.setBorder(BorderFactory.createEtchedBorder());
		
		
		//Indicate what you want to happen, how the GUI looks
		
		/*	#ARGUEMENTS
		 * # left - printer aligns to the left of the GUI
		 * # sg 1 - Size Group: Gives the row a SG name. All rows will share the same BoundSize
		 * as the row with the the pref min/max size.
		 * # split2 - splits the cell into a number of sub-cells meaning that the next count number components
		 * will be put in the same cell, next to each other with no gaps. 
		 * 
		 */
		
		panel.add(printerLabel, "left, sg 1, split");
		panel.add(printerTF, "pushx, growx, wrap");
		
	
		/*
		 * 	#ARGUMENTS
		 * # left - details label aligns to the left of the GUI
		 * # sg1 - places components in same Size Group as Label above
		 * 
		 * # span2 - 
		 * # push - appended to 'gap' to make it take any left over space.
		 * It will push the components apart. Gap push is always an addition to a
		 * 'BoundSize' 
		 * # grow - [weight] Sets how keen the row should be to grow in relation to other rows
		 * default is 100, but if set to 0 it will not grow unless with a 'fill'
		 * # wrap - wraps a anew column/row after the component as been put in the next available cell
		 * Next component will be be put in the new row/column: "Read as 'wrap after' 
		 */
		panel.add(inkLabel, "left, sg 1, split");
		panel.add(inkShortTF, "pushx, growx, wrap");
		
		
		
		panel.add(detailsLabel, "left, wrap");
		//Area spans over 2 cells: row or column 
		panel.add(dArea, "span2, push, grow, wrap");
		
		frame.setVisible(true);
		
		
		
	}



}