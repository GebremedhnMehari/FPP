package programmingAss4;

/*public class BinSearchV2 {

}*/
public class BinSearchV2 {
	public boolean search(String s, char c) {
		int m = s.length() / 2;
		char ch = s.charAt(m);
		if ((int) c == (int) ch)
			return true;
		else {
			if ((int) c < (int) ch)
				search(s.substring(0, m), c);
			else
				search(s.substring(m + 1, s.length()), c);
		}
		return false;
	}

	// main method
	public static void main(String args[]) {
		BinSearchV2 input = new BinSearchV2();
		boolean result = input.search("abdel", 'a');
		System.out.println(" Is the character found in the given ascending order String = " + result);
		// System.out.println((int)('K'));
	}
}