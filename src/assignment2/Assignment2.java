package assignment2;
import java.util.Scanner; 
public class Assignment2 {
 
	public static void main (String[] args)
	{
	      //2.1  ????
		  /*
		  public static String toTitleCase(String givenString) {
    String[] arr = givenString.split(" ");
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < arr.length; i++) {
        sb.append(Character.toUpperCase(arr[i].charAt(0)))
            .append(arr[i].substring(1)).append(" ");
    }          
    return sb.toString().trim();
}  
		   * */
		   // 2.2 
		/*
		 
		  
		  
		 * */
		   // 2.3
		/*
		String str1 = "noon";
		System.out.println(isPalindrome(str1));
		String str2 = "afternoon";
		System.out.println(isPalindrome(str2));
	}
		
		public static boolean isPalindrome(String str){
		//String str = "noon";
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
				return false;
			}
		}
		return (true);
	    }*/
		    
		   // 2.4
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
		 /* Scanner inch= new Scanner(System.in); 
	       System.out.println("Enter The Inches:"); 
	       double Inches = inch.nextDouble(); 
	       double cm= Inches*2.54;
	       System.out.println("Values in Centimeter="+cm);*/
		
		//2.7
		/*for (int i=1;i<100;i++){
			if(i%6==0|| i%7==0){
				System.out.println(i); 
				
			}*/
	//2.8

/*int[] A= new int []{12,10,100,67,90};
// print the original array
System.out.println("printing original array");
for (int i=0;i<A.length;i++){
System.out.println(A[i]);
}
// print in reverse
System.out.println("printing reversed array");
for (int i = A.length - 1;i>=0;i--){
System.out.println(A[i]);
}*/
} 
	// 2.9
	/*
	 a)f
	 b)15
	 c)friendl
	   iendly face
	 */
	
   // 2.10
	
	// 2.11
	
	// 2.12
		
	}


