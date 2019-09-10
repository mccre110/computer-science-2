// Takes Inches or Feet of Parents as input 
// and Estimates Child Height based on given equation
import java.util.Scanner;
public class Ch3Ex3 
{

	public static void main(String[] args)
	{
		String gender = "";
		String unit = "";
		Scanner input = new Scanner(System.in);
		while (true)
		{
			int estimate = 0;
			System.out.println("Enter 'quit' at anytime to exit!");
			System.out.print("Enter 'boy' or 'girl': ");
			gender = input.next();
			if (gender.equals("quit"))
				break;
			System.out.print("Enter 'feet' or 'inches': ");
			unit = input.next();
			if (unit.equals("quit"))
				break;
			if (gender.equals("boy") && unit.equals("inches")) 
			{
				System.out.print("Enter Mother Height in Inches :");
				int heightMother = input.nextInt();
				System.out.print("Enter Father Height in Inches :");
				int heightFather = input.nextInt();
				estimate = (((heightMother*13/12)+ heightFather)/2);
				System.out.println("Estimated Child Height in Inches: "+ estimate);
			}
			else if (gender.equals("girl") && unit.equals("inches")) 
			{
				System.out.print("Enter Mother Height in Inches :");
				int heightMother = input.nextInt();
				System.out.print("Enter Father Height in Inches :");
				int heightFather = input.nextInt();
				estimate = (((heightFather*12/13)+ heightMother)/2);
				System.out.println("Estimated Child Height in Inches: "+estimate);
			}
			else if (gender.equals("boy") && unit.equals("feet")) 
			{
				System.out.print("Enter Mother Height in Feet :");
				int heightMother = 12* input.nextInt();
				System.out.print("Enter Mother Height in Inches :");
				heightMother += input.nextInt();
				System.out.print("Enter Father Height in Feet :");
				int heightFather = 12* input.nextInt();
				System.out.print("Enter Father Height in Inches :");
				heightFather += input.nextInt();
				estimate = (((heightMother*13/12)+ heightFather)/2);
				System.out.print("Estimated Child Height in Feet/Inches: ");
				System.out.println((estimate/12)+"/"+(estimate%12));
			}
			else if (gender.equals("girl") && unit.equals("feet")) 
			{
				System.out.print("Enter Mother Height in Feet :");
				int heightMother = 12* input.nextInt();
				System.out.print("Enter Mother Height in Inches :");
				heightMother += input.nextInt();
				System.out.print("Enter Father Height in Feet :");
				int heightFather = 12* input.nextInt();
				System.out.print("Enter Father Height in Inches :");
				heightFather += input.nextInt();
				estimate = (((heightFather*12/13)+ heightMother)/2);
				System.out.print("Estimated Child Height in Feet/Inches: ");
				System.out.println((estimate/12)+"/"+(estimate%12));
			}
			else
			{
				System.out.println("Try Again");
				continue;
			}
		}
		input.close();
	}	
}