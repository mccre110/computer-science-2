import java.util.Scanner;
public class Columbus 
{
		
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Welcome to A Columbus Adventure!");
		
		Person Quint = new Person("Quint");
		Person Nemo = new Person("Nemo");
		Person Columbus = new Person("Columbus");
		
		System.out.println("Enter a Name for the Nina:");
		String ninaName = Scanner.nextLine();
		System.out.println("Enter a Name for the Pinta:");
		String pintaName = Scanner.nextLine();
		System.out.println("Enter a Name for the Santa Maria:");
		String santaMariaName = Scanner.nextLine();
		
		Ship Nina = new Ship(Quint, ninaName);
		Ship Pinta = new Ship(Nemo, pintaName);
		Ship SantaMaria = new Ship(Columbus, santaMariaName);	

		int userChoice = Ship.PassageSel();
		
		if (userChoice == 1) 
		{			
			Nina.passageOne();
			Pinta.passageOne();
			SantaMaria.passageOne();
		}
		else if (userChoice ==2) 
		{
			Nina.passageTwo();
			Pinta.passageTwo();
			SantaMaria.passageTwo();
		}
		else if (userChoice == 3) 
		{
			Nina.passageThree();
			Pinta.passageThree();
			SantaMaria.passageThree();
		}
		else
			System.out.println("Try Again");
		Scanner.close();
	}
}
