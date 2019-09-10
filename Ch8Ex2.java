public class Ch8Ex2 
{		
	public static void main(String[] args)
	{
		Action actionMovie = new Action("G",1,"Some Action Movie");
		Comedy comedyMovie = new Comedy("PG-13",2,"Some Comedy Movie");
		Drama dramaMovie = new Drama("R",3,"Some Drama Movie");

		System.out.println(actionMovie.getTitle());
		System.out.println(comedyMovie.getTitle());
		System.out.println(dramaMovie.getTitle());


		System.out.println(actionMovie.getRating());
		System.out.println(comedyMovie.getRating());
		System.out.println(dramaMovie.getRating());

		System.out.println(actionMovie.getIdNumber());
		System.out.println(comedyMovie.getIdNumber());
		System.out.println(dramaMovie.getIdNumber());

		System.out.println(actionMovie.calcLateFees(5));
		System.out.println(comedyMovie.calcLateFees(5));
		System.out.println(dramaMovie.calcLateFees(5));	
			
		System.out.println(actionMovie.equals(comedyMovie));
		System.out.println(actionMovie.equals(actionMovie));



	}	
}