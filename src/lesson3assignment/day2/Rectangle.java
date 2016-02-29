/**
 * @author Gebremedhn Mehari, ID: 985113
 */
package lesson3assignment.day2;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	
	public Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	
	private double getLength() {
		return length;
	}
	private void setLength(double length) {
		this.length = length;
	}
	private double getWidth() {
		return width;
	}
	private void setWidth(double width) {
		this.width = width;
	}
	
	public double computeArea(){
		area=length*width;
		return area;
	}

}
