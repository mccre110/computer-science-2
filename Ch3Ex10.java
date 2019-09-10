//Pig Game adapted from my python code
import java.util.Random;
import java.util.Scanner;
public class Ch3Ex10 
{

	public static void main(String[] args)
	{;
		int scoreHuman = 0;
		int scoreComputer = 0;
		int rolltotal = 0;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		while (scoreComputer< 100 && scoreHuman < 100)
		{
			//Player turn
			System.out.println("You: "+scoreHuman+" | Computer: "+scoreComputer);
			System.out.println(" - - - - - - - - Human Playing - - - - - - - - - ");
			rolltotal = 0;
			int roll = rand.nextInt(6)+1;
			String sel = "0";
			System.out.println("You rolled a "+ roll);

			while (roll>1 && !sel.equals("h"))
			{
				System.out.println("Roll again or Hold (r/h) : ");
				sel = input.nextLine();
				if (sel.equals("r")) 
				{
					rolltotal += roll;
					roll = rand.nextInt(6)+1;
					System.out.println("You rolled a "+ roll);
				}
				else if (sel.equals("h")) 
				{
					rolltotal+=roll;
					scoreHuman +=rolltotal;
				}
				else
					System.out.println("Try Again");
			}

			System.out.println(" - - - - - - - - Computer Playing - - - - - - - - - ");
			rolltotal = 0;
			roll = rand.nextInt(6)+1;
			while (roll!= 1 && rolltotal <20)
			{
				rolltotal += roll;
				roll = rand.nextInt(6)+1;
			}
			if (rolltotal > 20) 
			{
				scoreComputer += rolltotal;
			}	
		}
		System.out.println("Good Game");
		if (scoreHuman>scoreComputer) 
		{
			System.out.println("You Won!");
		}
		else
			System.out.println("You Lost!");
		System.out.println("You: "+scoreHuman+ " | Computer: "+scoreComputer);
		input.close();
	}	
}