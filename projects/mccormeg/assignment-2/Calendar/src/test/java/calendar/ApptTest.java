package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
		Appt appt2 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());  
		 assertTrue(appt2.getValid());
		 assertEquals(21, appt2.getStartHour());
		 assertEquals(30, appt2.getStartMinute());
		 assertEquals(15, appt2.getStartDay());
		 assertEquals(01, appt2.getStartMonth());
		 assertEquals(2018, appt2.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription()); 

		assertEquals(0,appt.compareTo(appt2));
		appt.toString();
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=16;
		 int startMinute=80;
		 int startDay=23;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(16, appt.getStartHour());
		 assertEquals(80, appt.getStartMinute());
		 assertEquals(23, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription());  
		 assertEquals( null, appt.toString());
		 
		 
	 }
//add more unit tests as you needed
	@Test
	  public void test03()  throws Throwable  {
		 int startHour=26;
		 int startMinute=30;
		 int startDay=23;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(26, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(23, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription());  
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 int startHour=-2;
		 int startMinute=30;
		 int startDay=23;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(-2, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(23, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription());  
		 appt.toString();
	 }
	 @Test
	  public void test05()  throws Throwable  {
		 int startHour=11;
		 int startMinute=30;
		 int startDay=44;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(11, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(44, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription()); 
			appt.toString();		 
	 }
	 @Test
	  public void test06()  throws Throwable  {
		 int startHour=12;
		 int startMinute=30;
		 int startDay=-2;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertFalse(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(-2, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription());  
	 }
	  @Test
	  public void test07()  throws Throwable  {
		 int startHour=12;
		 int startMinute=30;
		 int startDay=6;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(6, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription());  
		 
		 		 //ChangeEvent
		 appt.setStartHour(2);
		 appt.setStartMinute(2);
		 appt.setStartDay(2);
		 appt.setStartMonth(2);
		 appt.setStartYear(1996);
		 appt.setTitle("This is new title");
		 appt.setDescription("This is new description");

		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(2, appt.getStartHour());
		 assertEquals(2, appt.getStartMinute());
		 assertEquals(2, appt.getStartDay());
		 assertEquals(2, appt.getStartMonth());
		 assertEquals(1996, appt.getStartYear());
		 assertEquals("This is new title", appt.getTitle());
		 assertEquals("This is new description", appt.getDescription()); 
	 }
	  @Test
	  public void test08()  throws Throwable  {
		 int startHour=12;
		 int startMinute=30;
		 int startDay=6;
		 int startMonth=02;
		 int startYear=2018;
		 String title="Birthday";
		 String description="birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(6, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday", appt.getTitle());
		 assertEquals("birthday party.", appt.getDescription());  
		 
		 		 //ChangeEvent
		 appt.setStartHour(2);
		 appt.setStartMinute(2);
		 appt.setStartDay(2);
		 appt.setStartMonth(2);
		 appt.setStartYear(1996);
		 appt.setTitle(null);
		 appt.setDescription(null);

		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(2, appt.getStartHour());
		 assertEquals(2, appt.getStartMinute());
		 assertEquals(2, appt.getStartDay());
		 assertEquals(2, appt.getStartMonth());
		 assertEquals(1996, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription()); 
	 }
	 @Test
	  public void test09()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 
		appt.setRecurrence(null, 2, 2, 2);
		assertEquals(2, appt.getRecurNumber());
		assertEquals(2, appt.getRecurBy());
		assertEquals(true, appt.isRecurring());
		assertEquals(2, appt.getRecurIncrement());
	 }
	  @Test
	  public void test10()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 
		appt.setRecurrence(null, 0, 0, 0);
		assertEquals(0, appt.getRecurNumber());
		assertEquals(0, appt.getRecurBy());
		assertEquals(false, appt.isRecurring());
		assertEquals(0, appt.getRecurIncrement());
	  }

	
}
