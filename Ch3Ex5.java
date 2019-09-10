//Calculates Months to payoff a loan
public class Ch3Ex5 
{
	public static void main(String[] args)
	{
		double overallCost = 1000;
		double monthlyPayment = 50;
		double monthlyInterest = .015;
		int monthCount = 0;
		double overallInterest=0;
		
		while (overallCost>0)
		{
			double interest = (overallCost * monthlyInterest);
			overallInterest += interest;
			
			if (monthlyPayment>overallCost)
			{
				double totalPayment = overallCost + interest;
			}
			double principal = (monthlyPayment -interest);
			overallCost= (overallCost - principal);
			monthCount ++;

		}
		System.out.println("Number of Months to payoff: "+ monthCount);
		System.out.printf("Total Interest Paid: $%.2f",overallInterest);
	}	
}