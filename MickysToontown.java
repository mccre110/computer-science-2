import java.util.Scanner;
public class MickysToontown 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Railroad areaOne = new Railroad();
		GoofyPlayHouse areaTwo = new GoofyPlayHouse();
		DonaldBoat areaThree = new DonaldBoat();
		
		System.out.println("Enter your name: ");
		String userName=input.nextLine();
		System.out.println("Welcome to ToonTown, "+userName+"!");		
		
		System.out.println("Area 1,2, or 3:");
		int userChoice=input.nextInt();

		if (userChoice==1) 
		{
			System.out.println("You try to ride the train:");
			areaOne.rideTrain();
			System.out.println("Let's see what's for lunch:");
			areaOne.getFood();
			System.out.println("What's the weather like here?");
			areaOne.checkWeather();
		}
		else if (userChoice==2) 
		{
			areaTwo.main();
		}
		else if (userChoice==3) 
		{
			areaThree.main();
		}
		else
			System.out.println("Try Again");
		
		input.close();
	}	

}
