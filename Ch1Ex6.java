
public class Ch1Ex6 
{
	
	public static void main(String[] args)
	{
		double gearSize = 100; //inches
		double cadence = 90; //rpm
		double minHour = 60;
		double inchesMile = (12*5280);
		double total = gearSize * Math.PI * inchesMile * cadence * minHour;
		System.out.println(total + " MPH");
	}	
}