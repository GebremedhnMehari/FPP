package programmingAss4;

public class MinSort {
	String S = "";

	public String sort(String s) {

		int minpos = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) < s.charAt(minpos)) {
				minpos = i;
			}
		}
		 
		 //System.out.println(s.charAt(minpos));
		 //System.out.println(s.charAt(0));
			
		 char[] c = s.toCharArray();
		 char temp = c[0];
			c[0] = c[minpos];
			c[minpos] = temp;
		
		 String swap = new String(c);
		 //System.out.println(swap.charAt(minpos));
		 //System.out.println(swap.charAt(0));
		 
		String t = swap.substring(1);

		sort(t);

		S = t + swap.charAt(0);

		return null;
	}
	
	public static void main(String args[]) {
		MinSort input = new MinSort();
		String result = input.sort("fazeb");
		System.out.println(" S=" + result);
	}
}
