package classesAndObjects;

import java.util.Scanner;
import classesAndObjects.Box;

public class BoxProgram {

	private static Scanner num;

	public static void main(String[] args) {
		
		num = new Scanner (System.in);
		
		Box s = new Box();
		System.out.println("Enter height: ");
		s.setHeightInIn(num.nextDouble());
		System.out.println("Enter length: ");
		s.setLengthInIn(num.nextDouble());
		System.out.println("Enter depth: ");
		s.setDepthInIn(num.nextDouble());
		System.out.println("Enter cost per sq. inch: ");
		s.setCostPerSqIn(num.nextDouble());
		
		System.out.println(s);
		System.out.println("Volume: "+s.findVolume());
		System.out.println("Surface Area: "+s.findSurfaceArea()+" sq. inches");
		System.out.println("Cost: "+s.findCost());
	}

}
