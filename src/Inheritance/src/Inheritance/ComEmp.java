package Inheritance;

public class ComEmp extends Object //Commission Employee Class
{

	private String fName;//first Name
	private String lName;//last Name
	private String ssn;//for social security number
	private double gSale;//grossSales
	private double comRate;//commission Rate
	
	public ComEmp(String fName,String lName,String ssn, double gSale,double comRate)
	{
		this.fName=fName;
		this.lName=lName;
		this.ssn=ssn;
		setgSale(gSale);
		setComRate(comRate);
		
		
	}
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getgSale() {
		return gSale;
	}
	public void setgSale(double gSale) {
		if(gSale>=0.0)
			this.gSale=gSale;
		else
			throw new IllegalArgumentException("Gross Sales must be >=0.0");
		
		
	}
	public double getComRate() {
		return comRate;
	}
	public void setComRate(double comRate) {
		if(comRate>0.0 &&comRate<1.0)
			this.comRate=comRate;
		else
			throw new IllegalArgumentException("The Commision rate must be >0.0 abd <1.0");
	}
	
	public double callculatePayment()
	{
		return comRate*gSale;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "Commision Employee Name:",fName,lName,"Social Security Number",ssn,
				"The Gross Sale:",gSale,"Commision Rate:",comRate);
	}
	
	
}