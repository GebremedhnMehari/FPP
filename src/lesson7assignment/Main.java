
/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson7assignment;

import java.util.*;


//Program 3.2_Employee
public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(9300);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		
		// for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			String info = getFormattedAccountInfo();
			//System.out.println(info);
			
		} else {
			// do nothing..the application ends here
			System.out.println("The application ends");
		}
	}

	String getFormattedAccountInfo() {
		
		for(Employee e : emps) {
			System.out.println("ACCOUNT INFO FOR "+e.getName());
			System.out.println();
			System.out.println("Account type :"+e.checkingAcct.acctType);
			System.out.println("Current bal :"+e.checkingAcct.balance);
			System.out.println("Account type :"+e.savingsAcct.acctType);
			System.out.println("Current bal :"+e.savingsAcct.balance);
			System.out.println("Account type :"+e.retirementAcct.acctType);
			System.out.println("Current bal :"+e.retirementAcct.balance);
			System.out.println();
			
		}
		/*
		for(int i=0;i<=2;i++){
			
			System.out.println("ACCOUNT INFO FOR "+emps[i].getName());
			System.out.println();
			System.out.println("Account type :"+emps[i].checkingAcct.acctType);
			System.out.println("Current bal :"+emps[i].checkingAcct.balance);
			System.out.println("Account type :"+emps[i].savingsAcct.acctType);
			System.out.println("Current bal :"+emps[i].savingsAcct.balance);
			System.out.println("Account type :"+emps[i].retirementAcct.acctType);
			System.out.println("Current bal :"+emps[i].retirementAcct.balance);
			System.out.println();
		
		}
		*/
		// implement
		return null;
	}
}