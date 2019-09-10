public class Ch1Ex4 
{
	
	public static void main(String[] args)
	{
		double sKill = 1000; // grams
		double mWeight =  2000; //grams
		double pGoalWeight = 68039; //grams
		double sodaSweet = .001; // 1/10 of 1% Sweetner
		double killMouse = (sKill / mWeight);
		double humanKill = (killMouse * pGoalWeight);
		double humanAmount = (humanKill * sodaSweet);
		System.out.println("Amount to kill: " +humanAmount);

	}	
}		