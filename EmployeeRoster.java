//Implement a class for representing a list of all employees that is also capable of computing the payroll. 
//Call your class EmployeeRoster. 
//The class stores employee information in an array. 
//Note that the employees can be any of the three kinds of employees but they should be stored in the same array.

import java.util.ArrayList;

	public class EmployeeRoster{
		private ArrayList<Employee>list=new ArrayList<Employee>(6);
		
		public void add(Employee e) {
		list.add(e);
		}
		public void remove(Employee re) {
			list.remove(re);
		}
		public int count() {
			return list.size();	// returns number of employees
		}
		public int countCE() { // returns number of commission employees
			int ce=0;
			for (int i = 0; i<6; i++) {
				if (list.get(i) instanceof CommissionEmployee) {
					ce++;
				}
			}return ce;
		}
		public int countPE() {// returns number of piece workers
			int pe=0;
			for (int i = 0; i<6; i++) {
				if (list.get(i) instanceof PieceWorker) {
					pe++;
				}
			}return pe;
		} 
		public int countHE(){// returns number of hourly employees
			int he=0;
			for (int i = 0; i<6; i++) {
				if (list.get(i) instanceof HourlyEmployee) {
					he++;
				}
			}return he;
		} 
		public void display(){// displays all employees
			for (int i = 0; i< 6; i++){
			System.out.println(list.get(i).getName());
			}
		} 
		public void displayCE(){// displays all commission employees
			for (int i = 0; i<6; i++) {
				if (list.get(i) instanceof CommissionEmployee) {
					System.out.println(list.get(i).getName());
				}
			}
		} 
		public void displayPE(){
			for (int i = 0; i<6; i++) {
				if (list.get(i) instanceof PieceWorker) {
					System.out.println(list.get(i).getName());
				}
			}
		} // displays all piece workers
		public void displayHE(){
			for (int i = 0; i<6; i++) {
				if (list.get(i) instanceof HourlyEmployee) {
					System.out.println(list.get(i).getName());
				}
			}
		} // displays all hourly employees
		public void payroll(){// computes and displays all employees and their earnings
			for (int i = 0; i<6; i++) {
				System.out.println(list.get(i).getName()+" "+ list.get(i).earnings());
			}
		} 
	}