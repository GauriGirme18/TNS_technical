package Day4;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessing the package 
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		//instance operator
		System.out.println(b1 instanceof Base);
		
		
		

	}

}
