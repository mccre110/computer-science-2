//Simulates 10,000 games of craps and gives probablity
import java.util.Scanner;
import java.util.Random;
public class Ch3Ex2 
{

	public static void main(String[] args)
	{
		Random rand = new Random();
		int winCount = 0;
		int lossCount = 0;

		for (int i = 0;i<10000;i++) 
		{
		    int rollDice = ((rand.nextInt(6)+ 1) + (rand.nextInt(6)+ 1));
			if (rollDice == 7 || rollDice == 11) 
		    {
		    	winCount += 1;
		    } 
		    else if (rollDice == 2 || rollDice == 3 || rollDice == 12) 
		    {
		    	lossCount += 1;
		    } 
		    else 
		    {
		    	int point = rollDice;
		    	while (true) 
		    	{
		     		rollDice = ((rand.nextInt(6)+ 1) + (rand.nextInt(6)+ 1));
		        	if (rollDice == point) 
		        	{
		          		winCount += 1;
		          		break;
		        	}
		        	if (rollDice == 7) 
		        	{
		          		lossCount += 1;
		          		break;
		        	}
		    	}
		    }
		}
		double prob = (winCount*1.0/(winCount + lossCount)*100.0);
		System.out.println("Number of wins :"+winCount);
		System.out.println("Number of losses :"+lossCount);
		System.out.print("Game Winning Probablility Percent: ");
		System.out.printf("%.2f",prob);
	}	
}