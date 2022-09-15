package lab2;

import javax.swing.JOptionPane;

public class circle {

	public static void main(String[] args) {
		
		//Input Radius of Circle
		
		String radiusString = JOptionPane.showInputDialog("Enter Radius of Your Circle");
		double radius = Double.parseDouble(radiusString);
		
		//Compute Perimeter
		
		double perimeter = (Math.PI * 2 * radius);
		perimeter *= 100;
		int perimeterInt = (int)Math.round(perimeter);
		perimeter = perimeterInt/100.0;
		
		//Compute Area
		
		double area = (Math.PI * radius * radius);
		area *= 100;
		int areaInt = (int)Math.round(area);
		area = areaInt/100.0;
		
		//Output
		
		JOptionPane.showMessageDialog(null, "The Circle with a radius of " + radius + " has an area of " + area + " and a perimeter of " + perimeter);

	}

}
