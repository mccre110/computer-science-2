
public class Movie {
	private String rating;
	private int idNumber;
	public String title;

	public Movie(String rating,int idNumber,String title)
	{
		setRating(rating);
		setIdNumber(idNumber);
		setTitle(title);
	}
	public void setRating(String rating)
	{
		this.rating = rating;
	}
	public String getRating()
	{
		return this.rating;
	}
	public void setIdNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}
	public int getIdNumber()
	{
		return this.idNumber;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}
	public boolean equals(Movie movie)
	{
		if (this.idNumber == movie.idNumber) 
			return true;
		else
			return false;
	}
	public double calcLateFees(int days)
	{
		return days * 2.0;
	}
}