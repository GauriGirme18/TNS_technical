package Day4;

//singleton class : creating an class and its object can be called every time.

public class MyClass {
	private static MyClass obj=new MyClass();
	
	private int id;

	public static MyClass getObj() 
	{
		return obj;
	}

	public static void setObj(MyClass obj) {
		MyClass.obj = obj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private MyClass()
	{
		System.out.println("MyClass object is created");
	}
	public static MyClass getObject()				//factory method
	{
		return obj;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
}
