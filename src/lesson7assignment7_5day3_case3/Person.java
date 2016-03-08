
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day3
 */
package lesson7assignment7_5day3_case3;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Person {
	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public boolean equals(Object otherObject) {

		// a quick set to see objects are equal
		if (this == otherObject)
			return true;

		// must return false if the explicit parameter is null'
		if (otherObject == null)
			return false;

		// if the classes do not match they cannot be equal
		if (getClass() != otherObject.getClass())
			return false;

		// now we know otherObject is a non-null Employee
		Person other = (Person) otherObject;

		// test whether the fields have identical values
		return Objects.equals(name, other.name) && Objects.equals(dateOfBirth, other.dateOfBirth);
	}

	public int hashCode() {
		return Objects.hash(name, dateOfBirth);
	}

}
