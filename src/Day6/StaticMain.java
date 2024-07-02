package Day6;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.display();
		
		StaticClass s1=new StaticClass();
		System.out.println(s1);
		
		StaticClass.display();
		
		StaticClass s2=new StaticClass();
		System.out.println(s2);
		StaticClass.display();
	}

}
