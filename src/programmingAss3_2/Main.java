package programmingAss3_2;

/*public class Main {

}
*/

import java.util.Date;

/*import programmingAssig3.Account;
import programmingAssig3.AccountType;
import programmingAssig3.Employee;*/

public class Main {

	
	public static void main(String[] args) {
		Employee employee = new Employee("Bob", "Bob", 100000, 2001, 10, 10);
		Date d = employee.getHireDay();
		
		//System.out.println(d);//
		//System.out.printf("%tD", d);
		
		d.setTime(0);
		//System.out.printf("\n%tD", employee.getHireDay());
		System.out.println( employee.getHireDay());
		
		
		Account Checking =new Account(employee, AccountType.CHECKING,300.00);
		Account Saving =new Account(employee, AccountType.SAVINGS,300.00);
		Account Retirement=new Account(employee, AccountType.RETIREMENT,300.00);
		
		System.out.println(Checking.toString());
		System.out.println(Saving.toString());
		System.out.println(Retirement.toString());
		
	}

}