package Day3;

public class Customer {
	private String custName;
	private int custId;
	private String custCity;
	
	public Customer()			//default constructor
	{
		System.out.println("Default constructor...");
	}

	public Customer(String custName, int custId, String custCity) //Parameterized constructor
	{			
		this();				//calling default constructor
		
		System.out.println("Parametrized Constructor");
		this.custName = custName;					//this keyword is used to point current constructor object
		this.custId = custId;
		this.custCity = custCity;
	}

	public String getCustName() 
	{
		return custName;
	}

	public void setCustName(String custName) 
	{
		this.custName = custName;
	}

	public int getCustId() 
	{
		return custId;
	}

	public void setCustId(int custId) 
	{
		this.custId = custId;
	}

	public String getCustCity() 
	{
		return custCity;
	}

	public void setCustCity(String custCity) 
	{
		this.custCity = custCity;
	}

	@Override
	public String toString() 
	{
		return "Customer [custName=" + custName + ", custId=" + custId + ", custCity=" + custCity + "]";
	}
}
