package Methods;

import java.util.Scanner;

public class LotteryTicket {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		
		System.out.println("Enter number 1: ");
		int a = sc.nextInt();
		System.out.println("Enter number 2: ");
		int b = sc.nextInt();
		System.out.println("Enter number 3: ");
		int c = sc.nextInt();

		System.out.println("Lottery Winnings: " + greenTicket(a, b, c));
	}

		public static int greenTicket(int a, int b, int c) {
			int winner;
			
			if (a==b && b==c) {
				winner = 20;
			}
			else if (a==b || a==c || b==c) {
				winner = 10;
			}
			else {
				winner = 0;
			}
			return winner;
		}
}
