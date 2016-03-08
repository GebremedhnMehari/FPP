
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day2
 */
package lesson7closedcurve.good;
public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	
	////
	public int getNumberOfSides(){
		return 4;
	}
	public double computePerimeter(){
		return 4*side;
	}

}
