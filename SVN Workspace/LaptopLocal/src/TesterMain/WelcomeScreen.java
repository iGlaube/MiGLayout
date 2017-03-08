package TesterMain;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

		
		//----Login Screen For picking location
		
		/*	Column One			|| 	Column Two
		 * 
		 * 
Row	One	 * 				Newry, Mourne and Down DC
		 * 
Row	Two	 * Select your location
		 * 
Row Three* 				Tick Box - Newry
		 * 				
Row Four * 				Tick Box - Downpatrick
		 * 
		 * 				
Row	Five *					Button: Ok  
		 */
public class WelcomeScreen extends JFrame{
	
	
		
	public WelcomeScreen(){
		JFrame frame = new JFrame();
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setTitle("Welcome Screen");
		
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new MigLayout("debug","[]20[]20[]20[]","[]20px[]30px[]20px[]20px[]20px[]"));
		
		
		
		//---------Row One
		JLabel welcomeLabel = new JLabel("Welcome to Newry, Mourne and Down DC");
		panel.add(welcomeLabel, "center, wrap");
		
		//--------Row Two
		JLabel locationLabel = new JLabel("Please select a location: ");
		panel.add(locationLabel, "left, pushx, growx, wrap");
		
		//-------Row Three: Check Boxes
		JCheckBox newryBox = new JCheckBox("Newry");
		panel.add(newryBox, "center, wrap, sg a");
		newryBox.setEnabled(true);
		
		//------Row Four: Check Boxes
		JCheckBox downBox = new JCheckBox("Downpatrick");
		panel.add(downBox, "center, wrap, sg a");
		downBox.setEnabled(true);
		
		//------Row Five: Buttons
		JButton okButton = new JButton("test");
		panel.add(okButton, "left, split 2");
		okButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				frame.setVisible(false);
				new NewryScreen();
				System.out.println("Button for OK selected");
			}
		});
		
		JButton cancelButton = new JButton("Dunno");
		panel.add(cancelButton, "right, split 2");
		cancelButton.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed (ActionEvent e){
				frame.setVisible(false);
				new NewryScreen();
				System.out.println("Button for cancel selected");
			}
		});

		
	}
		

	
	public static void main (String args[]){		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				WelcomeScreen main = new WelcomeScreen();
			}
		});
		
		
	}
}




















