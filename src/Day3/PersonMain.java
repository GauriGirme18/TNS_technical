package Day3;

import java.util.Scanner;		//ctrl+shift+O

public class PersonMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Person's Name : ");
		String name=sc.next();
		
		System.out.println("Enter Person's Age : ");
		int age=sc.nextInt();
		
		System.out.println("Enter Person's Gender : ");
		String gender=sc.next();
		
		System.out.println("Enter Person's Income : ");
		int income=sc.nextInt();
		
		//Person object and initialize values using setter
		
		Person p=new Person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		
		//display person data using toString
		System.out.println(p);
		
		//Tax calculation
		tax_calculate tc=new tax_calculate();
		tc.calculateTax(p);
		
		System.out.println("Tax after calculation : ");
		System.out.println(p);
	}
}
