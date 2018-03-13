package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
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

	  @Test
	  public void test11()  throws Throwable  {
		 int startHour=22;
		 int startMinute=30;
		 int startDay=30;
		 int startMonth=2;
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
		 assertEquals(22, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(30, appt.getStartDay());
		 assertEquals(2, appt.getStartMonth());
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
			int []rec = {1,3,5};
		 appt.setRecurrence(rec, 3, 3, 1000);
		 assertEquals(1000, appt.getRecurNumber());
		 assertEquals(3, appt.getRecurBy());
		 assertEquals(true, appt.isRecurring());
		 assertEquals(3, appt.getRecurIncrement());
		 int []copy = appt.getRecurDays();
		 assertEquals(1,copy[0]);
		 assertEquals(3,copy[1]);
		 assertEquals(5,copy[2]);
	 }
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing ApptRandomTest...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
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
			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int ran = ValuesGenerator.getRandomIntBetween(random,-100,100);
						   int [] recurDays = null;	
					       int[] recurDays2=ValuesGenerator.generateRandomArray(random, sizeArray);						   
						  if(ran<0){
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);  	  
						   }  
						   else{
						   int recur=ApptRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays2, recur, recurIncrement, recurNumber);  
						   }
						  
						}				
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
