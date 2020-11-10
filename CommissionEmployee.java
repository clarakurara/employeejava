// A commission employee is an employee that is paid a regular salary plus commission. Commission is computed based on the number of items sold and the amount of commission per item sold.  
public class CommissionEmployee extends Employee {

	private float regularSalary;  //fixed monthly salary
	private int itemSold;	      //total number of items sold
	private float commissionRate;	//rate per item (in decimal form)

	public CommissionEmployee() {

	}
	
	public CommissionEmployee(String name,String address, int age, String companyName, float regularSalary, int itemSold, float commissionRate) {
		super(name,address,age,companyName);
		this.regularSalary = regularSalary;
		this.itemSold = itemSold;
		this.commissionRate = commissionRate;
	}

	// provide the setters and getters of your data members
	public void setRegularSalary(float regularSalary) {
		this.regularSalary = regularSalary;
	}
	public void setItemSold(int itemSold) {
		this.itemSold = itemSold;
	}
	public void setCommission_rate(float commissionRate) {
		this.commissionRate = commissionRate;
	}

	public float getRegularSalary() {
		return regularSalary;
	}
	public int getItemSold() {
		return itemSold;
	}	
	public float getCommission_rate() {
		return commissionRate;
	}
	
	// implement the abstract method
	@Override
	public double earnings() {
		double earnings = regularSalary + (itemSold*commissionRate);
		return earnings;
	}//the total earnings of a commission employee is the sum of the monthly salary plus the commission.
	//commission will be based on the total number of items sold times the commission rate per item.

	// override the toString() and equals() methods
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(super.toString());
		sb.append(" "+ regularSalary+ " "+itemSold+" "+commissionRate);
		return sb.toString();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CommissionEmployee) {
			CommissionEmployee ce=(CommissionEmployee)obj;
			if(super.equals(ce) && this.regularSalary==ce.regularSalary && this.itemSold==ce.itemSold && this.commissionRate==ce.commissionRate)
				return true;
		}
		return false;
	}
}

