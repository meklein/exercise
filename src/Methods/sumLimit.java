package Methods;

import java.util.Scanner;

public class sumLimit {

	public static void main(String[] args) {
		/*5. Given 2 non-negative ints, a and b, return their sum, 
		 * so long as the sum has the same number of digits as a. 
		 * If the sum has more digits than a, just return a without b.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter another number: ");
		int b = sc.nextInt();
		
		System.out.println(sumLimit(a,b));
	}
	
	public static int sumLimit(int a, int b) {
		int limit = Integer.toString(a).length();
		System.out.println("limit: "+limit);
		int sum = Integer.toString(a+b).length();
		System.out.println("sum: "+sum);
		
		if (sum != limit) {
			return a;
		}
		else {
			return a+b;
		}
	}
}
