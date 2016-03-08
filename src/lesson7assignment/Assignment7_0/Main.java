
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

import java.util.*;

// Program for Exercise 7.0  and and this program is an application of polymorphism .
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
		char ch;
		do{
			
		menu();//Call the menu method for display the menu messages
        
		String answer1 = sc.next();
		if (answer1.equalsIgnoreCase("A")) {
			getFormattedAccountInfo();
			
		} else if (answer1.equalsIgnoreCase("B")) {

			for (int i = 0; i < emps.length; i++) {
				System.out.println(i + ". " + emps[i].getName());
			}

			System.out.print("Select an employee: (type a number) :");
			int selectedemployee = sc.nextInt();
			if (selectedemployee >= 0 && selectedemployee < emps.length) {

				AccountType[] actyp = AccountType.values();

				for (int i = 0; i < actyp.length; i++) {
					System.out.println(i + ". " + actyp[i].name());
				}

				System.out.print("Select an account: (type a number) :");
				int selectedAccount = sc.nextInt();
				if (selectedAccount >= 0 && selectedAccount < actyp.length) {

					System.out.print("Deposit amount :");
					double deposit = sc.nextDouble();

					emps[selectedemployee].deposit(selectedAccount, deposit);

				} else {
					System.out.println("Please type valid number");
					
				}
			} else {
				System.out.println("Please type valid number");
				
			}
		}

		else if (answer1.equalsIgnoreCase("C")) {
			for (int i = 0; i < emps.length; i++) {
				System.out.println(i + ". " + emps[i].getName());
			}

			System.out.print("Select an employee: (type a number) :");
			int selectedemployee = sc.nextInt();
			if (selectedemployee >= 0 && selectedemployee < emps.length) {

				AccountType[] actyp = AccountType.values();
                
				for (int i = 0; i < actyp.length; i++) {
					System.out.println(i + ". " + actyp[i].name());
				}

				System.out.print("Select an account: (type a number) :");
				int selectedAccount = sc.nextInt();
				if (selectedAccount >= 0 && selectedAccount < actyp.length) {

					System.out.print("Withdrawal amount :");
					double deposit = sc.nextDouble();

					emps[selectedemployee].withdraw(selectedAccount, deposit);
					
				} else {
					System.out.println("Please type valid number");
					
				}
			} else {
				System.out.println("Please type valid number");
				
			}
		}
		else{
			System.out.println("Please type valid choice");
		
		}
		
		System.out.println("Do you want to contiue eneter Y");
		ch=sc.next().charAt(0);
		
	}while(ch =='y' || ch =='Y');
		System.out.println("The application is end");
	}
	
	// Display the menu
	public void menu() {
		System.out.print("\n");
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.print("Make a selection (A/B/C):");
	}

	
	// Display the formatted account information
	String getFormattedAccountInfo() {

		for (Employee e : emps) {

			System.out.println("ACCOUNT INFO FOR " + e.getName());
			System.out.println();
			for (int i = 0; i < e.accounts.size(); i++) {
				if (e.accounts.account[i] != null)
					System.out.println("Account type :"
							+ e.accounts.account[i].acctType);
				System.out.println("Current bal :"
						+ e.accounts.account[i].getBalance());
			}
			System.out.println();
		}
		
		return "";
	}
}