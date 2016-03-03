package lesson6assignment;


class Outer {
	int y = 20;

	public void display() {
		class Inner // Inner class defined inside method
		{
			private String Color="Blue";
			private String Discription="used";
			private int Quantity=5;
			private String Itemsold="Car";
			
			public void show() {
				System.out.println("The Color is "+Color);
				System.out.println("The Discription is "+Discription);
				System.out.println("The Quantity is"+Quantity);
				System.out.println("The Item sold is"+Itemsold);
			}
		}
		
		Inner in = new Inner();
		in.show();
	}
}
public class Exercise6_0localclass {
	public static void main(String[] args) {
		Outer ot = new Outer();
		ot.display();
}

	
}


