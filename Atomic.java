
public class Atomic extends Clock
{
	private String ext = "PM";
	public String Time()
	{
		return (super.hours+":"+super.minutes+":"+super.seconds+ext);
	}
}