import java.lang.Math;
public class Circle implements Shape
{
	private int rad;
	public Circle(int rad)
	{
		setRad(rad);
	}
	public double area()
	{
		return (2*Math.PI*(Math.pow(rad,2)));
	}
	public int getRad()
	{
		return rad;
	}
	public void setRad(int rad)
	{
		this.rad = rad;
	}
}