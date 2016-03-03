package lesson7closedcurve.good;
import java.lang.reflect.*;
public class Test {
	
	public static void main(String[] args) {
String s1;
		ClosedCurve[] objects = {new Triangle(4,3,5),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3),};
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve =
					cc.getClass().getSimpleName();
			System.out.println("The area of this "+
					nameOfCurve+" is "+cc.computeArea());
			//System.out.println("The area of this "+" is "+cc.computeArea());
			
			
		}
    
	}

}