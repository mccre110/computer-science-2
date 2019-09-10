import java.util.Scanner;
public class GoofyPlayHouse 
{
	//Basically an if written in methods
	public static void main() 
	{
		Scanner Playtime = new Scanner(System.in);
		System.out.println("Welcome to Goofys play house you playful goober ;)");
		System.out.println();
		System.out.println("Goofy: Hey what do you want to do in my playhouse, don't be shy. ");
		System.out.println();
		System.out.println("We have several activites in the play house, do you want to go on the 'slide'\n with goofy,"
		+ " or perhaps you want to play with goofies 'squirt' guns, maybe if you are feeling adventureous you can"
		+ "\n go in the mirror 'maze'. But be careful no one has ever returned..." );
		System.out.println();
		System.out.println("Choice?: ");

		String GoofyChoice = Playtime.next();

		if (GoofyChoice.equals("slide"))
			System.out.println(slide());

		else if (GoofyChoice.equals("squirt")) 
			System.out.println((squirt()));

		else if (GoofyChoice.equals("maze")) 
			System.out.println(maze());
		else
			System.out.println("Try Again");

		Playtime.close();
	}

	public static String slide() 
	{
		return ("You go down the slide and its is a fantastic experience.");
	}
	public static String squirt() 
	{
		return ("You play with the squirt guns and get soaking wet, you're entire day is ruined. \n You think about suing but goofy has better lawyers. ");
	}            
	public static String maze() 
	{
		return ("You got lost in the maze. Should have listened...");
	}
}