import java.util.Scanner;
public class Student 
{
	private double quiz1Percent;
	private double quiz2Percent;
	private double quiz3Percent;
	private double quizAvg;
	private double midterm;
	private double sFinal;
	private double numericScore;
	private String letterScore;

	public void ReadInGrade()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz 1 grade:");
		quiz1Percent = (input.nextDouble())/10;
		System.out.println("Enter quiz 2 grade:");
		quiz2Percent = (input.nextDouble())/10;
		System.out.println("Enter quiz 3 grade:");
		quiz3Percent = (input.nextDouble())/10;
		System.out.println("Enter midterm grade:");
		midterm = (input.nextDouble())/100;
		System.out.println("Enter final grade:");
		sFinal = (input.nextDouble())/100;
		//input.close();
		quizAvg = (quiz1Percent+ quiz2Percent+ quiz3Percent)/3;
	}
	public void NumericGrade()
	{
		numericScore = ((.4*sFinal)+(.35*midterm)+(.25*quizAvg))*100;
	}
	public void LetterGrade()
	{
		if (numericScore >= 90) 
			letterScore = "A";
		else if (numericScore>=80)
			letterScore = "B";
		else if (numericScore>=70)
			letterScore = "C";
		else if (numericScore>=60)
			letterScore = "D";
		else
			letterScore = "F";
	}
	public void OuputGrade()
	{
		System.out.println("Quiz 1 Percent: "+ quiz1Percent*100);
		System.out.println("Quiz 2 Percent: "+ quiz3Percent*100);
		System.out.println("Quiz 3 Percent: "+ quiz3Percent*100);
		System.out.println("Midterm Percent: "+ midterm*100);
		System.out.println("Final Percent: "+ sFinal*100);
		System.out.println("Numeric Score: "+ numericScore);
		System.out.println("Letter Grade: " +letterScore);
	}
}