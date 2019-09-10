//Radomly chose 3 unique numbers 1-30
import java.util.Random;
public class Ch3Ex11 
{

	public static void main(String[] args)
	{
		Random rand = new Random();
		int winner1 = rand.nextInt(30)+1;
		int winner2 = rand.nextInt(30)+1;
		int winner3 = rand.nextInt(30)+1;
		while (winner2==winner1)
		{
			winner2 =rand.nextInt(30)+1;
		}
		while (winner3 == winner1 || winner3 == winner2)
		{
			winner3 = rand.nextInt(30)+1;
		}

		System.out.println(winner1+","+winner2+","+winner3);

	}	
}