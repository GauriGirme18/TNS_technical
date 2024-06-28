package Day3;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		
		System.out.println("Enter customer id : ");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter customer name : ");
		name=sc.nextLine();
		
		System.out.println("Enter customer city : ");
		city=sc.nextLine();
		
		Customer c1=new Customer();			//default constructor
		c1.setCustCity(city);
		c1.setCustId(id);
		c1.setCustName(name);
		System.out.println(c1);
		
		Customer c2=new Customer(name,id,city);
		System.out.println(c2);
	}

}
