/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment6
 */
package lesson6assignment2;


public class MyTable {
	private Entry[] entries= new Entry[26];
	
	public static void main(String[] args) {

		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t);
		System.out.println(t.get('b'));
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		if (c>='a' && c<='z')
		{
			int index= (c -'a');
			return entries[index].strg;
			
		}
		
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
			//implement
		entries[c-'a']=new Entry(s, c);	
		entries[c-'a'].chr=c;
		entries[c-'a'].strg=s;
		
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		for(Entry e: entries)
			if(e!=null)
			System.out.println(e.chr+"->"+e.strg);
		return "";
	}
	
	
	private class Entry {
		private char chr;
		private String strg;
		Entry(String str, char ch){	
		chr=ch;
		strg=str;

		}
		
		//returns a String of the form "ch->str" 
		public String toString() {
			
			//implement
			for(Entry e: entries)
				if(e!=null)
				System.out.println(e.chr+"->"+e.strg);
			return "";
		}
	}

}