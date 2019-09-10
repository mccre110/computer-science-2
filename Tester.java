public class Tester {
	
	

	public static void main(String[] args)
	{
		Clock clock = new Clock();
		Atomic atomic = new Atomic();
		Grand grand = new Grand();
		Stopwatch stopwatch = new Stopwatch();

		System.out.println(clock.Time());
		System.out.println(atomic.Time());
		System.out.println(grand.Time());
		System.out.println(stopwatch.Time());
	}	
}