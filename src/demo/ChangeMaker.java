package demo;

public class ChangeMaker {

	public static void main(String[] args) {


		//Variable		
		int amount = 99;
		
		//Change definitions
		int quarters = amount / 25;
		amount = amount % 25;
		int dimes = amount / 10;
		amount = amount % 10;
		int nickels = amount / 5;
		amount = amount % 5;
		int pennies = amount / 1;
		
		int initialAmount = quarters*25+dimes*10+nickels*5+pennies*1;
		
		System.out.println("Original Amount: "+initialAmount+"\nQuarters: "+quarters+"\nDimes: "+dimes+"\nNickels: "+nickels+"\nPennies: "+pennies);
//		int dimes = 

	}

}
