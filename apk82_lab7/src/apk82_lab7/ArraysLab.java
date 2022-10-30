package apk82_lab7;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class ArraysLab {

	public static void main(String[] args) {
		com();
	}

	public static void com() {
		String arrSize = JOptionPane.showInputDialog("How many randomly generated doubles should be entered into the array?");
		int size = 0;
		
		try{size = Integer.parseInt(arrSize);}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "There was an error. Please try again and only use numbers.");
			com();
		}
		
		double userInput[] = new double[size];
		
		for(int i=0;i<userInput.length;i++) {
			Random rand = new Random();
			// Create a random number from -100 to 200
			double newNum = -100 + (100+200)*rand.nextDouble();
			newNum *=100;
			int numInt = (int)Math.round(newNum);
			newNum = numInt/100.0;
			userInput[i]= newNum ;
		}
		
		JOptionPane.showMessageDialog(null, "Your array was: "+Arrays.toString(userInput)+
				"\n The maximum of your array is: "+ max(userInput)+
				"\n The minimum of your array is: "+ min(userInput)+
				"\n The sum of your array is: "+ sum(userInput)+
				"\n The average of your array is: "+ ave(userInput));
		String again = JOptionPane.showInputDialog("Would you like to generate a new array? (Enter Yes or No)");
		if(again.equalsIgnoreCase("Yes")) {
			again=null;
			com();
			
		}else {
			return;
		}
	}
	
	public static double max(double[]data) {
		double answer = 0.0;
		
		for(int i = 0; i<data.length;i++) {
			double temp = data[i];
			if(i==0) {
				answer=temp;
			}
			if(temp>answer) {
				answer=temp;
			}
		}
		System.out.println(answer);
		return answer;
		
		
	}
	
	public static double min(double[]data) {
		double answer = 0.0;
		
		for(int i = 0; i<data.length;i++) {
			double temp = data[i];
			if(i==0) {
				answer=temp;
			}
			if(temp<answer) {
				answer=temp;
			}
		}
		System.out.println(answer);
		return answer;
		
		
	}
	
	public static double sum(double[]data) {
		double answer = 0.0;
		
		for(int i = 0; i<data.length;i++) {
			double temp=data[i];
			answer+=temp;
		}
		System.out.println(answer);
		return answer;
		
		
	}
	
	public static double ave(double[]data) {
		double answer = 0.0;
		double sum = 0.0;
		
		for(int i = 0; i<data.length;i++) {
			double temp=data[i];
			sum+=temp;
			
			if(i+1==data.length) {
				answer=sum/data.length;
			}
		}
		System.out.println(answer);
		return answer;
	}
}
