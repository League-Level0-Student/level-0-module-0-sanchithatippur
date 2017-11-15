import javax.swing.JOptionPane;

public class Greetor {public static void main(String[] args) {
	
	System.out.println("null, Sanchitha's hello world");
	String name=JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "Hello "+name
			);
	
}

}
