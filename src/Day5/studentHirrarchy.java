package Day5;

public class studentHirrarchy {
	
	private String Class;
	private float per;
	
	public studentHirrarchy()
	{
		System.out.println("Student class");
	}

	public String getClass() {
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public studentHirrarchy(String name, String city,String class1, float per) {
		
		Class = class1;
		this.per = per;
	}

	@Override
	public String toString() {
		return "studentHirrarchy [Class=" + Class + ", per=" + per + "]";
	}
	
	
}
