import javax.swing.JOptionPane;

public class Q8 {

	
	public static void main(String args[]){
		
	String fn = JOptionPane.showInputDialog("Enter in first name");
	
	String fp = JOptionPane.showInputDialog("Enter in first pet");
	
	String cb = JOptionPane.showInputDialog("Enter in city of birth");
	
	String fc = JOptionPane.showInputDialog("Enter in favourite city");
		
	System.out.println(fn);
	System.out.println(fp);
	System.out.println(cb);
	System.out.println(fc);
	
	//Star wars name
	String fn1 = fn.substring(0,3);
	String fp1 = fp.substring(0, 3);
	String name = fn1 + fp1;
	
	//Place of birth in Star wars
	String cb1 = cb.substring(0, 3);
	String fc1 = fc.substring(0, 3);
	String city = fc1 + cb1;
	
	
	
	
	JOptionPane.showMessageDialog(null, "You are " + name.toUpperCase() + " born of the land " + city.toUpperCase());
	
	}
}
