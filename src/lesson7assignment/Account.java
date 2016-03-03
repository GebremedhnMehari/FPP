/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson7assignment;

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
	public AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
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

/*class CheckingAccount extends Account {
	CheckingAccount(Employee emp, AccountType acctType., double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}
	public AccountType getAcctType(){
		return Account.CHECKING;
	}
}

class SavingAccount extends Account {
}
class RetirementAccount extends Account {
}
*/
