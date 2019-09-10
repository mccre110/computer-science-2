import java.util.Scanner;
import java.util.InputMismatchException;
public class Ch9Ex2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		double n1;
		double n2;
		while(true)
		{
			try
			{
				System.out.println("Enter first num: ");
				n1 = input.nextDouble();		
				System.out.println("Enter second num: ");
				n2 = input.nextDouble();
				
				if(n2 == 0)
					throw new ZeroException();
								
				break;
			}		
			catch(InputMismatchException e)
			{
				System.out.println("Not a number");
				input.nextLine();

			}
			catch(ZeroException e)
			{
				System.out.println("Division by zero");

			}
		}
		System.out.println("Result: "+ (n1/n2));
	}
}