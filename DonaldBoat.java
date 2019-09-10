import java.util.Scanner;
public class DonaldBoat 
{
	public static void main()
	{
		while(true) 
		{
			System.out.println("Welcome to Donald's Boat!");
			Scanner myScanner = new Scanner(System.in);
			System.out.println("Where would you like to go?");
			System.out.println(" ");
			System.out.println("Below Deck");
			System.out.print("The Ship's Wheel");
			System.out.println(" ");
			System.out.println("Captain's Quarters");
			System.out.println(" ");
			System.out.println("Type 'Exit' to leave Donald's Boat.");
			String destination = myScanner.nextLine();

			if (destination .equals("Below Deck")) 
			{
				System.out.println(goBelowDeck());
				System.out.println(" ");
			}

			else if (destination .equals("The Ship's Wheel")) 
			{
				System.out.println(theShipWheel());
				System.out.println(" ");
			}
			
			else if (destination .equals("Captain's Quarters")) 
			{
				System.out.println(captainQuarters());
				System.out.println(" ");
			}

			else if (destination .equals("Exit")) 
			{
				System.out.println(leave());
				break;
			}
		}
	}
		public static String goBelowDeck() 
		{
			return ("You shot a cannon. Congratulations!!! You shot a ship down!");
		}
		public static String theShipWheel() 
		{
			return ("You just made the ship move into a new direction. Look at you. You are the captain now!");
		}
		public static String captainQuarters() 
		{
			return ("Look at all that bounty the captain has!!!");
		}
		public static String leave() 
		{
			return ("Than you for visiting Donald's Boat. We hope to see you again!");
		}
}