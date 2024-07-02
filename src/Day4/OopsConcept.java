package Day4;

public class OopsConcept {
	private String name;
	private int age;
	private int SerialNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int serialNum) {
		SerialNum = serialNum;
	}
	@Override
	public String toString() {
		return "OopsConcept [name=" + name + ", age=" + age + ", SerialNum=" + SerialNum + "]";
	}
}
