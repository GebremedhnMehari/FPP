/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson3assignment.day2;

public class Triangle {
	private double base;
	private double height;
	private double area;
	
	public Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	private double getBase() {
		return base;
	}
	private void setBase(double base) {
		this.base = base;
	}
	private double getHeight() {
		return height;
	}
	private void setHeight(double height) {
		this.height = height;
	}
	
	
	public double computeArea(){
		area=0.5*base*height;
		return area;
	}

}
