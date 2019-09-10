public class HotDogStand 
{
	private int idNumber;
	private int hotdogSold = 0;
	private static int totalDogSold =0;
	public HotDogStand(int idNumber, int hotdogSold)
	{
		this.idNumber = idNumber;
		this.hotdogSold = hotdogSold;
		totalDogSold += hotdogSold;
	}
	public void justSold()
	{
		this.hotdogSold +=1;
		totalDogSold +=1;
	}
	public static int getDogSold()
	{
		return totalDogSold;
	}
}