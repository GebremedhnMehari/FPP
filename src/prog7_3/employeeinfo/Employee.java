package prog7_3.employeeinfo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;
	
	/*public Account savingsAcct;
	public Account checkingAcct;
	public Account retirementAcct;*/
	
	private AccountList accounts;

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

	/*public void createNewChecking(double startAmount) {
		checkingAcct=new Account(Employee.this,AccountType.CHECKING,startAmount);
		// implement
	}*/
	
	public void createNewSavings(double startBalance) {
		Account acct = new SavingsAccount(this,startBalance);
		//accounts is the name of the AccountList variable
		accounts.add(acct);
		}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct=new Account(Employee.this,AccountType.SAVINGS,startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct=new Account(Employee.this,AccountType.RETIREMENT,startAmount);
	}

	//public void deposit(AccountType acctType, double amt) 
	public void deposit(int accountIndex, double amt){
		// implement
		Account selected = accounts.get(acctIndex);
		selected.makeDeposit(amt);
	}

	public boolean withdraw(AccountType acctType, double amt) 
	public void withdraw(int accountIndex, double amt){
		// implement
		if (balance < amount) 
			System.out.println("You hav einsufficient balance.");
		Account selected = accounts.get(acctIndex);
		selected.withdraw(amt);
	}{
		// implement
		return true;
	}

	public String getFormattedAcctInfo() {
		// implement
		return null;
	}

}
