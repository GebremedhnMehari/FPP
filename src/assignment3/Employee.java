package assignment3;

public class Employee {
	private String nameOfEmployee;
	private String nameOfSupervisor;
	private double EmployeeSalary;
	
	public Employee(String nameOfEmployee,String nameOfSupervisor,double EmployeeSalary){
		
		this.nameOfEmployee=nameOfEmployee;
		this.nameOfSupervisor=nameOfSupervisor;
		this.EmployeeSalary=EmployeeSalary;
		
	}

	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

	public String getNameOfSupervisor() {
		return nameOfSupervisor;
	}

	public void setNameOfSupervisor(String nameOfSupervisor) {
		this.nameOfSupervisor = nameOfSupervisor;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	 public void display(){
		 System.out.println("The Name of the Employee is=:"+nameOfEmployee);
		 System.out.println("The Name of the Supervisor is=:"+nameOfSupervisor);
		 System.out.println("The Salary of the Employee is=:"+EmployeeSalary);
	 }
	
	public static void main(String args[]){
		Employee emp=new Employee("Bob Cratchit","Ebenezer Scrooge",25.00);
		emp.display();
		emp.setEmployeeSalary(40.0);
		emp.display();
		emp.setEmployeeSalary(emp.getEmployeeSalary()*2);
		emp.display();
	}
}
