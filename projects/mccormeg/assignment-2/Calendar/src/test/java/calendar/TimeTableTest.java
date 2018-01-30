package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
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
		  GregorianCalendar today = new GregorianCalendar(2018,1,29);
		  GregorianCalendar tomorrow =new GregorianCalendar(2015,1,23);
		  TimeTable timetable = new TimeTable();
		  LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		  calDays = new LinkedList<CalDay>();
		  calDays = timetable.getApptRange(listAppt, today, tomorrow);
		  timetable.deleteAppt(listAppt,appt);
		  int []pv={1,3,5};
		  timetable.permute(listAppt,pv);
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
		  int []pv={1,3,5};
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
		  int []pv={1,3,4,2};
		  timetable.permute(listAppt,pv);
	  }
//add more unit tests as you needed
}
