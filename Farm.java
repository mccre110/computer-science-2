
public class Farm 
{
	
	public static void main(String[] args)
	{
		Cow cow = new Cow();
		Calf calf = new Calf();
		Pig pig = new Pig();
		Piglet piglet = new Piglet();

		cow.eat();
		cow.sleep();
		cow.cow();

		pig.eat();
		pig.sleep();
		pig.pig();

		calf.eat();
		calf.sleep();
		calf.calf();

		piglet.eat();
		piglet.sleep();
		piglet.piglet();

	}	
}