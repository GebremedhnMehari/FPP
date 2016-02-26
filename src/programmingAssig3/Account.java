package programmingAssig3;

enum AccountType {
	CHECKING, SAVINGS, RETIREMENT;
}
public class Account {
	/*public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";*/
	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;
	Account(Employee emp, AccountType acctType, double balance){
	employee = emp;
	this.acctType =acctType;
	this.balance = balance;
	}
	Account(Employee emp, AccountType acctType){
	this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
	return "type = " + acctType + ", balance = " + balance;
	}
	public void makeDeposit(double deposit) {
	    balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
		  if(amount<=balance){
			  balance-=amount;
			  return true;
		  }
	         return false;	
	}
	

}