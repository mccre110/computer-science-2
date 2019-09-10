
public class Ch12Ex4 {
	
	

	public static void main(String[] args)
	{
		Thread myrunnable = new Thread(new CounterController(1,5),"T");
		myrunnable.start();

	}	
}