package Day5;

//child class
public class Student extends Citizen{
	private int rollNo;
	private String clgName;
	
	public Student()
	{
		super();
	}

	public Student(String name, String adhar, String addr, long phone,int rollNo, String clgName) {
		super(name, adhar, addr, phone);
		this.rollNo = rollNo;
		this.clgName = clgName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", clgName=" + clgName + ", getName()=" + getName() + ", getAdhar()="
				+ getAdhar() + ", getAddr()=" + getAddr() + ", getPhone()=" + getPhone() + "]";
	}

	
	
	

}
