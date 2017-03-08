package sqlite;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Main {
	
	private JFrame frame;
	private JFrame db;
	private JPanel panel;
	private JTable table;
	private JLabel id, name, supplier, cost;
	private JButton add, update, discard;
	private JTextField tid, tname, tsupplier, tcost;

	
	
	public Main(){
		frame.setSize(500,  300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		panel.setLayout(new MigLayout("debug", "[] [] []", "[] [] [] "));
		frame.add(panel);
		
		
		
	}
	
	

}
