//Simple Calculator
import java.util.stream.*;
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		System.out.println("Time to Calculate");
		System.out.println("'a'ddition, 's'ubtraction, 'm'ultiplication, 'avg' or 'std' dev");
		Scanner input = new Scanner(System.in);
		String sel = input.next();

		if (sel.equals("a"))
		{
			System.out.println("How many numbers would you like to add?");
			int arrayLength = input.nextInt();
			int[] intArray = new int[arrayLength];
			for (int x=arrayLength; x>0 ;x--) 
			{
				System.out.println("Enter a Number: ");
				int uinput = input.nextInt();
				intArray[x-1] = uinput;
			}
			
			int sum = (IntStream.of(intArray).sum());
			System.out.println("Your total is: "+ sum);
		}
		else if (sel.equals("s"))
		{
			System.out.println("Enter First Number: ");
			int num1 = input.nextInt();
			System.out.println("Enter Second Number: ");
			int num2 = input.nextInt();
			int diff = num1-num2;
			System.out.println("Your difference is: "+ diff);
		}
		else if (sel.equals("m"))
		{
			System.out.println("Enter First Number: ");
			int num1 = input.nextInt();
			System.out.println("Enter Second Number: ");
			int num2 = input.nextInt();
			int pro = num1*num2;
			System.out.println("Your product is: "+ pro);
		}
		else if (sel.equals("d"))
		{
			System.out.println("Enter First Number: ");
			int num1 = input.nextInt();
			System.out.println("Enter Second Number: ");
			int num2 = input.nextInt();
			double quo = num1/num2;
			System.out.println("Your quotient is: "+ quo);
		}
		else if (sel.equals("avg"))
		{
			System.out.println("How many numbers would you like to average?");
			int arrayLength = input.nextInt();
			int[] intArray = new int[arrayLength];
			for (int x=arrayLength; x>0 ;x--) 
			{
				System.out.println("Enter a Number: ");
				int uinput = input.nextInt();
				intArray[x-1] = uinput;
			}

			double sum = (IntStream.of(intArray).sum());
			double avg = sum/arrayLength;
			System.out.println("Your average is: "+ avg);
		}
		else if (sel.equals("std"))
		{
			System.out.println("Enter First Number: ");
			int num1 = input.nextInt();
			System.out.println("Enter Second Number: ");
			int num2 = input.nextInt();
			System.out.println("Enter Third Number: ");
			int num3 = input.nextInt();
			double avg = (num1+num2+num3)/3;
			double numx1 = (num1-avg)*(num1-avg);
			double numx2 = (num2-avg)*(num2-avg);
			double numx3 = (num3-avg)*(num3-avg);
			double std = Math.sqrt((numx1+numx2+numx3)/3);
			System.out.println("Your standard dev is: "+ std);
		}
		else
			System.out.println("Try Again");
		input.close();
	}
}