
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

public class CheckingAccount extends Account {
	
    public CheckingAccount(Employee emp, double balance) {
		super(emp,balance);
		super.acctType=AccountType.CHECKING;
	}
	
	public AccountType getAcctType() {
		
		 return AccountType.CHECKING;
		}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double service = 5;
		return baseBalance - service;
		}
}
