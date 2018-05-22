package demo;

import java.util.Scanner;

public class MaxABC {

	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("Enter number: ");
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter number: ");
		sc = new Scanner(System.in);
		int b = sc.nextInt();
				
		System.out.println("Enter number: ");
		sc = new Scanner(System.in);
		int c = sc.nextInt();

		
		System.out.println("Max number: \n" + max(a,b,c));
		System.out.println("Min number: \n" + min(a,b,c));
			
		int median = (a+b+c)-max(a,b,c)-min(a,b,c);
		
		System.out.println("Median number: \n" + median);
		
	}

	public static int max(int x, int y, int z) {
		
		if (x>y && x>z)
			return x;
		else if (y>z)
			return y;	
		else
			return z;
	}
	public static int min(int x, int y, int z) {
		
		if (x<y && x<z)
			return x;
		else if (y<z)
			return y;	
		else
			return z;
	}
}

