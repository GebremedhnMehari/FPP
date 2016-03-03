/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson7assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;
	
	public Account savingsAcct;
	public Account checkingAcct;
	public Account retirementAcct;
	
	//private AccountList accounts;

	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");

	// constructor
	Employee(String aName,  int aYear, int aMonth, int aDay) {
		name = aName;
		//nickName = aNickName;
		// salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String aNickName) {
		nickName = aNickName;
	}

	public double getSalary() {
		return salary;
	}

	// needs to be improved!!
	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public void createNewChecking(double startAmount) {
		checkingAcct=new Account(Employee.this,AccountType.CHECKING,startAmount);
		// implement
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct=new Account(Employee.this,AccountType.SAVINGS,startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct=new Account(Employee.this,AccountType.RETIREMENT,startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch(acctType){
		case CHECKING:
			checkingAcct.makeDeposit(amt);
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
	    default:
			
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		// implement
		return true;
	}

	public String getFormattedAcctInfo() {
		// implement
		return null;
	}

}
