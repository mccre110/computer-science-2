public class CreditCard extends Payment
{
	private String expiration;
	private String number;
	private String name;

	public CreditCard(double amount, String name, String number, String expiration)
	{
		super(amount);
		setNumber(number);
		setName(name);
		setExpiration(expiration);
	}
	public String getNumber()
	{
		return number;
	}
	public void setNumber(String newNumber)
	{
		number = newNumber;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getExpiration()
	{
		return expiration;
	}
	public void setExpiration(String newExpiration)
	{
		expiration = newExpiration;
	}
}