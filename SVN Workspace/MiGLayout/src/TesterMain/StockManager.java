package TesterMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class StockManager extends JFrame{
	
	private JButton test;
	private JLabel searchLabel, printerLabel, modelLabel, inkLabel, shortLabel;
	private JTextField printerTF, inkTF, shortTF, modelTF;

	public StockManager(){
	
	JFrame frame = new JFrame("Stock Manager");
	JPanel panel = new JPanel();
	
	frame.setSize(500, 300);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setTitle("Stock Manager");
	
	frame.add(panel);
	
	
	
	//First Set of [][] are for colums, second set is for rows
	panel.setLayout(new MigLayout("debug", "[]10[]10[]10[]", "[]30[]30[]30[]30[]"));
	
	//Top Level
	searchLabel = new JLabel ("Search By");
	panel.add(searchLabel, "wrap");
	
	//Row One
	printerLabel = new JLabel("Printer Name");
	panel.add(printerLabel, "left, sg label");
	printerTF = new JTextField(20);
	panel.add(printerTF, "pushx, growx");
	
	modelLabel = new JLabel("Printer Model");
	panel.add(modelLabel);
	modelTF = new JTextField(25);
	panel.add(modelTF, "pushx, growx, wrap");
	
	
	//Row Two
	inkLabel = new JLabel("Ink Name: ");
	panel.add(inkLabel, "left, sg label");
	inkTF = new JTextField(20);
	panel.add(inkTF, "pushx, growx ");
	
	shortLabel = new JLabel("Ink Short Code: ");
	panel.add(shortLabel);
	shortTF = new JTextField(15);
	panel.add(shortTF, "pushx, growx, wrap");
	
	//Row	- Table
	
	String[] tableColumns = {"Printer Name",
							"Printer IP",	
							"Ink Code",	
							"Black Stock",
							"Magenta Stock",
							"Cyan Stock",
							"Yellow Stock"	};
	
	JTable resultsTable = new JTable(); // two rows, 3 columns;
	panel.add(resultsTable, "pushx, growx, wrap");
	
	
	//Row Three - Buttons
	JButton menuButton = new JButton("Return to Menu");
	panel.add(menuButton, "left, sg button");
	menuButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			frame.setVisible(false);
			new WelcomeScreen();
			//TODO - Only works if fields are null
		}
	});
	
	
	
	/*	Layout for Stock Manager GUI
	 * 
	 *  // Title : Stock Manager
	 *  
	 *  Label: add in new stock
	 *  
	 *  Printer Name 	| 	Printer Model		| 
	 *  Ink Code		|	Ink Short Code		|	
	 *  
	 *  Ink Colours
	 *  	Black	- Box for qty
	 *  	Magenta - ""
	 *  	Blue	- ""
	 *  	Yellow	- ""
	 *  
	 *  
	 * 
	 * 
	 */
	
	JLabel testing = new JLabel("tESTTING");
	panel.add(testing);
	panel.add(test);
	
	
	
	
	
	}

	
	public void saveValues(){
		test.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String s;
				s = shortTF.getText();
			}
		});
	}
	
	
}













