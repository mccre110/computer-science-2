public class Ch12Ex3 {
	

	public static void main(String[] args)
	{
		Cash cash = new Cash(100);
		System.out.println("New $100 cash payment amount");
		System.out.println("Payment amount = "+cash.toString());

		Check check = new Check(200, "1234", "Joe");
		System.out.println("New $200 check payment amount");
		System.out.println("Payment amount = "+check.toString());

		CreditCard credit = new CreditCard(300, "Jack", "111222333444", "June 1, 2020");
		System.out.println("New $300 Credit Card payment amount");
		System.out.println("Payment amount = "+credit.toString());
	}	
}