package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;
public class TimeTableTest {

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
		  
//add more unit tests as you needed*/

}
