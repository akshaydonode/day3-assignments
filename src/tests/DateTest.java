package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import mains.Date;
import org.junit.After;
import org.junit.Before;

public class DateTest
{
	
	
	
	@Test
	public void testDateWhetherValid()
	{
		 Date date = new Date(30,1,1997);
		assertEquals("valid",date.checkValid());
		
			
	}
	
	@Test
	public void testDisplayString()
	{
		 Date dateForString = new Date(30,1,1997);
		assertEquals("30/1/1997",dateForString.toString());
		
	}

	@Test
	public void testWhetherDateIsSmallerOrNot()
	{
		Date date1 = new Date(28,5,1998);
		Date date2 = new Date(30,6,2017); 
		assertEquals(true,date1.isSmaller(date2));
		assertEquals(false,date2.isSmaller(date1));
	}
	
	@Test
	public void testDifferenceBetweenDates()
	{
		Date date1 = new Date(23,12,1998);
		Date date2 = new Date(01,01,2000); 
		long expected[]={374,12,1};
		long actual[]=date1.getDiff(date2);
		assertEquals(expected[0],actual[0]);
		//assertEquals(expected[1],actual[1]);
		//assertEquals(expected[2],actual[2]);
	}
	
}
