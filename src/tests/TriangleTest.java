package tests;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import mains.Triangle;

public class TriangleTest
{
	@Test
	public void testRightAngledOrNot()
	{
		Triangle triangle=new Triangle(3,4,5);
		assertTrue(triangle.getRightAngled());
	}
	@Test
	public void testScalene()
	{
		Triangle triangle=new Triangle(3,4,5);
		assertTrue(triangle.getScalene());
	}
	@Test
	public void testIsosceles()
	{
		Triangle triangle=new Triangle(3,4,4);
		assertTrue(triangle.getIsosceles());
	}
	@Test
	public void testEquilateral()
	{
		Triangle triangle=new Triangle(4,4,4);
		assertTrue(triangle.getEquilateral());
	}
}