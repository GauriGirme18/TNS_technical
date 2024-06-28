package Day2;


public class operator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("Value of a and b before operator : "+ a +" "+b);
		
		++a;		//11
		int c=++a + b + a--;	//12+20+12
		System.out.println(c);

		int a1=2;
		int d=a1-- + ++a1;	//2+1+1
		System.out.println(d);
		
	}

}

