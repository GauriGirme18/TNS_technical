package Day6;

public class Manager extends Employee{
	private int teamSize;
	
	public Manager()
	{
		super();
	}

	public Manager(String name, int employeeId, String dept,int teamSize) {
		super(name,employeeId, dept);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId()
				+ ", getDept()=" + getDept() + "]";
	}
	
	

}
