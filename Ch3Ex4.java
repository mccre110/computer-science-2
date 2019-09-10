// Calculates Adjusted Price after Inflation
import java.util.Scanner;
public class Ch3Ex4 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cost of item");
		double cost = input.nextDouble();
		System.out.println("Enter number of years this item will be purchased");
		int years = input.nextInt();
		System.out.println("Enter rate of inflation in percent");
		double inflation = input.nextDouble();

		inflation /= 100;

		for (int i=0;i<years;i++) 
		{
			cost += cost * inflation;
		}

		System.out.print("Ajusted price: $");
		System.out.printf("%.2f", cost);
		input.close();

	}	
}