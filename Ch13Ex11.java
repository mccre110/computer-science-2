import java.util.*;
public class Ch13Ex11
{
	

	public static void main(String[] args)
	{
		ArrayList<Student> sList = new ArrayList<Student>();
		Student one = new Student("Tabor",1);
		Student two= new Student("Doe",2);
		Student three =new Student("Chapman",3);
		Student four= new Student("Post",4);
		Student five= new Student("Park",5);

		
		sList.add(two);
		sList.add(three);
		sList.add(four);
		sList.add(five);
		sList.add(one);

		Collections.sort(sList);
		for (Student s: sList) {
			System.out.println(s.toString());
		}
	}	
}