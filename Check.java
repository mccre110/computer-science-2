public class Check extends Payment
{
	private String routingNumber;
	private String name;

	public Check(double amount, String number, String name)
	{
		super(amount);
		setNumber(number);
		setName(name);
	}
	public String getNumber()
	{
		return routingNumber;
	}
	public void setNumber(String newNumber)
	{
		routingNumber = newNumber;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
}