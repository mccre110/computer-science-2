import java.util.*;
public class Ch14Ex4
{
	public static void main(String args[])
	{
        ArrayList<Double> doubleArray = new ArrayList<Double>();
        for(double i = 1; i < 10.4; i += 0.2)
			doubleArray.add(i);
		MyMathClass<Double> doubl = new MyMathClass<Double>();
		System.out.println("STD Dev for doubles: " +  doubl.stdDev(doubleArray));

		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int j = 1; j < 20; j++)
			intArray.add(j);
		MyMathClass<Integer> intt = new MyMathClass<Integer>();
		System.out.println("STD Dev for ints: " + intt.stdDev(intArray));
	}
}   
