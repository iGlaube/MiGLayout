package OnePract2;


public class DIY2 {
	
	private String employee;
	private int salary;
	
	
	public DIY2(String eName, int eSalary){
		
		employee = eName;
		salary = eSalary;
		
	}


	public String getEmployee() {
		return employee;
	}


	public void setEmployee(String employee) {
		this.employee = employee;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void addWages (int eWage){
		
		salary += eWage;
	}

}

