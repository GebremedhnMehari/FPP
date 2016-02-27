package programmingAss4;

public class BinSearch {
	public boolean search(String s, char c) {
		int m = s.length() / 2;
		char ch = s.charAt(m);
		if (c == ch)
			return true;
		else 
		{
		if (c < ch)
			search(s.substring(0, m), c);
		else 
			search(s.substring(m+1,s.length()), c);
		}
		return false;
	}

	// main method
	public static void main(String args[]) {
		BinSearch input = new BinSearch();
		boolean result = input.search("abdel", 'e');
		 //System.out.println(" Is the character found in the given String ="+result);
		//System.out.println((int) ('K'));
		String k="calculated";
		int n = k.length() / 2;
		System.out.println(k.indexOf(n));
		System.out.println(k.charAt(n));
		/*System.out.println(k.substring(0,n ));
		System.out.println(k.substring(n+1, k.length()));*/
	}
}
