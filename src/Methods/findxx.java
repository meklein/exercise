package Methods;

import java.util.Scanner;

public class findxx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String string = sc.nextLine();
		
		System.out.println("This string contains " + findString(string) + " 'xx'");

	}
		public static int findString(String word) {
			
			int numberOfxx = 0;
			
			for (int i=1; i<word.length(); i++) {
				
				if (word.charAt(i-1)=='x' && word.charAt(i)=='x')
					numberOfxx++;
			}
			return numberOfxx;
			
			
	}
}
