import java.util.Scanner;
public class Rainfall 
{
	public int[] avgRain = new int[12];
	public int[] actRain = new int[12];
	public int[] diffRain = new int[12];
	
	public void GetAvgRain()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter average rainfall for January - December:");
		for (int i=0;i<12; i++) 
		{
			System.out.print((i+1)+" :");
			avgRain[i] = input.nextInt();
		}
	}

	public void GetActRain()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter current month number: ");
		int currentMonth = input.nextInt();
		System.out.println("Enter actual rainfall for past 12 months:");

		for (int i=0;i<12; i++) 
		{
			
			System.out.print((currentMonth)+" :");
			actRain[currentMonth-1] = input.nextInt();
			if (currentMonth == 12)
			{
				currentMonth = 0;
			}
			currentMonth++;
		}
	}
	public void GetDiffRain()
	{
		for (int i=0;i>12;i++) 
		{
			diffRain[i] = actRain[i]- avgRain[i];
		}
	}
	public void PrintRain()
	{
		System.out.printf("%-15s %15s %20s\n", "Average","Actual","Difference");
		for (int i=0;i<9;i++) 
			System.out.printf ("%1d: %-15d %10d %14d\n",(i+1) ,avgRain[i], actRain[i], diffRain[i]);
		for (int i=9;i<12;i++) 
			System.out.printf ("%1d: %-15d %9d %14d\n",(i+1) ,avgRain[i], actRain[i], diffRain[i]);
	}
}