package Project.src.main_screen.LayoutOne;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI2 {
	
	public static void main (String args[]){
		
		JFrame frame = new JFrame("I am GUI #: 2");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(600, 300);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		/*
		 * Adding Labels and associated TextFields
		 */
		JLabel printerLabel = new JLabel("Printer Name: ");
		JTextField printerTF = new JTextField(20);
		
		JLabel inkName = new JLabel("Ink Name: ");
		JTextField inkTF = new JTextField(10);
		
		JLabel ipLabel = new JLabel("IP Address: ");
		JTextField ipTF = new JTextField(15);
		
		JLabel detailsLabel = new JLabel("Printer Details");
		JTextArea detailsArea = new JTextArea();
		
		/*
		 * Adding components to panel
		 */
		
		// Row 1
		panel.add(printerLabel, "split2, sg1");
		panel.add(printerTF, "pushx, growx, wrap");
		// Row 2
		panel.add(inkName, "split2, sg1");
		panel.add(inkTF, "pushx, growx, wrap");
		//Row 3
		panel.add(ipLabel, "split2, sg1");
		panel.add(ipTF, "pushx, growx, wrap");
		//Row 4:
		panel.add(detailsLabel, "wrap, sg1");
		panel.add(detailsArea, "span, push, grow");
		
		frame.pack();
		frame.setLocation(300, 300);
		frame.setVisible(true);
		
		
		
		
		
	}

}
