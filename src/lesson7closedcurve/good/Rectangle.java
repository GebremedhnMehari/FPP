package lesson7closedcurve.good;

///
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