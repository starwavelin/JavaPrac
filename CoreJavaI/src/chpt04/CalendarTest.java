package chpt04;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.lang.System.out;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// construct d as the current date
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH); // Calendar's DAY_OF_MONTH counts from 1
		int month = d.get(Calendar.MONTH);	// Calendar's MONTH counts from 0 to 11
		
//		out.print("today is " + month + " " + today);
//		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK); // Calendar's DAY_OF_MONTH counts from 1,
																							// with Sunday as 1 in US.
		out.print("today is " + weekday + "th day of the week");
	}

}
