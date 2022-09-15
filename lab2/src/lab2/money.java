package lab2;

import javax.swing.JOptionPane;

public class money {

	public static void main(String[] args) {
		
		//Input Money
		
		String moneyString = JOptionPane.showInputDialog("How Much Money do you Have?");
		Integer money = Integer.parseInt(moneyString);
		
		//Find Grands
		
		Integer grands = money/1000;
		money %= 1000;
		System.out.println(grands + " grands");
		
		//Find Benjamins
		
		Integer benjamins = money/100;
		money%=100;
		System.out.println(benjamins + " benjamins");
		
		//Find Sawbucks
		
		Integer sawbucks = money/10;
		money%=10;
		System.out.println(sawbucks + " sawbucks");
		
		//Find Bucks
		
		Integer bucks = money;
		System.out.println(bucks + " bucks");
		
		//Output
		

	}

}
