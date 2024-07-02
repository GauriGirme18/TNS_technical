package Day5;

public class Citizen {
	private String name;
	private String adhar;
	private String addr;
	private long phone;
	
	public Citizen()		//default constructor
	{
		System.out.println("Citizen object is created...");
	}

	//parameterized constructor
	public Citizen(String name, String adhar, String addr, long phone) {
		this.name = name;
		this.adhar = adhar;
		this.addr = addr;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	//toString() -> prints all the things of this related to objects
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhar=" + adhar + ", addr=" + addr + ", phone=" + phone + "]";
	}
}
