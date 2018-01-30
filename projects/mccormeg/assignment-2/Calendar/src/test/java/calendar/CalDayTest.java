package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			int thisDay = 15;
			int thisMonth = 5;
			int thisYear = 2018;
			//Make today
			GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
			//Make a Calendar day using today
			CalDay calday = new CalDay(today);
			
			//Assertions
			assertTrue(calday.isValid());
			assertEquals(15,calday.getDay());
			assertEquals(5,calday.getMonth());
			assertEquals(2018,calday.getYear());
			
			
	 }
	 @Test
	  public void test02()  throws Throwable  {
		  int thisDay = 15;
			int thisMonth = 5;
			int thisYear = 2018;
			//Make today
			GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
			//Make a Calendar day using today
			CalDay calday = new CalDay(today);
			
			//Assertions
			assertTrue(calday.isValid());
			assertEquals(15,calday.getDay());
			assertEquals(5,calday.getMonth());
			assertEquals(2018,calday.getYear());
				
		 
	 }
	 @Test
	  public void test03()  throws Throwable  {
			CalDay calday = new CalDay();
			assertFalse(calday.isValid());
			calday.toString();
			assertEquals(null,calday.iterator());
	 }
	 @Test
	  public void test04()  throws Throwable  {
		  int thisDay = 15;
			int thisMonth = 5;
			int thisYear = 2018;
			//Make today
			GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
			//Make a Calendar day using today
			CalDay calday = new CalDay(today);
			
			//Assertions
			assertTrue(calday.isValid());
			assertEquals(15,calday.getDay());
			assertEquals(5,calday.getMonth());
			assertEquals(2018,calday.getYear());
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday.addAppt(appt);
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear ,
		          title,
		         description);
		calday.addAppt(appt2);
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay-80 ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday.addAppt(appt3);
		 Appt appt4 = new Appt(startHour-1,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		calday.addAppt(appt4);
		calday.addAppt(null);
		calday.iterator();
		calday.toString();
		
				
		 
	 }
//add more unit tests as you needed	
}
