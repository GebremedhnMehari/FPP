package programmingAss3_2;

/*public class Employee {

}*/
import java.util.Date;
import java.util.GregorianCalendar;

import programmingAssig3.Account;
import programmingAssig3.AccountType;

public class Employee {
private Account savingsAcct;
private Account checkingAcct;
private Account retirementAcct;
private String name;
private Date hireDate;
public Employee(String name, int yearOfHire,
int monthOfHire, int dayOfHire){
this.name = name;
GregorianCalendar cal =
new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
hireDate = cal.getTime();
}
public void createNewChecking(double startAmount) {
	startAmount=new Account(employee, AccountType.CHECKING,300.00);
// implement
}
public void createNewSavings(double startAmount) {
// implement
}
public void createNewRetirement(double startAmount) {
// implement
}
public void deposit(AccountType acctType, double amt){
// implement
}
public boolean withdraw(AccountType acctType, double amt){
// implement
}
public String getFormattedAcctInfo() {
// implement
return null;
}
}
/*public class Employee {
	

	// constructor
	Employee(String aName, String aNickName, double aSalary, int aYear,
			int aMonth, int aDay) {
		name = aName;
		nickName = aNickName;
		salary = aSalary;
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
// instance fields
	private String name;
	private String nickName;
	private double salary;
	private Date hireDay;

}*/
