package TesterMain;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class newItems extends JFrame {
	
	
	public newItems(){
		
		JFrame itemFrame = new JFrame();
		itemFrame.setSize(500, 400);
		itemFrame.setLocationRelativeTo(null);
		itemFrame.setVisible(true);
		itemFrame.setDefaultCloseOperation(itemFrame.EXIT_ON_CLOSE);
		itemFrame.setTitle("Ink");
		
		//Top Menu Panel
		JPanel itemPanel = new JPanel();
		itemFrame.add(itemPanel);
		itemPanel.setLayout(new MigLayout("debug", "[]10[]10[]10[]10[]"));
		
		JMenu printerMenu = new JMenu("Printer");
		printerMenu.setMnemonic(KeyEvent.VK_F1);
		itemPanel.add(printerMenu);
		
		JMenu inkMenu = new JMenu("Ink");
		inkMenu.setMnemonic(KeyEvent.VK_F2);
		itemPanel.add(inkMenu);
		
		
		
		
	}

}
