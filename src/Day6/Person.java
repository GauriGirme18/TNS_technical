package Day6;

//Association 

public class Person {
	private String name;
	private Address addr;
	public Person(String name, Address addr) {
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	//method to display person's info
	public void displayInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("Address : "+addr.getStreet()+" , "+addr.getCity()+" , "+addr.getState()+" , "+addr.getPostalCode());
	}

}
