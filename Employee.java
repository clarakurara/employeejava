// Implement a class Employee with the following attributes: name, age, company and address.

public  abstract class Employee{
	private String name;
    private String address;
    private int age;
  	private String companyName;

	public Employee() {}
	
	public Employee(String name,String address,int age,String companyName) {
		this.name=name;
	    this.address=address;
	    this.age=age;
	    this.companyName = companyName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public String getCompanyName(){
		return companyName;
	}

   // Override the display method in the Person class
	 public void display() {
	        System.out.println("Name: "+getName());
	        System.out.println("Address: "+getAddress());
	        System.out.println("Age: "+getAge());
	        System.out.println("Company: "+ companyName);
	    }
	 
	// abstract method that should be implemented by classes extending this class. 
	//note that we can not compute earnings here since at this point, the class has no information regarding salary.
	public abstract double earnings();

	// override the toString() and equals() methods
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append(name + " " +address+ " " + age+" "+ companyName);
		return sb.toString();
	}
	
	 public boolean equals(Object obj) {
			if(obj instanceof Employee) {
				Employee e=(Employee)obj;
				if(this.name.equals(e.name) && this.address.equals(e.address) && this.age==e.age && this.companyName.equals(e.companyName))
					return true;
			}
			return false;
		}
}
