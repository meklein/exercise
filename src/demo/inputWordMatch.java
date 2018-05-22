package demo;

import java.util.Scanner;

public class inputWordMatch {

	private static Scanner sc;

	public static void main(String[] args) {
		
		String str = "Meagan";
		
		sc = new Scanner(System.in);
		System.out.println("Enter Text: ");
		String text = sc.nextLine();
		
		if(str.equals(text)) { //must use .equals() when comparing strings or reference types
			System.out.println("The words match");
		}
		else {
			System.out.println("nope");
		}
		
		
	}

}
