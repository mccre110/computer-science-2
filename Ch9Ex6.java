import java.util.*;
public class Ch9Ex6
{
	public static double operation(double uinput, String uAct) throws UnknownOperatorException
	{

		String oper = uAct.substring(0, 1);
		if(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/") && !oper.equals("R") && !oper.equals("r"))
			throw new UnknownOperatorException();

		else if(oper.equals("R") || oper.equals("r"))
			return uinput;

		double num = Double.parseDouble(uAct.substring(1, uAct.length()));
		System.out.print("result "+oper+num+" = ");
		
		if(oper.equals("+"))
			return uinput += num;
		else if(oper.equals("-"))
			return uinput -= num;
		else if(oper.equals("*"))
			return uinput *= num;
		else
			return uinput /= num;
	}

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Calculator is on.");

		while(true)
		{
			int loops=0;
			double result = 0;
			String oper = "";
			System.out.println("result: " + result);
			while(!oper.equals("R") && !oper.equals("r"))
			{
				try
				{
					oper = input.nextLine();
					result = operation(result, oper);
                    loops++;
					if(!oper.equals("R") && !oper.equals("r"))
					{
						System.out.println(result);
						System.out.println("Result: "+ result);
					}
				}
				catch(UnknownOperatorException e)
				{
					System.out.println("Try Again");
				}
			}
			
			System.out.println("Result: " + result);
			System.out.println("Again Y/N");
			String end = input.nextLine();
			if (end.equals("y") || end.equals("y"))
				continue;
			else
			{
				System.out.println("End of Program.");
				break;
			}
		}

	}

}