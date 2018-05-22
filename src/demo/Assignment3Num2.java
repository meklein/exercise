package demo;

public class Assignment3Num2 {

			public static void main(String[] args) {
				
				for(int rows = 0; rows < 5; rows++) {
					
					for(int columns = 0; columns < 5; columns++) {
					
						if(columns<rows) 
							System.out.print("*");
							
							else 
								System.out.print(" ");
						}
					System.out.println();
				}	
			}	
		}
