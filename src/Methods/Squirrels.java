package Methods;

import java.util.Scanner;

public class Squirrels {
	
	public static void main(String[] args) {
		
		/* 4. The squirrels in Palo Alto spend most of the day playing. 
		 * In particular, they play if the temperature is between 60 and 90 (inclusive). 
		 * Unless it is summer, then the upper limit is 100 instead of 90. 
		 * Given an int temperature and a boolean isSummer, 
		 * return true if the squirrels play and false otherwise.*/

		Scanner sc = new Scanner (System.in);
		Scanner t = new Scanner (System.in);
		
		System.out.println("What's the temperature? ");
		int temp = sc.nextInt();
		
		System.out.println("What season is it? ");
		String season = t.nextLine();
		
		boolean isSummer;
		
		if (season.toLowerCase().equals("summer")) {
			isSummer = true;
		}
		else {
			isSummer = false;
		}
		System.out.println(squirrelsPlay(temp, isSummer));
	}
	
	public static boolean squirrelsPlay(int temp, boolean summer) {
		
		boolean play;
		
		if (summer == true) {
			if (temp>=60 && temp<=100)
				play = true;
			else 
				play = false;
		}
		else {
			if (temp>=60 && temp<=90)
				play = true;
			else 
				play = false;
		}		
		return play;
	}	

}
