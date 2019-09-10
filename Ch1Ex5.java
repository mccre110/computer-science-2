public class Ch1Ex5 
{
	
	public static void main(String[] args)
	{
		String input = ("I hate you and I love you");
		
		System.out.println("The line to be changed is:");
		System.out.println(input);

		String output = input.replaceFirst("hate", "love");
		
		System.out.println("I have rephrased that line to read:");
		System.out.println(output);
	}	
}