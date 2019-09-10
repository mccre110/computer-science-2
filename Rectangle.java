import java.lang.Math;
public class Rectangle implements Shape
{
	private int height;
	private int width;
	public Rectangle(int height, int width)
	{
		setWidth(width);
		setHeight(height);
	}
	public double area()
	{
		return (width*height);
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
}