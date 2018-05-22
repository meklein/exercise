package classesAndObjects;

import java.util.Scanner;
import classesAndObjects.Date;

public class DateProgram {
	
	private static Scanner num;

	public static void main(String[] args) {

		num = new Scanner (System.in);
		
		Date y = new Date();
		System.out.println("Enter your birthday month number");
		y.setMonth(num.nextInt());
		System.out.println("Enter your birthday day number");
		y.setDay(num.nextInt());
		System.out.println("Enter your birth year");
		y.setYear(num.nextInt());
		
		Date x = new Date(5, 22, 2018);
		
		System.out.println("Birthday: "+y.displayDate());
		System.out.println("Today's date: "+x.displayDate());

	}

}
