public class Ch5Ex1 
{
	
	public static void main(String[] args)
	{
		HotDogStand one = new HotDogStand(1,30);
		HotDogStand two = new HotDogStand(2,50);
		HotDogStand three = new HotDogStand(3,23);

		one.justSold();
		two.justSold();
		three.justSold();

		System.out.println("Total dogs sold: "+HotDogStand.getDogSold());


	}	
}