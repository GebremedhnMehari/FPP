/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson4assignment;

import java.util.Scanner;

public class DivideSort {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type a String: ");
		String s = in.nextLine();
		
		
		DivideSort ds=new DivideSort();
		
		String result3=ds.divideSort(s);
		System.out.println(result3);
	}
	
	public String divideSort(String s) {
        
		String res="";
		if(s.length()==0 ||s.length()==1 )
			return s;
		else{
			int mid=s.length()/2;
			MinSort ms=new MinSort();
			// Divide and Conquer
			String sleft=divideSort(s.substring(0,mid));
			sleft=ms.sort(sleft);
			
			String sright=divideSort(s.substring(mid,s.length()));
				
			sright=ms.sort(sright);
			//combine merge the two 
			res=merge(sleft,sright);
						
			
			
		}
		
		return res;
	}
	
	public String merge(String sleft,String sright){
		
	/*	int n=sleft.length()+ sright.length();
		String[] merge=new String[n];
		int k=0;
		String ss="";
		//String mer=sleft+sright;
		
		
		if(sleft.charAt(0)< sright.charAt(0))
		     ss+=sleft.charAt(0)+"";
		else
			 ss+=sright.charAt(0)+"";
		
		  ss=merge(sleft.substring(1), sright.substring(1));
		
	*/	
		MinSort ms=new MinSort();
		sleft=ms.sort(sright);
		  String ss=sleft+sright;
		return sleft;
	}

}
