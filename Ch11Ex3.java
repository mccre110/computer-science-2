import java.util.Scanner;
public class Ch11Ex3 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many rows?: ");
		System.out.println("Pin Count: "+ pinOutput(input.nextInt()));
	}
	public static int pinOutput(int row)
	{
		if (row ==1) 
		{
			return 1;
		}
		else
			return (row+pinOutput(row-1));
	}	
}