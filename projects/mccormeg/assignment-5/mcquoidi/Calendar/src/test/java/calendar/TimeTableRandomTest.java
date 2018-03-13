package calendar;


import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
  
	private static final long TestTimeout = 60 * 500 * 2; /* Timeout at 30 seconds */
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
     * Generate Random Tests that tests TimeTable Class.
     */
	  @Test
	  public void test01()  throws Throwable  {

		/** Collection of all of the appointments for the calendar day */		
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		
     	/** the month the user is currently viewing **/
     	int thisMonth;
    	
    	/** the year the user is currently viewing **/
    	 int thisYear;
    	
    	/** todays date **/
    	int thisDay;
    	
		//get todays date
    	Calendar rightnow = Calendar.getInstance();
    	//current month/year/date is today
    	thisMonth = rightnow.get(Calendar.MONTH)+1;
		thisYear = rightnow.get(Calendar.YEAR);
		thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		
		 int startHour=15;
		 int startMinute=30;
		 int startDay=thisDay+1;  	
		 int startMonth=thisMonth; 	
		 int startYear=thisYear; 	
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
         listAppts.add(appt);
          
      // create another appointment
         startHour=14;
		 startMinute=30;
		 startDay=thisDay;  	
		 startMonth=thisMonth; 	
		 startYear=thisYear; 	
		 title="Class";
		 description="Rescheduled class.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
        
         listAppts.add(appt);
         // create another appointment
         startHour=13;
		 startMinute=30;
		 startDay=thisDay;		
		 startMonth=thisMonth;	
		 startYear=thisYear;	
		 title="Meeting Today";
		 description="Meeting with the students.";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         
         listAppts.add(appt);
         // create another appointment
         startHour=16;
		 startMinute=30;
		 startDay=thisDay+1;		
		 startMonth=thisMonth+1;	
		 startYear=thisYear;	
		 title="Visit";
		 description="Visiting my parents!";
		 //Construct a new Appointment object with the initial data	 
         appt = new Appt(startHour,
                  startMinute ,
                  startDay ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
         int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);

         listAppts.add(appt);
         
		//get a list of appointments for one day, which is today
		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,1);
		String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
		String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);


		TimeTable timeTable=new TimeTable();
        //Create a linked list of calendar days to return
        LinkedList<CalDay> calDays = new LinkedList<CalDay>();


		LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(2));
	  }
	  @Test
	  public void test02()  throws Throwable  {
	   LinkedList<Appt> listAppt = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listAppt.add(appt);
		Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear ,
		          title,
		         description);
		listAppt.add(appt2);
		 GregorianCalendar today = new GregorianCalendar(2015,1,29);
		  GregorianCalendar tomorrow = new GregorianCalendar(2018,2,23);
		  TimeTable timetable = new TimeTable();
		  LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		  calDays = new LinkedList<CalDay>();
		  calDays = timetable.getApptRange(listAppt, today, tomorrow);
		  timetable.deleteAppt(listAppt,appt);
		  int []pv={1,1};
		  timetable.permute(listAppt,pv);
	 }
	@Test
	  public void test03()  throws Throwable  {
		  LinkedList<Appt> listAppt = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listAppt.add(appt);
		Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear ,
		          title,
		         description);
		listAppt.add(appt2);
		appt = new Appt(startHour,
                  startMinute +15 ,
                  startDay ,
                  startMonth,
                  startYear-1 ,
                  title,
                 description);
				 int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		 listAppt.add(appt);
		 appt = new Appt(startHour,
                  startMinute +2 ,
                  startDay-4 ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
		 listAppt.add(appt);
		  GregorianCalendar today = new GregorianCalendar(2015,1,29);
		  GregorianCalendar tomorrow = new GregorianCalendar(2018,2,23);
		  TimeTable timetable = new TimeTable();
		  LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		  calDays = new LinkedList<CalDay>();
		  calDays = timetable.getApptRange(listAppt, today, tomorrow);
		  timetable.deleteAppt(listAppt,appt);
		  //int []pv={1,1,1};
		  //timetable.permute(listAppt,pv);
	 }
	  @Test
	  public void test04()  throws Throwable  {
		  LinkedList<Appt> listAppt = new LinkedList<Appt>();
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		listAppt.add(appt);
		Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay+1 ,
		          startMonth+1 ,
		          startYear ,
		          title,
		         description);
		listAppt.add(appt2);
		appt = new Appt(startHour,
                  startMinute +15 ,
                  startDay ,
                  startMonth,
                  startYear-1 ,
                  title,
                 description);
				 int[] recurDaysArr={2,3,4};
         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		 listAppt.add(appt);
		 appt = new Appt(startHour,
                  startMinute +2 ,
                  startDay-4 ,
                  startMonth ,
                  startYear ,
                  title,
                 description);
		 listAppt.add(appt);
		  GregorianCalendar today = new GregorianCalendar(2015,1,29);
		  GregorianCalendar tomorrow = new GregorianCalendar(2018,2,23);
		  TimeTable timetable = new TimeTable();
		  LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		  calDays = new LinkedList<CalDay>();
		  calDays = timetable.getApptRange(listAppt, today, tomorrow);
		  timetable.deleteAppt(listAppt,appt);
		  int []pv={1,1,1,1};
		  timetable.permute(listAppt,pv);
	  }
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing TimeTableRandom...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {

				LinkedList<Appt> listAppt = new LinkedList<Appt>();

				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1,24);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1,60);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1,32);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 2015, 2018);
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
				 listAppt.add(appt);
				 
				 startHour=ValuesGenerator.getRandomIntBetween(random, -1,24);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, -1,60);
				 startDay=ValuesGenerator.getRandomIntBetween(random, -1,32);;
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 startYear=ValuesGenerator.getRandomIntBetween(random, 2015, 2018);
				 appt.setStartHour(startHour);
				 appt.setStartMinute(startMinute);
				 appt.setStartDay(startDay);
				 appt.setStartMonth(startMonth);
				 appt.setStartYear(startYear);
				 listAppt.add(appt);
				 
				 startHour=ValuesGenerator.getRandomIntBetween(random, 0,11);
				 appt.setStartHour(startHour);
				 listAppt.add(appt);
				 
				 startHour=ValuesGenerator.getRandomIntBetween(random, 12,24);
				 appt.setStartHour(startHour);
				 listAppt.add(appt);
				 
				  Appt appt2 = new Appt(3,
				          35 ,
				          12 ,
				          2 ,
				          1995 ,
				          "this day",
				         "this is the day");
				 
				 GregorianCalendar to_day = new GregorianCalendar(2015,ValuesGenerator.getRandomIntBetween(random, -1,12),ValuesGenerator.getRandomIntBetween(random, -1,31));
				 GregorianCalendar tomorrow = new GregorianCalendar(2018,ValuesGenerator.getRandomIntBetween(random, 1,12),ValuesGenerator.getRandomIntBetween(random, -1,31));
				 TimeTable timetable = new TimeTable();
				 LinkedList<CalDay> calDays = new LinkedList<CalDay>();
				 calDays = new LinkedList<CalDay>();
				 calDays = timetable.getApptRange(listAppt, to_day, tomorrow);
				 
				 int ran = ValuesGenerator.getRandomIntBetween(random, 0,12);
				 if(ran> 5){
					 timetable.deleteAppt(listAppt,null);
				 }
				 else if(ran == 0){
					 timetable.deleteAppt(listAppt,appt2);
				 }
				 else if(ran == 2){
					 timetable.deleteAppt(null,appt2);
				 }
				 else{
					 timetable.deleteAppt(listAppt,appt);
				 }
	
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
			
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }

	
}
