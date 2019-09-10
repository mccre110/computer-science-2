import java.lang.Runnable;
public class CounterController extends CounterModel implements Runnable
{
	private int startValue;
	private int endValue;
	public CounterController(int startValue, int endValue)
	{
		super(startValue);
		this.startValue = startValue;
		this.endValue = endValue;
		
	}
	public void run()
	{
		int c =0;
		while (c<=(endValue-startValue))
		{
			try
			{
				Increment();
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Failed");
			}
			c++;
		}
		
		
	}
	
}