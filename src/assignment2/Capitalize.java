package assignment2;

public class Capitalize {
	public char toLower(char ch){
		if (ch>='A' && ch<='Z')
		{
			return (char) ((ch -'A')+'a');
			
		}
		return ch;
		}
		
		//to print characters
		public void printChar(){
			for (char ch='A'; ch<='Z';ch++){
				System.out.print(ch);			
			}
		}
		public static void main(String args[]){
			Capitalize c1=new Capitalize();
			
			c1.printChar();
		}

}
