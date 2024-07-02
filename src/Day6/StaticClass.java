package Day6;

public class StaticClass {
	private int section;	//non-static variable or instance variable
	private static int srNo;	//static OR class variable
	
	//static block
	static		//in this,we cannot access non-static members
	{
		System.out.println("------ within static block ------");
		srNo=1000;
	}
	
	//default constructor
	public StaticClass() {
		// TODO Auto-generated constructor stub
		System.out.println("------- within default constructor -----------");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "StaticClass [Serial No= "+srNo+",section=" + section + "]";
	}
	
	//static method
	static void display()
	{
		//System.out.println("Section : "+section);	//gives error because static method cannot access non-static members
		System.out.println("Serial No : "+srNo);
	}
	

}
