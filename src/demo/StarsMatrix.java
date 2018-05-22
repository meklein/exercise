package demo;

public class StarsMatrix {

	public static void main(String[] args) {
		
		for(int rows = 0; rows < 10; rows++) {
			
			for(int columns = 0; columns < 10; columns++) {
			
				if(columns==0 ||rows ==9) {
				System.out.print("*");
			}
				else {
				System.out.print(" ");
		}	
	}
			System.out.println();
}

}

}
