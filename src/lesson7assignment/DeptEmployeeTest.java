/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
// a super class to store details of the Department Employee

class DeptEmployee{
	//instance fields
	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	DeptEmployee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void setHireDay(Date hireDay) {
		this.hireDay = hireDay;
	}

	// instance methods
	
	public double computeSalary() {
		return salary;
	}


}
/////////////////////////////////
class Professor extends DeptEmployee{
	
	public Professor(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		numberOfPublications = 0;
	}
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public void setPl(int  np) {
		numberOfPublications = np;
	}

	int numberOfPublications;
}
///////////////////////////////////////
class Secretary extends DeptEmployee{
	
	
	public Secretary(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		overtimeHours = 0;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		double baseSalary= super.computeSalary();
		return baseSalary+12*overtimeHours;
	}
	

	public void setOt(double ot) {
		overtimeHours= ot;
	}


	double overtimeHours;
}
////////////////////////////////////
public class DeptEmployeeTest {
	// Inheritance Example
		public static void main(String[] args) {
			
			Professor prof1 = new Professor("A", 60000, 2007, 12, 5);
			prof1.setPl(10);
			Professor prof2 = new Professor("B", 40000, 2011, 02, 24);
			prof2.setPl(10);
			Professor prof3 = new Professor("C", 50000, 2009, 06, 17);
			prof3.setPl(10);
			Secretary sec1 = new Secretary("D", 20000, 2004, 07, 15);
			sec1.setOt(200);
			Secretary sec2 = new Secretary("E", 30000, 2006, 03, 21);
			sec2.setOt(200);
			
			DeptEmployee[] department = new DeptEmployee[5];

			department[0] = prof1;
			department[1] = prof2;
			department[2] = prof3;
			department[3] = sec1;
			department[4] = sec2;
			
			// print total salaries
			
			Scanner input = new Scanner(System.in);
			System.out.println("Do you want to see the sum Salary in the Department: Y/N");
			//char ch = input.next(".").charAt(0);
			char ch = input.next().charAt(0);
			if(ch=='Y'){
			double totalsalary=0;
			for(DeptEmployee d : department) {
				totalsalary+=d.computeSalary();
			}
			
			System.out.println("The total Salary is Name: "+ totalsalary);
			}
}
}
