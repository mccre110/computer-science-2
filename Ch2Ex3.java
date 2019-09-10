import java.util.Scanner;
public class Ch2Ex3 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = input.nextInt();
		
		int sum = num1+num2;
		System.out.println("Your total is: "+ sum);
		int diff = num1-num2;
		System.out.println("Your difference is: "+ diff);
		int pro = num1*num2;
		System.out.println("Your product is: "+ pro);
	}	
}