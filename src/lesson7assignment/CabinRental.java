
/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment;

public class CabinRental {
	
	private int number;
	private double rate;
	
	public CabinRental(int number) {
		this.number = number;
		
		if(number==1||number==2||number==3)
		    rate = 950;
		else
			rate=1100;
	}
	
	public int getNumber() {
		return number;
	}
	public double getRate() {
		return rate;
	}

}
