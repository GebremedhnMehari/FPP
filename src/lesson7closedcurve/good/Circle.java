
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day2
 */
package lesson7closedcurve.good;

public final class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
