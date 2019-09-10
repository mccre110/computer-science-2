import java.util.Scanner;
public class Ship 
{
	private Person captain;
	public String currentLocation = "Lisbon";
	public int distanceTravel = 0;
	private String name;
	public int speed = 5;
	public double dayCount = 0;
	
	public Ship(Person captain, String name)
	{
		this.captain = captain;
		this.name = name;
	}
	
	public static int PassageSel()
	{
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("'1' : Northwest Passage");
		System.out.println("'2' : There be dragons");
		System.out.println("'3' : Ferdinand and Isabella");
		System.out.println("Which route would you like to take?");
		int sel = input.nextInt();
		return sel;
	}

	public void Status()
	{
		System.out.println(name +":"+ captain);
		System.out.println("Distance:"+distanceTravel);
		System.out.println("Speed: "+speed);
		System.out.printf("Day: %2.0f\n",dayCount);
		System.out.println("Current Location:"+ currentLocation);
		System.out.println();
	}
	public void passageOne()
	{
		this.currentLocation = "Atlantic Ocean";
		while (this.distanceTravel<4200)
			{
				if (this.distanceTravel == 3000)
					this.speed = 1;
				if (this.distanceTravel%200 == 0)
					this.Status();
				this.distanceTravel += (this.speed);
				this.dayCount +=(.041667); 
			}
		if (this.distanceTravel==4200) 
			this.currentLocation = "Carribean";
			
		this.Status();
	}
	public void passageTwo()
	{
		this.currentLocation = "Atlantic Ocean";
		while (this.distanceTravel<4200)
		{
			if (this.distanceTravel == 2500)
			{
				if ((this.captain.toString().equals("Columbus")))
				{
					this.speed = 0;
					break;
				}

				else if ((this.captain.toString().equals("Quint")))
				{
					this.speed = 0;
					break;
				}
				else if ((this.captain.toString().equals("Nemo")))
					this.speed = 3;
			}
			if (this.distanceTravel%200 == 0)
				this.Status();

			this.distanceTravel += (this.speed);
			this.dayCount +=(.041667); 
		}
		if (this.distanceTravel>=4200) 
			this.currentLocation = "Carribean";

		this.Status();
	}
	public void passageThree()
	{
		this.currentLocation = "Atlantic Ocean";
		while (this.distanceTravel<4200)
			{
				if (this.distanceTravel == 500)
					this.speed = 10;
				if (this.distanceTravel%200 == 0)
					this.Status();
				this.distanceTravel += (this.speed);
				this.dayCount +=(.041667); 
			}
		if (this.distanceTravel==4200) 
			this.currentLocation = "Carribean";
			
		this.Status();
	}
}