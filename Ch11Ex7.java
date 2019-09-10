import java.util.Scanner;
public class Ch11Ex7 
{
	 public static void main(String[] args) 
	 {
	 			Scanner input = new Scanner(System.in);
				System.out.print("Enter number of discs: ");
				puzzle(input.nextInt(), "A", "B", "C");
	 }
	 public static void puzzle(int disks, String initialPost, String middlePost, String finalPost) 
	 {
			 if (disks == 1) 
					 System.out.println(initialPost + " to " + finalPost);
			 else 
			 {
					 puzzle(disks - 1, initialPost, finalPost, middlePost);
					 System.out.println(initialPost + " to " + finalPost);
					 puzzle(disks - 1, middlePost, initialPost, finalPost);
			 }
	 }
}