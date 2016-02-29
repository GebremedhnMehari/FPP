/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson3assignment.day2;

//fourth class Shape that will, in its main method, 
//test these three figure classes(Rectangle, Triangle and Circle classes
public class Shape {
	public static void main(String[] args) {
		Circle cir=new Circle(5);
		Rectangle rec=new Rectangle(4,6);
		Triangle tri=new Triangle(4, 6);
		
		System.out.println("Area of a Rectangle is "+rec.computeArea());
		System.out.println("Area of a Triangle is "+tri.computeArea());
		System.out.println("Area of a Circle is "+cir.computeArea());
	}

}
