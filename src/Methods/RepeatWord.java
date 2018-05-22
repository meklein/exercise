package Methods;

import java.util.Scanner;

public class RepeatWord {

	public static void main(String[] args) {

		Scanner str = new Scanner (System.in);
		Scanner num = new Scanner (System.in);
		
		System.out.println("Enter word: ");
		String word = str.nextLine();
		
		System.out.println("Enter number of times to repeat: ");
		int number = num.nextInt();
		
		System.out.println("New word: "+ repeat(word, number));
		
	}
	
	public static String repeat(String a, int b) {
		
		String newWord = " ";
		
		for (int i = 0; i<b; i++) 
			
			newWord = newWord.concat(a);
		
			return newWord;
}

}
