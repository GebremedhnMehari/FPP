/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment7 Day1
 */
package lesson7assignment;

public class DemoCabinRental {
	public static void main(String[] args) {
		CabinRental cr= new CabinRental(4);
		System.out.println("Cabin Number: " + cr.getNumber() + "\n Weekly Rate: "+cr.getRate());
		
		HolidayCabinRental hd= new HolidayCabinRental(4);
		hd.setSurcahrge(150);
		
		System.out.println("Cabin Number: " + hd.getNumber() + "\n Summar holidays Week ends Rate: "+hd.getRate());
		}
				
	}

