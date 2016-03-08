
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

public class SavingsAccount extends Account {
	 public final  double INTEREST=0.25/100;
	public SavingsAccount(Employee emp, double balance) {
		super(emp,balance);
		super.acctType=AccountType.SAVINGS;
	}
	
	public AccountType getAcctType() {
		
		 return AccountType.SAVINGS;
		}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = INTEREST*baseBalance;
		return baseBalance + interest;
		}

}
