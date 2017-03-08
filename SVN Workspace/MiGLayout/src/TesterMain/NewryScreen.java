package TesterMain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class NewryScreen extends JFrame {
	
	String printerSave;
	
	public NewryScreen(){
		
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("Newry Printers");
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(new MigLayout("debug", "", ""));
		
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
		JLabel detailsLabel = new JLabel("More Details: ");
		panel.add(detailsLabel, "left, wrap");
		JTextArea detailsArea = new JTextArea();
		detailsArea.setBorder(BorderFactory.createEtchedBorder());
		panel.add(detailsArea, "span, push, grow");
		
		//Row Six
		JButton prevButton = new JButton("Previous");
		panel.add(prevButton, "right, sg r6,  tag OK");
		prevButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			//TODO - Add in functionality	
			}
		});
		
		JButton nextButton = new JButton("Next");
		panel.add(nextButton, "right, sg r6");
		nextButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			//TODO - Add in functionality	
			}
		});
		
		//Row Six - Buttons
		JButton backButton = new JButton("Return to Menu");
		panel.add(backButton, "left, sg r6");
		backButton.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed(ActionEvent e){
				frame.setVisible(false);
				new WelcomeScreen();
			}
		});
		
		JButton saveButton = new JButton("Save Changes");
		panel.add(saveButton,"sg r6");
		
		saveButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				printerSave = printerTF.getText();
				System.out.println(printerSave);
				
				try {
					PrintStream out = new PrintStream("C:/Testing/PrinterName.csv");
					out.println(printerSave);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}});
		
		File x = new File("C:/Testing/Test.txt");
		
		if(x.exists())
			System.out.println("This filepath exists" + x.getName() + " <--- name.");
		else
			System.out.println("THis does not exist.");
		
		
		
	}
	
	
	
		
		
		
		
		
		
		
			
}
