//Use an Non-static inner class
package lesson6assignment;

class Invoice{
	void display(){
		//analyze cannot access members of inner class without creating object of it.
		Item inob=new Item();
		System.out.println("The Color is "+inob.Color);
		System.out.println("The Discription is "+inob.Discription);
		System.out.println("The Quantity is"+inob.Quantity);
		System.out.println("The Item sold is"+inob.Itemsold);
	}
	//this is inner class
	class Item {
		private String Color="Red";
		private String Discription="New Brand";
		private int Quantity=2;
		private String Itemsold="Car";

	}
}
public class Exercise6_0_Innerclass  {
public static void main(String args[])
{
	Invoice outOb = new Invoice();
	
	outOb.display();
}
}
