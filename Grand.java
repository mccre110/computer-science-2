
public class Grand extends Clock
{
	private String ext = "PM";
	public String Time()
	{
		return (super.hours.toString()+ext);
	}
}