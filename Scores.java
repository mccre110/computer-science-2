import java.util.Scanner;
import java.util.Arrays;
public class Scores 
{
	private double[] scores = new double[7];
	private double sum = 0;
	private double difficulty =0;
	public void GetScores()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Scores :");
		for (int i=1; i<=7; i++)
		{
			System.out.print(i+": ");
			double userInput = input.nextDouble();
			if (userInput>0 && userInput<10) 
				scores[i-1] = userInput;
			else
			{
				System.out.println("Scores (0-10): Try Again");
				i--;
			}
		}
	}
	public void AdjustScores()
	{
		Arrays.sort(scores);
		for(int i=1; i<=6; i++)
			sum += scores[i];
	}
	public void GetDifficulty()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter degree of difficulty");
		while (true)
		{
			this.difficulty = input.nextDouble();
			if (difficulty>=1.2 && difficulty<=3.8)
				break;
			else
				System.out.println("Try Again");
		}
		input.close();
		
	}
	public void CalcFinalScore()
	{
		double finalScore = (sum*difficulty* 0.6);
		System.out.println("Final score: "+finalScore);
	}
}
