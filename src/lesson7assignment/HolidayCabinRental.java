package lesson7assignment;

public class HolidayCabinRental extends CabinRental {
	public HolidayCabinRental(int number) {
		super(number);
		surcharge =0;
	}
	@Override
	public double getRate() {
		double hdrate=super.getRate()+ surcharge;
		return hdrate;
	}
	public void setSurcahrge(int sc) {
		surcharge = sc;
	}
   private int surcharge;
}
