
public class Action extends Movie
{
	public Action(String rating,int idNumber,String title)
	{
		super(rating, idNumber, title);
	}
	public double calcLateFees(int days)
	{
		return days * 3.0;
	}	
}