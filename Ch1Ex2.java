public class Ch1Ex2 
{
	public static void main(String[] args)
	{
		int candy = 10;
		int gum = 3;
		int coupon = 57;
		int candyCount = 0;
		int gumCount = 0;

		while (coupon>2) 
		{
			if (coupon>=candy)
			{
				coupon -= candy;
				candyCount += 1;
			}
			else
			{
				coupon -=gum;
				gumCount += 1;
			}
		}
		System.out.println("Candy amount:"+candyCount);
		System.out.println("Gum amount:"+gumCount);
		System.out.println("Coupons Left:"+coupon);
	}	
}