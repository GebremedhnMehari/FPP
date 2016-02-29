/**
 * @author Gebremedhn Mehari, ID: 985113
 */

package lesson3assignment.day2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;

public class DateAssignment {
	public static void main(String[] args) throws ParseException {
		
		
		GregorianCalendar worldTour = new GregorianCalendar(2000, Calendar.FEBRUARY, 29);
	      worldTour.add(GregorianCalendar.YEAR, 1);
	      Date d = worldTour.getTime();
	      DateFormat dformat = DateFormat.getDateInstance();
	      String s = dformat.format(d);
	      System.out.println("Add one year to LocalDate.of(2000, 2, 29) " + s);
	        worldTour.set(2000, Calendar.FEBRUARY, 29);
	        worldTour.add(GregorianCalendar.YEAR, 4);
	        d=worldTour.getTime();
	        s = dformat.format(d);
	      System.out.println("Add Four years to LocalDate.of(2000, 2, 29) " + s);
	    Scanner in = new Scanner(System.in);
		System.out.print("Birth Date: ");
		String dateString = in.nextLine();
		
		Date date = null;
	    SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
	    try{
	        date = df.parse(dateString);        
	    }
	    catch ( Exception ex ){
	        System.out.println(ex);
	    }
		
	    Date d2 = new Date();
		
	   
	   int x= (int)( (d2.getTime() - date.getTime()) / (1000 * 60 * 60 * 24));
	    
		
	      System.out.println("You have been alive " + x+ " Days");
	}

}
