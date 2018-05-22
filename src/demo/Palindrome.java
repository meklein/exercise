package demo;

public class Palindrome {

	public static void main(String[] args) {
		
		String word = "Racecar";
		String backward = "";
		
		System.out.println(word);
		
		for (int i = word.length()-1; i >= 0; i --) {
			backward += word.charAt(i);
		}
			System.out.println(backward);

			if (word.equalsIgnoreCase(backward)) {
				System.out.println(word + " is a palindrome");
			}
			else {
				System.out.println(word + " is not a palindrome");
			}
		}

	}
