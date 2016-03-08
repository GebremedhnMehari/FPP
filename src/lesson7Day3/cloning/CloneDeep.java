

/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day3
 */
package lesson7Day3.cloning;

import java.util.Date;
import java.util.GregorianCalendar;

class EmployeeClone  implements Cloneable {
	
	private String name;
	private Double salary;
	private Date dateOfJoinig;
	 String jobDescription;

	public EmployeeClone (String name,Double salary,String jobDescription,int year,int month,int day) {
		this.name= name;
		this.salary= salary;
		this.jobDescription= jobDescription;		
		GregorianCalendar cal = new GregorianCalendar(year, month - 1, day);
		this.dateOfJoinig = cal.getTime();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// shallow copy is fine here – variables are primitive or immutable
		return (EmployeeClone ) super.clone();
	}

	public String toString() {
		return this.getClass().getSimpleName() + "[" +  this.name+ ", " +this.salary+ ", " +this.jobDescription+ ", " +this.dateOfJoinig + "]";
	}
	
}

class Manager implements Cloneable {
	double bonus;
	EmployeeClone  employee;

	public Manager(double name, EmployeeClone  j) {
		this.bonus = name;
		 employee = j;
	}

	public String toString() {
		return  employee +", Bonus: " + bonus;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// creates a deep copy
		Manager mcopy = (Manager) super.clone();
		mcopy. employee = (EmployeeClone )  employee.clone();
		return mcopy;
	}
}

public class CloneDeep {
	public static void main(String[] args) {
		EmployeeClone  joesjob = new EmployeeClone ("Martinez",8000.00,"Programmer",2010,6,26);
		Manager joe = new Manager(500.00, joesjob);

		try {
			Manager joecopy = (Manager) joe.clone();
			System.out.println(joecopy);
			joecopy. employee.jobDescription = "Web Developer"; // does not change original object!
			System.out.println(joe);
			System.out.println(joecopy);
		} catch (CloneNotSupportedException e) {
		}
	}
}
