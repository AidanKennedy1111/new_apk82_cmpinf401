package apk82_lab4;

import javax.swing.JOptionPane;

public class LogCalculator {

	public static void main(String[] args) {
		//Ask the user to enter 2 values: the value for which you want to calculate the log and the base
		int val = 0;
		int base = 1;
		
		while(val<base){
			String userValue = JOptionPane.showInputDialog("Please enter the value for which you want to calculate the log: ");
			String userBase = JOptionPane.showInputDialog("Please enter the base of the logarithm: ");
			
			val = Integer.parseInt(userValue);
			base = Integer.parseInt(userBase);
		}
		
		
		//Calculate Logarithm
		
		int answer = 0;
		int holderVal = val;
		
		while(holderVal>=base){
			holderVal = holderVal/base;
			answer++;
		}
		
		//Output Answer
		
		JOptionPane.showMessageDialog(null, "The logarithm of " + val + " with a base of " + base + " is: " + answer);
		
	}
	
	
}
