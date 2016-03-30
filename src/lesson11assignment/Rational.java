package lesson11assignment;

public class Rational {
	
	int p;
	int q;
	
	Rational(int a,int b){
		if(b<0){
		  System.out.println("Invalid input");
		  System.exit(0);
		}
		else {
		  this.p=a;
		  this.q=b;
	   }
	}
	
	public Rational add(Rational rat){
	    
		  int numerator   = (this.p * rat.q) + (this.q * rat.p);
	        int denominator = this.q * rat.q;
	        return new Rational(numerator, denominator);
	}
	//multiplies rat by this Rational
	public Rational multiply(Rational rat){
		
		return new Rational(this.p * rat.p, this.q * rat.q);
	}
	//returns -1 if this rational is less than rat
	//returns 0 if this rational equals (see equals
	// method discussion below) rat
	//returns 1 if this rational is greater than rat
	public int compareTo(Rational rat){
		
		if (this.p*rat.q < this.q*rat.p) {
			return -1;
		} else if (this.p*rat.q == this.q*rat.p) {
			return 0;
		} else {
			return 1;
		}
	}

	private int getP() {
		return p;
	}

	private void setP(int p) {
		this.p = p;
	}

	private int getQ() {
		return q;
	}

	private void setB(int a) {
		this.q = a;
	}
	
	public String toString(){
		
		return p+"/"+q;
	}
	
	// The overridden equals method.
	@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (this == null)
				return false;
			if (this.getClass() != obj.getClass())
				return false;
			Rational rat = (Rational) obj;
			if(this.p*rat.q==this.q*rat.p)
					return true;
			
			
			return false;
		
		}
		
		@Override
		public int hashCode()
		{
			int hash = 5;
			// User defined formula 
			hash = 11 * hash + Integer.toString(p).hashCode() * Integer.toString(q).hashCode(); 
			return hash;
		}
		
		
		public static void main(String args[]) {
			 Rational a = new Rational(2, 3);
			    Rational b = new Rational(-17, 5);
			    Rational c = new Rational(1, 3);
			    
			    Rational d = new Rational(2, 3);
			    Rational e = new Rational(-17, 5);
			    Rational f = new Rational(1, 3);
			    //System.out.println(true == c.equals(a.add(b)));
			    
			    
			    if(a.multiply(b).add(c).compareTo( d.multiply(e.add(f)))>0)
			    	 System.out.println("("+a+"*"+b+")+"+c+" is greater than "+d+"*("+e+"+"+f+")");
			    else if(a.multiply(b).add(c).compareTo( d.multiply(e.add(f)))<0)
			    	 System.out.println("("+a+"*"+b+")+"+c+" is less than "+d+"*("+e+"+"+f+")");
			    else
			    	System.out.println("("+a+"*"+b+")+"+c+" is equal to "+d+"*("+e+"+"+f+")");	
		}

}
