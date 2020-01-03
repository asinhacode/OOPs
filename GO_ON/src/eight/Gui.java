package eight;
import javax.swing.JOptionPane;

public class Gui 
{

	public static void main(String[] args)
	{
		String fn = JOptionPane.showInputDialog("Enter first number:\t");
		String ln = JOptionPane.showInputDialog("Enter second number:\t");

		int first = Integer.parseInt(fn);
		int second = Integer.parseInt(ln);
		
		
		// null = where to appear, center
		// The answer is : 
		// title bar
		JOptionPane.showMessageDialog(null, "Sum: "+ (first+second) , "Title", JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog(null, "Diff: "+ (first-second) , "Title", JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog(null, "Mul: "+ (first*second) , "Title", JOptionPane.PLAIN_MESSAGE );
		JOptionPane.showMessageDialog(null, "Div: "+ (first/second) , "Title", JOptionPane.PLAIN_MESSAGE );

	}

}
