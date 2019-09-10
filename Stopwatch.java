
public class Stopwatch extends Clock 
{
	public String Time()
	{
		return (super.hours+"."+super.minutes+"."+super.seconds);
	}
}