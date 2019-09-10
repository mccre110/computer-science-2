import java.util.Scanner;
public class Ch2Ex8 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your text");
		String userInput = input.nextLine();

		String upper = userInput.toUpperCase();
		String lower = userInput.toLowerCase();

		System.out.println(upper);
		System.out.println(lower);
	}	
}