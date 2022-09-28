package Inheritance;

public class BasePlusCommisionEmployee extends ComEmp{
	private double baseSalary;

	public BasePlusCommisionEmployee(String fName,String lName, String ssn,double gSale,double comRate,double baseSalary)
	{
		super(fName,lName,ssn,gSale,comRate);
		setBaseSalary(baseSalary);
		
	}
	
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary>=0.0)
			this.baseSalary=baseSalary;
		else
			throw new IllegalArgumentException("Base Salary must be >=0.0");
		
	}
	
	@Override
	public double callculatePayment()
	{
		return baseSalary+(super.getComRate()*super.getgSale());
	}
	
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Commision Employee Name:",super.getfName(),super.getlName(),"Social Security Number",super.getSsn(),
				"The Gross Sale:",super.getgSale(),"Commision Rate:",super.getComRate(),"The Base Salary",baseSalary);
	}
	

}
