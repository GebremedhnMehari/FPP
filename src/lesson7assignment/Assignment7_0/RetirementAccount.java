
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

public class RetirementAccount extends Account {
	
	public RetirementAccount(Employee emp, double balance) {
		super(emp,balance);
		super.acctType=AccountType.RETIREMENT;
	}
	
	public AccountType getAcctType() {
		
		 return AccountType.RETIREMENT;
		}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double penality = (2/100)*baseBalance;
		return baseBalance + penality;
		}
}
