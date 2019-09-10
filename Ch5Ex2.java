import java.util.Scanner;
public class Ch5Ex2 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Numerator: ");
		int userNum = input.nextInt();
		System.out.println("Enter Denominator: ");
		int userDen = input.nextInt();
		Fraction userFract = new Fraction(userNum, userDen);
		while (true)
		{
			System.out.println("----- Compare to this fraction------");
			System.out.println("Enter Numerator: ");
			userNum = input.nextInt();
			System.out.println("Enter Denominator: ");
			userDen = input.nextInt();
			System.out.print(userFract.equals(new Fraction(userNum, userDen)));
			System.out.println(" [Fractions Equal?]");
			System.out.println("Quit? [y/n] :");
			String loopControl = "";
			loopControl = input.next();
			if (loopControl == "y")
				break;
			else
				continue;
		}
	}	
}