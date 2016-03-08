/**
 * @author Gebremedhn Mehari, ID: 985113
 *  Assignment6
 */
package lesson6assignment2;

//import lesson6assignment.Top.Middle.Bottom;

public class Top {
	int t = 1;
	int x;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance vble of Bottom
	int readBottom() {
		//implement
		Middle mi=new Middle();
		Bottom bt=mi.new Bottom();
		x=bt.b;
		return x;
	}
	class Middle {
		int m = 2;
		//returns sum of instance vble in Top and 
		//instance vble in Bottom
		int addTopAndBottom() {
			//implement
			Bottom bot=new Bottom();
			int sum=t+bot.b;
			return sum;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance vbles
			//in all three classes
			int multiplyAllThree() {
				//implement
				int product=t*m*b;
				return  product;
			}
		}
	}
	public static void main(String[] args){
		
		
		Top top=new Top();
		Middle mi=top.new Middle();
		Bottom bt=mi.new Bottom();
		
		System.out.println(top.readBottom());
		System.out.println(mi.addTopAndBottom());
		System.out.println(bt.multiplyAllThree());
		
	}

}