public class Ch1Ex3 
{
	
	public static void main(String[] args)
	{
		String first = "corey";
		String last = "mccrea";

		String newFirst = first.substring(1,2).toUpperCase() + first.substring(2,4) + first.substring(0,1) + "ay "+last.substring(1,2).toUpperCase() + last.substring(2,5) + last.substring(0,1) + "ay";
		System.out.println(newFirst);
	}	

}