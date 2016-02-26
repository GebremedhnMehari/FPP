
package assignment3;
/**
 * @author Gebremedhn Mehari, ID: 985113
 * This program displays tax payer informations: name,address,Occupation, Salary
 * It takes marital status in text format
 * Lab Assignment 3.5
 */
import java.util.Scanner;
import java.util.Date;

enum Status {
	SINGLE, MERRIEDJOINT, MERRIEDSEPARATE, HOUSEHOLD, QUALIFYINGWIDOW;
}

class InternalRevenue {
	private String name;
	private String address;
	private String Occupation;
	private double Salary;
	private static final double TAX = 0.2;
	private static final double BONUS = 0.1;
	private Date dataoftax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public void display() {
		System.out.println("The Name of the Employee is=:" + name);
		System.out.println("The Employee address is=:" + address);
		System.out.println("The Employee Occupation is=:" + Occupation);
		System.out.println("The Employee Salary is=:" + Salary);
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary - salary * TAX + salary * BONUS;
	}

	public Date getDataoftax() {
		return dataoftax;
	}

	public void setDataoftax(Date dataoftax) {
		this.dataoftax = dataoftax;
	}

	public int displaystatus(Status S) {
		switch (S) {
		case SINGLE:
			return 1;

		case MERRIEDJOINT:
			return 2;

		case MERRIEDSEPARATE:
			return 3;

		case HOUSEHOLD:
			return 4;

		case QUALIFYINGWIDOW:
			return 5;

		default:
			return 0;
		}
	}
}

//
class MaritalStatus {
	public static void main(String args[]) {

		Date d = new Date();

		InternalRevenue Taxpayer = new InternalRevenue();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Maritalstatus:");
		String Yourstatus = input.nextLine();

		Status S = Status.valueOf(Yourstatus);
		System.out.println(Taxpayer.displaystatus(S));

		Taxpayer.setName("Gebremedhn");
		Taxpayer.setAddress("FAIRFIELD,IA");
		Taxpayer.setOccupation("DEVELOPER");
		Taxpayer.setSalary(800.00);
		Taxpayer.setDataoftax(d);

		System.out.println("Name:" + Taxpayer.getName());
		System.out.println("Adress:" + Taxpayer.getAddress());
		System.out.println("Occupation:" + Taxpayer.getOccupation());
		System.out.println("Salary:" + Taxpayer.getSalary());
		System.out.println("Date of filling the tax:" + Taxpayer.getDataoftax());

	}
}