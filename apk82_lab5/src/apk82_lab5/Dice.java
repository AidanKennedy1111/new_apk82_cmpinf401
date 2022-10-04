package apk82_lab5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Dice {

	public static void main(String[] args) {
		
		
		String numRoll = JOptionPane.showInputDialog("How many rolls would you like to complete?");
		Random x = new Random();
		int rolls = Integer.parseInt(numRoll) ;
		RollDice(rolls,x);
		
	}
	
	public static void RollDice(int j, Random r) {
		int twos = 0;
		int threes=0;
		int fours=0;
		int fives=0;
		int sixes=0;
		int sevens=0;
		int eights=0;
		int nines=0;
		int tens=0;
		int elevens = 0;
		int twelves=0;
		
		for(int i = 0; i<j;i++) {
			int roll = r.nextInt(6)+1;
			int roll2 = r.nextInt(6)+1;
			int sum = roll+roll2;
			
			if(sum==2) {
				twos++;
			}
			else if(sum==3) {
				threes++;
			}
			else if(sum==4) {
				fours++;
			}
			else if(sum==5) {
				fives++;
			}
			else if(sum==6) {
				sixes++;
			}
			else if(sum==7) {
				sevens++;
			}
			else if(sum==8) {
				eights++;
			}
			else if(sum==9) {
				nines++;
			}
			else if(sum==10) {
				tens++;
			}
			else if(sum==11) {
				elevens++;
			}
			else if(sum==12) {
				twelves++;
			}
			
			
		}
		JOptionPane.showMessageDialog(null, "You rolled " + twos +" twos "+ twos+"/"+j
				+ "\n And " + threes + " threes "+ threes+"/"+j 
				+ "\n And " + fours + " fours "+ fours+"/"+j
				+ "\n And " + fives + " fives "+ fives+"/"+j
				+ "\n And " + sixes + " sixes "+ sixes+"/"+j
				+ "\n And " + sevens + " sevens "+ sevens+"/"+j
				+ "\n And " + eights + " eights "+ eights+"/"+j
				+ "\n And " + nines + " nines "+ nines+"/"+j
				+ "\n And " + tens + " tens "+ tens+"/"+j
				+ "\n And " + elevens + " elevens "+ elevens+"/"+j
				+ "\n And " + twelves + " twelves "+ twelves+"/"+j);
		String reRoll = JOptionPane.showInputDialog("Would you like to roll again? (Enter Yes or No)");
		if(reRoll.equalsIgnoreCase("Yes")) {
			String numRoll = JOptionPane.showInputDialog("How many rolls would you like to complete?");
			Random x = new Random();
			int rolls = Integer.parseInt(numRoll) ;
			
			RollDice(rolls,x);
		}else {
			return;
		}
	}

}
