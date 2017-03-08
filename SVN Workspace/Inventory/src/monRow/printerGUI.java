package monRow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class printerGUI extends JPanel{
	/*
	 * Creating variables
	 */
	private JTextField tName, tCode, tServer, tToner, tType;
	private JButton  bNext, bPrev, bSave;
	public JButton bDetails;
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	//Constructor
	public printerGUI(){
		setLayout(new GridBagLayout());
		
		
	//Creating Objects from variables 
		
		JTextField printerName = new JTextField();
		JTextField printerCode = new JTextField();
		JButton nextButton = new JButton("Next");
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(nextButton, gbc);
		JButton prevButton = new JButton("Previous");
		FocusListener highlight = new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				e.getComponent().setBackground(Color.GREEN);
			}

			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(UIManager.getColor("TextField.background"));
				
			}
			
		};
		
		printerName.addFocusListener(highlight);
		printerCode.addFocusListener(highlight);
		
		
		/*
		 * Tab One: Panel One
		 */
		
		JTabbedPane tP = new JTabbedPane();
		JComponent panel1 = makeTextPanel("Printer Details");
		JComponent p2 = new JPanel();
		tP.addTab("Tab 1", null, panel1, "Does nothing");
		tP.setMnemonicAt(0, KeyEvent.VK_1);
		panel1.add(printerCode);
		panel1.add(printerName);
		
		panel1.add(p2);
		p2.add(prevButton);
		p2.add(nextButton);
		
		//Buttons
		

		
		
		
		/*
		 * 
		 */
		
		JComponent panel2 = makeTextPanel("Panel #2");
		tP.addTab("Tab 2", null, panel2, "Does Nothing");
		tP.setMnemonicAt(0, KeyEvent.VK_2);
		
		JComponent panel3 = makeTextPanel("Panel 3");
		tP.addTab("Tab 3", null, panel3, "Does Nothing");
		tP.setMnemonicAt(0, KeyEvent.VK_3);
		
		add(tP);
		tP.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	
		}
	
	protected JComponent makeTextPanel(String text){
		JPanel p = new JPanel(false);
		JLabel l = new JLabel(text);
		l.setHorizontalAlignment(JLabel.CENTER);
		p.setLayout(new GridBagLayout());
		p.add(l);
		return p;
				
	}
	
	public static void main (String args[]){	
		
		
	SwingUtilities.invokeLater(new Runnable() {
		
		public void run() {
			UIManager.put("swing.boldMetal", Boolean.FALSE);
			createAndShowGUI();
		}
	});

}

	
	private static void createAndShowGUI() {
		
		printerGUI pG = new printerGUI();
		JFrame jF = new JFrame();
		
		jF.setTitle("Printers");
		jF.setSize(500,500);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jF.setVisible(true);
		jF.add(pG);
	}
	

}


	


