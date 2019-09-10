import java.util.Random;
public class LoadedDice extends Random
{
	
	public LoadedDice()
	{
		super();
	}
	public int nextInt(int num)
	{
		Random randGenerator = new Random();
		int chance = randGenerator.nextInt(2);
		if (chance == 0) 
		{
			return (num-1);
		}
		else
			return (randGenerator.nextInt(6));
	}
	
}