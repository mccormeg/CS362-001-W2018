package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
  	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
   /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing CalDayRandom...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				int thisDay = 15;
				int thisMonth = 5;
				int thisYear = 2018;
				//Make today
				GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
				//Make a Calendar day using today
				CalDay calday = new CalDay(today);
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1,24);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1,60);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1,32);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.RandInt(random);
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
				 startHour=ValuesGenerator.getRandomIntBetween(random, -1,24);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, -1,60);
				 startDay=ValuesGenerator.getRandomIntBetween(random, -1,32);;
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.RandInt(random);
				 appt.setStartHour(startHour);
				 appt.setStartMinute(startMinute);
				 appt.setStartDay(startDay);
				 appt.setStartMonth(startMonth);
				 appt.setStartYear(startYear);
				 calday.addAppt(appt);
				 startHour=ValuesGenerator.getRandomIntBetween(random, 0,11);
				 appt.setStartHour(startHour);
				 calday.addAppt(appt);
				 startHour=ValuesGenerator.getRandomIntBetween(random, 12,24);
				 appt.setStartHour(startHour);
				 calday.addAppt(appt);
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }



	
}
