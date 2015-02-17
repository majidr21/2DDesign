package two.dimensions.model;

public class Cars
{
	private String name;
	private int speedLevel;
	private boolean isFast;
	
	@Override
	public String toString()
	{
		String carString = "";
		carString += "Hi, I am a Car object. My name is " + name + ".";
		carString += "My speed level is" + speedLevel + " and ";
		if(isFast)
		{
			carString += " I am fast " ;		
		}
		else
		{
			carString += "I am NOT fast. ";
		}
		
		return carString;
	}
}
