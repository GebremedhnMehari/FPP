
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day3
 */
package lesson7assignment7_5day3_case1;

import java.util.GregorianCalendar;

/*public class PersonWithJob {

}*/
public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
	}
}