
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;
	public AccountList accounts= new AccountList();
	
	//public Account savingsAcct;
	//public Account checkingAcct;
	//public Account retirementAcct;

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
		//checkingAcct=new Account(Employee.this,AccountType.CHECKING,startAmount);
		// implement
		
		Account acct = new CheckingAccount(this,startAmount);
		//accounts is the name of the AccountList variable
		accounts.add(acct);
	}

	
	
	public void createNewSavings(double startAmount) {
		// implement
		//savingsAcct=new Account(Employee.this,AccountType.SAVINGS,startAmount);
		
		Account acct = new SavingsAccount(this,startAmount);
		
		//accounts is the name of the AccountList variable
		accounts.add(acct);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		//retirementAcct=new Account(Employee.this,AccountType.RETIREMENT,startAmount);
		
		Account acct = new RetirementAccount(this,startAmount);
		//accounts is the name of the AccountList variable
		accounts.add(acct);
	}

	public void deposit(int accountIndex, double amt) {
	
	Account selected = accounts.get(accountIndex);
	selected.makeDeposit(amt);
	
		// implement
	}

	public boolean withdraw(int accountIndex, double amt) {
		// implement
		Account selected = accounts.get(accountIndex);
		boolean result=selected.makeWithdrawal(amt);
	
		return result;
	}

	public String getFormattedAcctInfo() {
		// implement
	    
		 //  accounts.toString();
		    
			System.out.println("ACCOUNT INFO FOR "+name);
			System.out.println();
	/*		System.out.println("Account type :"+checkingAcct.acctType);
			System.out.println("Current bal :"+checkingAcct.balance);
			System.out.println("Account type :"+savingsAcct.acctType);
			System.out.println("Current bal :"+savingsAcct.balance);
			System.out.println("Account type :"+retirementAcct.acctType);
			System.out.println("Current bal :"+ retirementAcct.balance);
			System.out.println();
	*/
		return "";
	}

}
