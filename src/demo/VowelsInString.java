package demo;

public class VowelsInString {

public static void main(String[] args) {
		
	String word = "Happy Holidays";
	int count = 0;
	
	System.out.println(word);
		
		for (int i=0; i<word.length(); i++) {
			
			word.toLowerCase();
			
			if (word.charAt(i)== 'a' || 
				word.charAt(i)== 'e' ||
				word.charAt(i)== 'i' ||
				word.charAt(i)== 'o' ||
				word.charAt(i)== 'u')
				count++;
			}
			System.out.println("Output: "+count);
	}
}
