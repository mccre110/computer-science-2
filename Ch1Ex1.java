public class Ch1Ex1 
{
	
	public static void main(String[] args)
	{
		int weight = 150;
		int mrun = 10;
		int mball = 8;
		int msleep = 1;
		int tcal = 0;
		
		tcal += calc(30,mrun,weight);
		tcal += calc(30,mball,weight);
		tcal += calc((30*6),msleep,weight);
		System.out.println("Calories burned :" +tcal);
	}
	static int calc(int time,int act,int weight)
	{
		int cal = .0175*act*weight/2.2*time;
		return cal;
	}
	
}