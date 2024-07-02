package Day6;

public class EmployeeStatic {
	//declare instance variable
	private String name;
	private int id;
	
	//declare static variable companyName with data type string assign value
	
	
	//TNS which is common for all objects
	static String companyName = "TNS";

	public EmployeeStatic(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeStatic [name=" + name + ", id=" + id + "]";
	}
	
	
	
	//declare two parameter constructor
	
	

}
