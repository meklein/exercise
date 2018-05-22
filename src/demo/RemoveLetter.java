package demo;

import java.util.Scanner;

public class RemoveLetter {

		public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter word: ");
		String word = sc.nextLine();
		
		System.out.println("Enter character to remove: ");
		char letter = sc.next().charAt(0);
		
		System.out.println("New word: "+ remove(letter, word));
		
	}
		
		public static String remove(char a, String b) {
			
			String newWord = " ";
			
			for (int i = 0; i<b.length(); i++) {
				
				if (b.toLowerCase().charAt(i) != a)
				newWord += b.charAt(i);
			}
				return newWord;
		}
			
}
