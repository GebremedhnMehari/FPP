/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson3assignment.day2;

public class Circle {
	
	private double radius;
	private double area;
	private final double PI=3.14;
	
	public Circle(double radius){
		this.radius=radius;
	}
	private double getRadius() {
		return radius;
	}
	private void setRadius(double radius) {
		this.radius = radius;
	}
	private double getArea() {
		return area;
	}
	
	
	public double computeArea(){
		area=PI*radius*radius;
		return area;
	}
}
