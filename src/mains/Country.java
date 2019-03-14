package mains;

public class Country
{
	private String countryName;
	private long countryArea;
	private long countryPopulation;

	public Country(){}

	public Country(String name,long area,long population)
	{
		this.countryName = name;
		this.countryArea = area;
		this.countryPopulation = population;
	}
	
	public void setCountryName(String name)
	{
		this.countryName = name;
	}
	
	public String getCountryName()
	{
		return countryName;
	}

	public String getLargestArea(Country country[])
	{
		long maxarea = country[0].countryArea;
		int index = 0;
		for(int i = 1;i<country.length;i++)
		{
			if(maxarea < country[i].countryArea)
			{
				maxarea = country[i].countryArea;
				index = i;
			}
		}
		return country[index].countryName;
	}
	
	public String getLargestPopulation(Country country[])
	{
		long maxpopulation = country[0].countryPopulation;
		int index = 0;
		for(int i = 1;i<country.length;i++)
		{
			if(maxpopulation < country[i].countryPopulation)
			{
				maxpopulation = country[i].countryPopulation;
				index = i;
			}
		}
		return country[index].countryName;
	}
	
	public String getLargestDensity(Country country[])
	{
		long maxDensity = country[0].countryPopulation / country[0].countryArea;
		int index = 0;
		for(int i = 1;i<country.length;i++)
		{
			if(maxDensity < country[i].countryPopulation/ country[i].countryArea)
			{
				maxDensity = country[i].countryPopulation/ country[i].countryArea;
				index = i;
			}
		}
		return country[index].countryName;
	}
}