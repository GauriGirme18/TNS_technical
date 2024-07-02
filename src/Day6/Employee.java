package Day6;

public class Employee {
	
	private String name;
	private int employeeId;
	private String dept;
	
	//constructor
	public Employee()
	{
		super();
	}
	public Employee(String name, int employeeId, String dept) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", dept=" + dept + "]";
	}
}
