package programmingAss4;

public class Exponential {
	
	private double power(double x, int n){
		if(n==0){
		return 1;
	    }
		else
	    return x*power(x,n-1);
	}
		public static void main(String args[]) {
			Exponential input= new Exponential ();
			double result=input.power(2, 10);
		    System.out.println("2 raised 10 is= "+result);
	}
}
    

