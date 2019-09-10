public class Ch9Ex7 
{

	public static void main(String[] args)
	{
		Account acc = new Account(100);

		try
		{
			acc.withdraw(101);
		}
		catch (BadBalanceException e)
		{
			System.out.println("Exeption thrown");
		}
		try
		{
			acc.deposit(-1);
		}
		catch(BadBalanceException e)
		{
			System.out.println("Exeption thrown");
		}
	}	
}