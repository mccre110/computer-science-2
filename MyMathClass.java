import java.util.ArrayList;
public class MyMathClass<T extends Number> 
{	
	public double stdDev(ArrayList<T> array)
	{
		double avg = 0;
		double dev = 0;
		for(int i=0;i<array.size();i++)
			avg += array.get(i).doubleValue();	
		avg/= array.size();
		for(int i=0; i<array.size(); i++)
			dev += (array.get(i).doubleValue()-avg)*(array.get(i).doubleValue()-avg);
		dev = Math.sqrt(dev/array.size());
		return dev;
	}
}
