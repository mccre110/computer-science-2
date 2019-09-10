//Growth Rate Program using fibonacci
import java.util.Scanner;
public class Ch3Ex6 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		while (true)
		{
			System.out.println("Enter Population in pounds");
			int startPop = input.nextInt();
			System.out.println("Enter Number of Days");
			int time = input.nextInt();
			int pop = 0;
			int prevPop = 0;

			for (int i = 0;i<=time;i+=5) 
			{
				pop = startPop + prevPop;
				startPop = prevPop;
				prevPop = pop;
			}

			System.out.println("New Population is: "+pop);
			
			System.out.println("Enter 'exit' to quit or 0 to continue");
			String loop = input.next();
			if (loop.equals("exit")) 
			{
				break;
			}
		}
		input.close();
	}	
}