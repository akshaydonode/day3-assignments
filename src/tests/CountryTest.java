package tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import mains.Country;

public class CountryTest
{
	Country countries[];
	@Before
	public void setUp()
	{
		countries = new Country[3];
		Country country = new Country();
	
		countries[0] = new Country("US",10250,55652);
		countries[1] = new Country("INDIA",11256,5965559);
		countries[2] = new Country("CHINA",11302,5565291); 
	}
	@Test
	public void testLargestArea()
	{
		String expectedName=countries[2].getCountryName();
		Country country = new Country();
		String actual = country.getLargestArea(countries);
		assertEquals(expectedName,actual);
	}
	
	@Test
	public void testLargestPopulation()
	{
		String expectedName=countries[1].getCountryName();
		Country country1 = new Country();
		String actual=country1.getLargestPopulation(countries);
		assertEquals(expectedName,actual);
	}

	@Test
	public void testLargestPopulationDensity()
	{
		String expectedName=countries[1].getCountryName();
		Country country2 = new Country();
		String actual=country2.getLargestDensity(countries);
		assertEquals(expectedName,actual);
	}	
}