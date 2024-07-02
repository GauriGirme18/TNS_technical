package Day6;

public class ExecutorMain {

	public static void main(String[] args) {
		
		Address addr=new Address("405 karve nagar", "Pune", "MH", "413801");
		Person p=new Person("Gauri", addr);
		p.displayInfo();
		
		System.out.println(p);
	}

}
