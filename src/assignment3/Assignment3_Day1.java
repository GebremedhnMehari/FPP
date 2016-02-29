
/**
 * @author Gebremedhn Mehari, ID: 985113
 * This Assignment3_Day1 class consists of all methods for Question 3.1 to Question 3.4
 * Assignment3_Day1
 */
package assignment3;
import java.util.Scanner; 
public class Assignment3_Day1  {
	
	public static void main(String args[]){
		
		// 3.1 findRoot of main method test
		
		Assignment3_Day1 obj1=new Assignment3_Day1();
  	    Scanner input= new Scanner(System.in); 
  	    System.out.println("Enter The coefficients for the Quadratic equation:"); 
  	    System.out.print("a:"); 
  	    double a = input.nextDouble();
  	    System.out.print("b:"); 
  	    double b =input.nextDouble(); 
  	    System.out.print("c:"); 
	    double c =input.nextDouble();
	    obj1.findRoot(a,b,c);
		
		// 3.2  raiseIntTopower of main method test
		
	/*	Assignment3_Day1 obj2=new Assignment3_Day1();
		Scanner input= new Scanner(System.in); 
	    System.out.println("Enter The value of n:"); 
	    int n =input.nextInt(); 
	    System.out.println("Enter The value of k:"); 
	    int k =input.nextInt(); 
		int power=obj2.raiseIntToPower(n,k);
		System.out.println(power);*/
		
		// 3.3 isPerfect of main method test
	/*	Assignment3_Day1 obj3=new Assignment3_Day1();
		Scanner input= new Scanner(System.in); 
	    System.out.println("Enter a number to check weather it is perfect number:"); 
	    int n =input.nextInt();
		boolean result=obj3.isPerfect(n);
		System.out.println("isPerfect:"+result);
		*/
		
		
	}
	
	////////////////////////////////////////////////////////////////////////
	// 3.1 findRoot
   	 private void findRoot(double a, double b, double c){
		 
		 double root1,root2;
		 double d=b*b-4*a*c;
		 double squareroot= Math.sqrt(d);
		
		 root1= -(b+squareroot)/(2*a);
		 root2= -(b-squareroot)/(2*a);
			
		 if(d>=0){
			 System.out.println("The first solution is="+root1);
		     System.out.println("The Second solution is="+root2);
		 }
			
		 else if(d==0){
			 System.out.println("The first solution is="+root1);
		 }
		 else
			 System.out.println("Has no real solution");
		
	   }
	
	/////////////////////////////////////////////////////////////////////////////
	// 3.2 raiseIntTopower
	
	private int raiseIntToPower (int n,int k){
		
		int multiple=1;
		for (int i=1;i<10;i++){
			multiple= multiple*2;
			System.out.println("2 raised "+i+"   :"+multiple);
		}
		int product=1;
		for (int i=0;i<k;i++){
			product= product*n;
		}
		return product;	
	}
	 
	///////////////////////////////////////////////////////////////////////
	// 3.3 isPerfect
	
	private boolean isPerfect(int n){
	    int sum=0;
		for (int j=1;j<n;j++){
			   if(n%j==0){
				sum+=j;
			}
		}
		if(sum==n)
			 return true;
		else 
			 return false;
	}
	///////////////////////////////////////////////////////////////////
	
}
