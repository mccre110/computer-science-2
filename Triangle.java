public class Triangle extends Figure
{
	public void erase()
	{
		System.out.println("Triangle - erase");
	}
	public void draw()
	{
		System.out.println("Triangle - draw");
	}
	public void center()
	{
		erase();
		draw();
		System.out.println("center");
	}
}