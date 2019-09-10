import java.util.stream.*;
import java.util.Scanner;
public class Ch9Ex1 
{
	
	public static void main(String[] args)
	{
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("How many numbers would you like to average?");
			int arrayLength = input.nextInt();
			int[] intArray = new int[arrayLength];
			for (int x=arrayLength; x>0 ;x--) 
			{
				try
				{
					System.out.println("Enter a Number: ");
					int uinput = input.nextInt();
					if (uinput<0) 
						throw new RangeException();
					intArray[x-1] = uinput;
				}
				
				catch(RangeException e)
				{
					x++;
					System.out.println("N must be positive");
				}
				
			}
			double sum = (IntStream.of(intArray).sum());
			double avg = sum/arrayLength;
			System.out.println("Your average is: "+ avg);
			break;
		}
	}	
}