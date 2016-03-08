
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day3
 */
package lesson7assignment7_5day3_case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object otherObject) {
		if (!super.equals(otherObject))
			return false;
		PersonWithJob other = (PersonWithJob) otherObject;
		// super.equals checked that this and other belong to the same class
		return salary == other.salary;
	}

	// combine the hash code of instance fields
	public int hashCode() {
		return super.hashCode() + 17 * new Double(salary).hashCode();
	}

}