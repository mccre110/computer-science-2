
import java.util.Scanner;
public class Ch11Ex1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Interest inter = new Interest();
		System.out.println("Enter Deposit: ");
		inter.deposit = input.nextInt();
		System.out.println("Enter Inerest Rate in Percent: ");
		inter.interestRate = input.nextDouble()/100;
		System.out.println("Enter Number of Years: ");
		inter.years = input.nextInt();
		System.out.println("Total: "+ inter.calculateTotal(inter.deposit, inter.years));
	}

	
}