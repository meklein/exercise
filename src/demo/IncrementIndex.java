package demo;

public class IncrementIndex {

	public static void main(String[] args) {

		String str = "claim";
		
		//for loop that prints characters in each position
		for(int i=0; i<str.length(); i++) {
			
			//take a string input and only print characters in an even position
			if (i%2 == 0) {
				System.out.print(str.charAt(i));
			}
	
		}
	}
}
