package mains;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Date
{
	private int date;
	private int month;
	private int year;
	
	public Date()
	{
	}

	public Date(int date,int month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;			
	}

	public String checkValid()
	{
		if(checkYear().equals("true"))
		{
			if(month <= 12)
			{
				if(month == 2 && date > 29)
				{
					return  "invalid";
				}
			 	if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12) && month > 31)
				{
					return "invalid";
				}
				if((month == 4 || month == 6 ||month == 9 || month == 11) && month > 30)
				{
					return "invalid";
				}
			}
			else{
				return "invalid";
			}	
		}
		else if(month <= 12)
		{
			if(month == 2 && date > 28)
			{
					return  "invalid";
			}
				
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12) && month > 31)
			{
				return "invalid";
			}
			if((month == 4 || month == 6 || month == 9 || month == 11) && month > 30)
			{
				return "invalid";
			}
		
		}
		
	return "valid";
	}

	public String checkYear()
	{
		if(year % 4 == 0)
		{
			if(year % 100 == 0 && year % 400 == 0)
			{
				return "true";
			}
		return "true";

		}
		else{
			return "false";
		}
	
	}

	public String toString()
	{
		String str;
		String str1="/";

		str=Integer.toString(this.date)+str1;
		str=str+Integer.toString(this.month)+str1;
		str=str+Integer.toString(this.year);

		return str;
	}

	public Boolean isSmaller(Date d)
	{
		if(date >= d.date)
			return false;
		if(month >= d.month)
			return false;
		if(year >= d.year)
			return false;
		
		return true;
	}
	
	public long[] getDiff(Date d)
	{
		long result[]=new long[3];
		String s1 = year+"-"+month+"-"+date;
		String s2 = d.year+"-0"+d.month+"-0"+d.date;
		LocalDate date1 = LocalDate.parse(s1);
		LocalDate date2 = LocalDate.parse(s2);
			
			result[0]=ChronoUnit.DAYS.between(date1, date2);
			result[1]=ChronoUnit.MONTHS.between(date1, date2);
			result[2]=ChronoUnit.YEARS.between(date1, date2);
		
		return result;
	}
	
}