public abstract class Payment 
{
	protected double amount;
	public Payment(double amount)
	{
		this.amount = amount;
	}
	public String toString()
	{
		return Double.toString(amount);
	}
}