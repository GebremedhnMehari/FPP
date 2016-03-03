package prog7_3;

import java.lang.reflect.Array;
import java.util.Arrays;

//Program 3-3 String List
public class MyStringList {
	int n = 2;
	private String[] strArray = new String[n];
	int size = 0;
	int a = 0, r = 0;

	MyStringList() {
		// size=0;
		//if (n == size - 1)
		//	resize();
	}

	public void add(String s) {
		
		if (n == size)
			   resize();
			strArray[size] = s;
			size++;
			a++;
			
	}

	public String get(int i) {
		
		return strArray[i];
	}

	public boolean find(String s) {
		for (int j = 0; j < strArray.length; j++) {
			if (s.equals(strArray[j])) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(String s) {
		for (int j = 0; j < strArray.length; j++) {
			if (s.equals(strArray[j])) {
				strArray[j] = null;
				size--;
				r++;
				//for (int k = j; k < strArray.length - 1; k++) {
					//strArray[k] = strArray[k + 1];

				//}
				return true;
			}
		}

		return false;
	}

	public String toString() {
		String s="[";
		for (int i = 0; i < size(); i++)
			//System.out.print(strArray[i] + "  ");
		    
		    s+=strArray[i] + " , ";
		return s+"]";
	}

	public int size() {
		return a - r;
	}

	private void resize() {
		 String[] copy = new String[2*size];
		n = n * 2;
		 strArray=Arrays.copyOf(strArray, n);
		//System.arraycopy(strArray, 0, copy, 0, size);
		System.out.println("Resizing...");
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);

		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);

		/* for(String s: l.strArray)
		System.out.print("[");
		for (int i = 0; i < l.size(); i++)
			System.out.print(l.strArray[i] + "  ");
		System.out.print("]");
	 */
	}

}
