package demo;

import java.util.Scanner;

public class LoopsInLoops {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int rows = 0; rows < num; rows++) {
			
			for(int columns = 0; columns < 5; columns++) {
			
				System.out.print(columns);
			}
			System.out.println();
		}
	}
}
