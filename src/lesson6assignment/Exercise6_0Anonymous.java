package lesson6assignment;

abstract class AnonymousInner{
	  
	   public abstract void mymethod();
	}

	public class Exercise6_0Anonymous  {
	   public static void main(String args[]){
	   AnonymousInner inner= new AnonymousInner(){
	      public void mymethod(){
	        String Color="Blue";
	   	       String Discription="used";
	   	       int Quantity=5;
	   	      String Itemsold="Car";
	         //System.out.println("This is an example of anonymous inner class"); 
	         System.out.println("The Color is "+Color);
			 System.out.println("The Discription is "+Discription);
			 System.out.println("The Quantity is"+Quantity);
			 System.out.println("The Item sold is"+Itemsold);
	      }	    
	   };
	   inner.mymethod();	
	 }
	}