package Project.bin.main_screen;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import net.miginfocom.swing.MigLayout;

public class NewryScreen extends JFrame {
	
	public NewryScreen(){
		
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Newry Printers");
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(new MigLayout("", "", ""));
		
		//Row One
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Newry Printers");
		panel.add(titleLabel, "center, span 3, wrap 30");	//creates gap of 15 pixels between next row
		//TODO - Font and styling
		
		
		//Row Two
		JLabel printerLabel = new JLabel("Printer Name: ");
		panel.add(printerLabel, "left, sg 2");
		JTextField printerTF = new JTextField(20);
		panel.add(printerTF, "pushx, growx");
		
		JLabel inkLabel = new JLabel("Ink Short Code: ");
		panel.add(inkLabel, "");
		JTextField inkTF = new JTextField(12);
		panel.add(inkTF, "pushx, growx, wrap");
		
		
		//Row Three
		JLabel pNameLabel = new JLabel("Printer Type:");
		panel.add(pNameLabel, "left, sg 2");
		JTextField pNameTF = new JTextField(20);
		panel.add(pNameTF, "span, pushx, growx, wrap");
		
		//Row Four
		JLabel ipLabel = new JLabel("IP Address: ");
		panel.add(ipLabel, "left, sg 2");
		JTextField ipTF = new JTextField(15);
		panel.add(ipTF, "span, pushx, growx, wrap");
		
		//Row Five
		JLabel detailsLabel = new JLabel("More Details");
		panel.add(detailsLabel, "left, wrap");
		JTextArea detailsArea = new JTextArea();
		detailsArea.setBorder(BorderFactory.createEtchedBorder());
		panel.add(detailsArea, "span, push, grow");
	}

}
