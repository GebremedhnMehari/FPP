/*package lesson6assignment2;

public class Exercise6_0StaticInnerClass {

}


public static class Exercise6_0StaticInnerclass {
	void display(){
		//analyze cannot access members of inner class without creating object of it.
		//Item inob=new Item();
		System.out.println("The Color is "+Item.Color);
		System.out.println("The Discription is "+Item.Discription);
		System.out.println("The Quantity is"+Item.Quantity);
		System.out.println("The Item sold is"+Item.Itemsold);
	}
	//this is inner class
	 static class Item {
		private static String Color="Blue";
		private static String Discription="New Brand";
		private static int Quantity=2;
		private static String Itemsold="Car";

	}
//}
//public static class Exercise6_0StaticInnerclass   {
public static void main(String args[])
{
	//int x[]={3,2,1,5,6,9,7,8};
	S outOb = new S();
	
	outOb.display();
}
}
*/