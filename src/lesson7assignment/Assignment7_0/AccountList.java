
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment.Assignment7_0;

import java.util.Arrays;

public class AccountList {
	int n = 10;
	private String[] strArray = new String[n];
	Account[] account=new Account[n];
	int size = 0;
	int a = 0, r = 0;

	AccountList() {
		// size=0;
		if (n == size - 1)
			resize();
	}

	public void add(Account s) {
	
		if (n == size)
			   resize();
			//strArray[size] = s;
		     account[size]=s;
			size++;
			a++;
			
	}
	
	public void adds(String s) {
		
		if (n == size)
			   resize();
			strArray[size] = s;
		    // account[size]=s;
			size++;
			a++;
			
	}

	public Account get(int i) {
		
		return account[i];
	}

	public boolean find(String s) {
		for (int j = 0; j < account.length; j++) {
			if (s.equals(account[j])) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String s) {
		for (int j = 0; j < account.length; j++) {
			if (s.equals(account[j])) {
				account[j] = null;
				size--;
				r++;
				for (int k = j; k < account.length - 1; k++) {
					account[k] = account[k + 1];

				}
				return true;
			}
		}

		return false;
	}

	public String toString() {
		String s="[";
		for (int i = 0; i < size(); i++)
			//System.out.print(strArray[i] + "  ");
		    
		    s+=strArray[i] + "  ";
		return s+"]";
	}

	public int size() {
		return a - r;
	}

	private void resize() {
		 String[] copy = new String[2*size];
		n = n * 2;
		 strArray=Arrays.copyOf(strArray, n);
		 account=Arrays.copyOf(account, n);
		//System.arraycopy(strArray, 0, copy, 0, size);
		System.out.println("Resizing...");
	}

	public static void main(String[] args) {
		/*	Employee emps  = new Employee("Jim Daley", 2000, 9, 4);
		AccountList l = new AccountList();
		
		Account acct = new CheckingAccount(emps,500);
		
		l.add(acct);
		
		System.out.println("The list of size " + l.size() + " is " + l);
		for (int i = 0; i < l.size(); i++)
			System.out.print(l.account[i] + "  ");
		
*/
		/* for(String s: l.strArray)
		System.out.print("[");
		for (int i = 0; i < l.size(); i++)
			System.out.print(l.strArray[i] + "  ");
		System.out.print("]");
	 */
	}

}
