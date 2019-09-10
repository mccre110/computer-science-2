import java.util.Scanner;
import java.util.*;
public class IntArray 
{
	private int[] intArray;
	public void GetInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How numbers? (at most 50)");
		intArray = new int[input.nextInt()];
		
		System.out.println("Enter numbers");
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.print((i+1)+": ");
			intArray[i] = input.nextInt();
		} 			
	}
	public void Sort() 
	{
        for(int i=0; i<intArray.length; i++) 
            intArray[i] = (intArray[i]*-1);
        Arrays.sort(intArray);
                for(int i =0; i<intArray.length; i++) 
            intArray[i] = (intArray[i] * -1);
    }
    public void GetTable() 
    {
        int count = 1;
        System.out.printf("Number Count\n");
        for (int i = 0; i < intArray.length; i++) 
        {
        	if (i < intArray.length - 1) 
        	{
            	if (intArray[i] == intArray[i + 1])
                	count++;
        	}
        	else 
            	System.out.printf("%6d%6d\n", intArray[i], count);
        	if (i < intArray.length - 1 && intArray[i] != intArray[i + 1]) 
        	{
            	System.out.printf("%6d%6d\n", intArray[i], count);
            	count = 1;
            }
        }
    }
}
