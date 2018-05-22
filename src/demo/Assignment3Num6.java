package demo;

public class Assignment3Num6 {

	public static void main(String[] args) {
		
		for(int rows = 0; rows < 4; rows++) {
				
			for(int columns = 0; columns < 4; columns++) {
				
				if (rows >= columns) 
				System.out.print(rows+1);	
				
			}	
			System.out.println();
		}
	}	
}