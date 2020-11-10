// An hourly employee is paid based on the number of hours worked times the rate.
public class HourlyEmployee extends Employee
{
	private int hours;  //total number of hours worked
	private double rate;	  // rate per hour

	public HourlyEmployee(String name, String address, int age, String companyName, int hours, double rate)	{
		super(name,address,age,companyName);
		this.hours = hours;
		this.rate = rate;
	}

	public HourlyEmployee(String name, String address,int age, String companyName)	{
		super(name,address,age,companyName);
		hours = 0;
		rate = 0;
	}

	// provide the setters and getters of your data members
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public int getHours() {
		return hours;
	}
	public double getRate() {
		return rate;
	}
	// implement the abstract method
	@Override
	public double earnings() {
		if (hours > 40) {
			return rate*40+rate*1.5*(hours-40);
		}
		else {
		return rate*hours;
		}
	}
		//earnings is computed by having the product of the total number of hours worked and the rate.
		// but if the number of hours worked exceeds 40, the rate increases to 150% of the current rate.
		// (ex. rate=200; 150% = 300)

	
	// override the toString() and equals() methods
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(super.toString());
		sb.append(" "+ hours+ " "+rate);
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof HourlyEmployee) {
			HourlyEmployee he=(HourlyEmployee)obj;
			if(super.equals(he) && this.hours==he.hours && this.rate==he.rate)
				return true;
		}
		return false;
	}

}
