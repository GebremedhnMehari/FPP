package lesson7closedcurve.good;
public class Test2 {
	
	public static void main(String[] args) {
String s1;
            Polygon[] objects = {new Square(3),
            		             new Triangle(4,5,6),
								 new Rectangle(3,4)};
		//compute areas
		for(Polygon cc : objects) {
			String nameOfPolygon =
					cc.getClass().getSimpleName();
			
			//////////
			System.out.println("For this "+
					nameOfPolygon);
			System.out.println("Number of sides= "+cc.getNumberOfSides());
			System.out.println("perimeter= "+cc.computePerimeter());
			//System.out.println("The area of this "+" is "+cc.computeArea());
			
			
		}
    
	}

}