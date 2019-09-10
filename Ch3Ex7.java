import java.util.Scanner;

public class Ch3Ex7 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x input");
		double x = input.nextDouble();
		series(x);
		input.close();
	}
	static void series(double x)
	{
		double fact =1;
		double sum = 1;
		for(int i = 1; i <=100; i++)
    	{
    		fact *=i;
        	sum += Math.pow(x, i)/fact;
        	if (i==1) 
        	{
        		System.out.printf("When n is 1, sum =%.2f", sum);
        		System.out.println();
        	}
        	else if (i==10) 
        	{
        		System.out.printf("When n is 10, sum =%.2f", sum);
        		System.out.println();
        	}
        	else if (i==50) 
        	{
        		System.out.printf("When n is 50, sum =%.2f", sum);
        		System.out.println();
        	}
    	}
    } 
}