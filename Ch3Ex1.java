//Uses babylonian method to estimate square roots
//Takes an input and then loops through algorithm
import java.util.Scanner;
public class Ch3Ex1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Value for n: ");
		double n = input.nextDouble();
		
		double guess = n / 2;
		double newGuess = guess;

		do {
			newGuess = guess;
			double r =n/guess;
			guess = (guess+r)/2;
		}
		while (((newGuess - guess)/newGuess > .0001));
		
		System.out.print("Output of " + n +": ");
		System.out.printf("%.2f", guess);
		input.close();
	}	
}