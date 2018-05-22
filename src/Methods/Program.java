package Methods;

import java.util.Scanner;

public class Program {

	private static Scanner str;
	private static Scanner num;

	public static void main(String[] args) {

		str = new Scanner (System.in);
		num = new Scanner (System.in);
		
		System.out.println("Enter Student Name: ");
		String x = str.nextLine();
		Student s = new Student(x);
		System.out.println("Enter Student Age: ");
		s.setAge(num.nextInt());
		System.out.println("Enter Student ID: ");
		s.setsId(num.nextInt());
		System.out.println("Enter Student GPA: ");
		s.setGpa(num.nextDouble());
		
		Student s1 = new Student("John");
		s1.setGpa(4.0);
		s1.setAge(24);
		s1.setsId(12345);
		
		Student s2 = new Student("Amy", 3, 34, 3.4, 1000);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s.getName());

		System.out.println(s2.generateStudentBill());
		
		System.out.println("Average Student Age: "+(s.getAge()+s1.getAge()+s2.getAge())/3);

	}

}
