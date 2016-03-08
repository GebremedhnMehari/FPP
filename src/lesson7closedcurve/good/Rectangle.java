
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day2
 */
package lesson7closedcurve.good;
public final class Rectangle extends ClosedCurve implements Polygon {
	private final double width,length;
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length= length;
		
	}
	public double computeArea() {
		return width * length;
	}
	
	//////
	public int getNumberOfSides(){
		return 4;
	}
	public double computePerimeter(){
		return 2*(width+length);
	}
}