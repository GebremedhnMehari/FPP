
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day3
 */
package lesson7assignment7_5day3_case1;

import java.util.GregorianCalendar;
import java.util.Objects;

/*public class Person {

}*/
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

	// @Override
	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof Person))
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name) && this.dateOfBirth.equals(p.dateOfBirth);
		return isEqual;
	}

	public int hashCode() {
		return Objects.hash(name, dateOfBirth);
	}

}
