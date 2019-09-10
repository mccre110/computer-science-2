
public class Comedy extends Movie
{
	public Comedy(String rating,int idNumber,String title)
	{
		super(rating, idNumber, title);
	}
	public double calcLateFees(int days)
	{
		return days * 2.5;
	}	
}