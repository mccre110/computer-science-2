import java.util.Scanner;
public class Ch2Ex4 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Distance of Commute :");
		double distance = input.nextInt();
		System.out.println("Enter Miles per Gallon :");
		double MPG = input.nextDouble();
		System.out.println("Enter Gas Price :");
		double gasPrice = input.nextDouble();

		double total = distance / MPG * gasPrice;
		System.out.println("$"+ total + ": is your total cost!");

	}	
}