package Day6;

public class finalVar {
	
	//final int x;		//can't declared like this
	
	final int x=10;		//u have to mandatory assign value to variable as it is declared as final

	//declare a static blank final variable
	final static int y;
	
	//declare and initialized static final variable
	final static int z=20;
	
	//instance method
	void change()
	{
//		x=30;	//final variable can't be reassigned
//		y=200;	//final static variable can't be reassigned
	}

	@Override
	public String toString() {
		return "finalVar [x=" + x + ",y=" +y +"]";
	}
	
	//declare a static block to initialize final static variable
	static
	{
		y=30;
	//	z=100;	//once initialized cannot be assigned
	}
	
	
	
}
