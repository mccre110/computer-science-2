public class Account
{
	private double balance;
	public Account()
	{
		balance = 0;
	}
	public Account(double initialDeposit)
	{
		balance = initialDeposit;
	}
	public double getBalance()
	{
		return balance;
	}
	public double deposit(double amount) throws BadBalanceException
	{
		if (amount > 0)
			balance += amount;
		else
			throw new BadBalanceException();
		return balance;
	}
	public double withdraw(double amount) throws BadBalanceException
	{
		if ((amount > balance) || (amount < 0))
			throw new BadBalanceException();
		else
			balance -= amount;
		return balance;
	}
}