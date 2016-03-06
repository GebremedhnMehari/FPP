package lesson6assignment;
//public class Static_Class{
	public class Exercise6_0InnerStaticClass{
		
		public void display(){
    	    System.out.println("The Color is: "+inner.Color);
			System.out.println("The Discription is: "+inner.Discription);
			System.out.println("The Quantity is: "+inner.Quantity);
			System.out.println("The Item sold is: "+inner.Itemsold);;
      }
		
	   static class inner{
		    private static String Color="Green";
			private static String Discription="2015 Model";
			private static int Quantity=7;
			private static String Itemsold="Cell phone";
	      }
	      
	   //}
	  
	   //public class Exercise6_0InnerStaticClass{
	   public static void main(String args[]){
		   Exercise6_0InnerStaticClass nested=new Exercise6_0InnerStaticClass();	 
	      nested.display();
	      
	   } 
	}
	

/*public class Exercise6_0InnerStaticClass{

static class inner{
	    private static String Color="Green";
		private static String Discription="2015 Model";
		private static int Quantity=7;
		private static String Itemsold="Cell phone";
   public void display(){
 	    System.out.println("The Color is: "+Color);
			System.out.println("The Discription is: "+Discription);
			System.out.println("The Quantity is: "+Quantity);
			System.out.println("The Item sold is: "+Itemsold);;
   }
}

public static void main(String args[]){
	  Exercise6_0InnerStaticClass.inner nested=new Exercise6_0InnerStaticClass.inner();	 
   nested.display();
}

}*/
