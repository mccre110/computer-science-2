import java.util.Random;
public class Railroad
{
	Random random = new Random();
	int railroadSeats = 30;
	int hotdogs = 10;
	String weather = "Sunny and 75";
	public void rideTrain()
	{
		if ((random.nextInt(40)+1)>=railroadSeats)
			System.out.println("Yay! You got to ride on the train");
		
		else
			System.out.println("Sorry no room on the train right now");
	}
	public void getFood()
	{
		if (hotdogs>1) 
		{
			hotdogs -= 1;
			System.out.println("You ate a hot dog");
		}
		else
			System.out.println("all out :(");
		
	}
	public void checkWeather()
	{
		System.out.println(weather);
	}
}