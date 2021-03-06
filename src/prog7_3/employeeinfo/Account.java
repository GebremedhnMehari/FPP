/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package prog7_3.employeeinfo;

import java.util.*;

enum AccountType {
  CHECKING, SAVINGS, RETIREMENT
}

class Account {
	// public final static String CHECKING = "checking";
	// public final static String SAVINGS = "savings";
	// public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ",\n balance = " + balance;
	}

	public void makeDeposit(double deposit) {

		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else
			return false;
	}
}


