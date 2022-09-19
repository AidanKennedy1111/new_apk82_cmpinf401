package apk82_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// Ask user to input a distance or a weight amount
		String input = JOptionPane.showInputDialog("Enter a weight or distance with unit");
		//Store the number
		String userNumString = "";
		int space = (int) ' ';
		for (int i=0;i<input.length();i++) {
			char letter = input.charAt(i);
			int check = (int) letter;
			userNumString += letter;
			if(check==space) {
				i=input.length();
			}
		}
		Double userNum = Double.parseDouble(userNumString);
		
		//Store the unit
		String unit = "";
		int low = (int)'a';
		int up = (int)'z';
		
		for (int i=0;i<input.length();i++) {
			char letter = input.charAt(i);
			int check = (int) letter;
			
			if(check>=low&&check<=up) {
				unit = unit + letter;
			}
		}
		//Compare Measurements
		String newUnit = "";
		Double newNum = 0.0;
		if(unit.equalsIgnoreCase("cm")) {
			newUnit = "in";
			newNum = userNum / (2.54);
		}
		else if(unit.equalsIgnoreCase("in")) {
			newUnit = "cm";
			newNum = userNum * (2.54);
		}
		else if(unit.equalsIgnoreCase("yd")) {
			newUnit = "m";
			newNum = userNum / (1.094);
		}
		else if(unit.equalsIgnoreCase("m")) {
			newUnit = "yd";
			newNum = userNum * (1.094);
		}
		else if(unit.equalsIgnoreCase("oz")) {
			newUnit = "gm";
			newNum = userNum * (28.35);
		}
		else if(unit.equalsIgnoreCase("gm")) {
			newUnit = "oz";
			newNum = userNum / (28.35);
		}
		else if(unit.equalsIgnoreCase("kg")) {
			newUnit = "lb";
			newNum = userNum * (2.205);
		}
		else if(unit.equalsIgnoreCase("lb")) {
			newUnit = "kg";
			newNum = userNum / (2.205);
		}
		else {
			newUnit = "Invalid Input";
		}
		
		//Round new measurement
		newNum *=100;
		int numInt = (int)Math.round(newNum);
		newNum = numInt/100.0;
		
		//JOptionPane.showMessageDialog(null, "You had a number of " + userNum + " and text of "+ unit);
		JOptionPane.showMessageDialog(null, input + " = " + newNum + " " + newUnit);

	}

}
