// A pieceworker employee is paid based on the number of items completed multiplied by the wage per item.

public class PieceWorker extends Employee{

	private int numberItems;	// total number of items finished
	private float wagePerItem;	// wage/rate per item

	public PieceWorker() {
		//
	}
	
	public PieceWorker(String name, String address,int age, String companyName, int numberItems, float wagePerItem) {
		super(name,address,age,companyName);
		this.numberItems = numberItems;
		this.wagePerItem = wagePerItem;
	}

	// provide the setters and getters of your data members
	public void setNumberItems(int numberItems) {
		this.numberItems = numberItems;
	}
	public void setWagePerItem(float wagePerItem) {
		this.wagePerItem = wagePerItem;
	}
	
	public int getNumberItems() {
		return numberItems;
	}
	public float getWagePerItem() {
		return wagePerItem;
	}
	
	// implement the abstract method
	@Override
	public double earnings() { // employee is paid according to the number of Items finished times the wage per item.
		return numberItems*wagePerItem;
	}
		

	//override toString() and equals()
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(super.toString());
		sb.append(" "+ numberItems+ " "+wagePerItem);
		return sb.toString();
	}
	public boolean equals(Object obj) {
		if(obj instanceof PieceWorker) {
			PieceWorker pw=(PieceWorker)obj;
			if(super.equals(pw) && this.numberItems==pw.numberItems && this.wagePerItem==pw.wagePerItem)
				return true;
		}
		return false;
	}
}
