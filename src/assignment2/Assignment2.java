package assignment2;
import java.util.Scanner; 
public class Assignment2 {
 
	public static void main (String[] args)
	{
	      //2.1  ?????
		/*Assignment2 obj1=new Assignment2();
		String str="go@y";
		System.out.println(obj1.capitalize(str));*/
		
		// 2.2
	/*	Assignment2 obj2=new Assignment2();
		System.out.println(obj2.scrable("FARM"));*/
		// 2.3
		/*Assignment2 obj3=new Assignment2();
		String str1 = "noon";
		System.out.println(obj3.isPalindrome(str1));
		String str2= "afternoon";
		System.out.println(obj3.isPalindrome(str2));*/
		// 2.4
		/*Assignment2 obj4=new Assignment2();
		//cahr c='k';
		boolean c=obj4.isEnglishconsonant('u');
		System.out.println("isEnglishconsonant is "+ c);*/
		// 2.5 
		
		// 2.6
		/*Assignment2 obj6=new Assignment2();
		Scanner inch= new Scanner(System.in); 
	    System.out.println("Enter The Inches:"); 
	    double Inches = inch.nextDouble(); 
	    System.out.print(" In centimeter:");
	    System.out.println(obj6.inchtocm(Inches));*/
		
		// 2.7
		// 2,8
		/*Assignment2 obj8=new Assignment2();
		int[] Array={10,20,30,40,50};
		int[] res=obj8.reverseArray(Array);
		
		System.out.println("reverseArray is: ");
		for (int i=0;i<res.length;i++){
       	 System.out.print(res[i]+" ");
        }*/
		
		// 2.9
		//
		// 2.11
	/*	Assignment2 obj11=new Assignment2();
		String[] Str={"horse","dog","cat","horse","dog"};
		String[] result=obj11.removeDuplicates(Str);
		System.out.println("reverseArray is: ");
		for (int i=0;i<result.length;i++){
       	 System.out.print(result[i]+" ");
	}*/
		
	   // 2.12
		/*Assignment2 obj12=new Assignment2();
		obj12.factors();*/
		
		
		
	}
	
	
	// 2.1
/*		
	public char toLower(char ch){
		if (ch>='A' && ch<='Z')
		{
			return (char) ((ch -'A')+'a');
			
		}
		return ch;
		}
	public char toCapital(char ch){
		if (ch>='a' && ch<='z')
		{
			return (char) ((ch -'a')+'A');
			
		}
		return ch;
		}
	
	public String capitalize(String str){
		String S="";
		for(int i=0;i<str.length();i++){
			if(i==0){
		
				S=S+toCapital(str.charAt(i));
			}
			else
				if (str.charAt(i)>='A' && str.charAt(i)<='Z')
				S=S+toLower(str.charAt(i));
				else
			    S=S+str.charAt(i);
				
	    }
		
		 return S;
	}
		*/

		
		
		   
		   // 2.2 
		
	/*	 public int scrable(String str){
			 int totalpoint=0;
			 for(int i=0;i<str.length();i++){
			 if ( str.charAt(i)>='A' && str.charAt(i)<='Z')
				{
					switch(str.charAt(i))
					{
					case'A':case'E': case'I':case'L':case'N':case'O':case'R':case'S':case'T':case'U':
						totalpoint=totalpoint+1;
					    break;
					case'D':case'G':
						totalpoint=totalpoint+2;
						break;
					case'B':case'C':case'M':case'P':
						totalpoint=totalpoint+3;
						break;
					case'F':case'H':case'V':case'W':case'Y':
						totalpoint=totalpoint+4;
						   break;
					case'K':
						totalpoint=totalpoint+5;
						   break;
					case'J':case'X':
						totalpoint=totalpoint+8;
						   break;
					case'Q':case'Z':
						totalpoint=totalpoint+10;
						default:
							totalpoint=totalpoint+0;
					}
					}
				}
			 
			 return totalpoint;
		 }
		  */
		  
		 // 2.3
		
		/*
		public static boolean isPalindrome(String str){
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
				return false;
			}
		}
		return (true);
	    }
		   */ 
		   // 2.4
	
	/*    public boolean isEnglishconsonant(char ch){
	    	
	    	if ( ch>='A' && ch<='Z'|| ch>='a' && ch<='z'){
	    	       if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	    	          return false;
	    	       }
	    	       else {
	    		    if ( ch>='A' && ch<='Z')
	    			   System.out.println(ch);	
	    			   return true;  
	    	       }
	    	}
	    	else
	    		return false;
	    }*/
		   // 2.5
		
		
	       // 2.6
	        /*  Scanner input= new Scanner(System.in); 
	       System.out.println("Enter The First number:");
	       double Firstnumber = input.nextDouble(); 
	       System.out.println("Enter The Second number:"); 
	       double Secondnumber = input.nextDouble(); 
	       double average= (Firstnumber+Secondnumber);
	       System.out.println("Average="+average);*/
		
		//2.5
	 /*   public double inchtocm(double inch){
		  
	     double cm;
	     cm= inch*2.54;
	     return cm;
	    }*/
		
		//2.7
		/*for (int i=1;i<100;i++){
			if(i%6==0|| i%7==0){
				System.out.println(i); 
				
			}*/
	//2.8

   /*   private int[] reverseArray(int[] array)
      {
         for(int i=0;i<= array.length/2; i++){
        	 
        	    int temp=array[i];
        	     array[i]=array[array.length-(i+1)];
        	     array[array.length-(i+1)]=temp;
        	
         }
         return array;
    	  
      }*/

	// 2.9
	/*
	 a)f
	 b)15
	 c)friendl
	   iendly face
	 */
	
   // 2.10
	   //?????
	
	// 2.11
/*	private String[] removeDuplicates(String[] str) {
		int k = 0;
		String[] norepeat = new String[str.length];
		for (int i = 0; i <str.length; i++) {
			int c = 0;
			for (int j = 0;j <norepeat.length; j++) {
				if (str[i] == norepeat[j]) {
					c=1;
				}
				}
				if (c==0) {
					norepeat[k] = str[i];
					k++;
				}
			}

		
		return norepeat;
	}*/
	
	// 2.12
/*	private void factors(){
		for (int i=2; i<100; i++){
			System.out.println("Factors of "+i+":");
		for (int j=2;j<i;j++){
			   if(i%j==0){
				System.out.print(" "+j);
			}
		}
		System.out.println();   
	}
		
}*/
}



