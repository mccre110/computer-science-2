public class Fraction 
{
	private int num;
	private int den;
	public Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public void setDen(int den)
	{
		this.den = den;
	}
	public void displayfrac()
	{
		System.out.println(num+"/"+den);
	}
	public boolean equals(Fraction frac)
	{
		double thisDeci = this.num/this.den;
		double fracDeci = frac.num/frac.den;
		if (thisDeci == fracDeci)
			return true;
		else
			return false;
	}
}