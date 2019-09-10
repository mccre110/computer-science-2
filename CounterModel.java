
public class CounterModel extends CounterView
{
	private int counter;

	public CounterModel(int initialValue)
	{
		counter = initialValue;
	}
	public void Increment()
	{
		Display(counter);
		counter++;
		
	}

	
}