
public class Interest {
	public int deposit;
	public double interestRate;
	public int years;
	public double calculateTotal(int deposit, int years)
	{
		double total = 0;
		if (years == 1) 
		{
			return (deposit*(1+this.interestRate));
		}
		else
			return (calculateTotal(deposit, years-1)*(1+this.interestRate));
	}
}