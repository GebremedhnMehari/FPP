
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

import java.util.*;


class Account {
	// public final static String CHECKING = "checking";
	// public final static String SAVINGS = "savings";
	// public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp,  DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ",\n balance = " + balance;
	}

	public void makeDeposit(double deposit) {

		this.balance += deposit;
	}
	
	public double getBalance(){
		
		if(acctType==AccountType.CHECKING)
	    	balance-=5;
		else if(acctType==AccountType.SAVINGS)
	    	balance+=(balance*0.25/100);
		return balance;
	
	}

	public boolean makeWithdrawal(double amount) {
		if (balance >= amount) {
			if(acctType==AccountType.RETIREMENT)
			balance=balance- (balance*0.02)-amount;
			//balance -= amount;
			return true;
		} else{
			System.out.println("Withdrawal can not made because ofInsufficient balance  ");
			return false;
		}
	}
}
