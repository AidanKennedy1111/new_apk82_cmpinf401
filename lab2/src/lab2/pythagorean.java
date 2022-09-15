package lab2;

import javax.swing.JOptionPane;

public class pythagorean {

	public static void main(String[] args) {
		
		//User Inputs Sides of Triangles
		
		String sideA = JOptionPane.showInputDialog("Enter First Triangle Side");
		double sideADouble = Double.parseDouble(sideA);
		
		String sideB = JOptionPane.showInputDialog("Enter Second Triangle Side");
		double sideBDouble = Double.parseDouble(sideB);
		
		//Squaring Both Sides
		
		sideADouble = Math.pow(sideADouble, 2);
		sideBDouble = Math.pow(sideBDouble, 2);
		
		//Taking Square Root of A^2 + B^2
		
		double sideCDouble = Math.sqrt(sideADouble+sideBDouble);
		
		//Rounding Answer to Nearest Hundredth
		
		sideCDouble *= 100;
		int sideCInt = (int)Math.round(sideCDouble);
		sideCDouble = sideCInt/100.0;
		
		//Display Answer
		
		JOptionPane.showMessageDialog(null, "The Hypotenuse is " + sideCDouble);

	}

}
