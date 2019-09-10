public class Temperature 
{
	private double temp;
	private char scale;

	public Temperature(double temp)
	{
		this.temp = temp;
		scale = 'C';
	}

	public Temperature(char scale)
	{
		 temp = 0;
		 this.scale = scale;
	}

	public Temperature(double temp, char scale)
	{
		 this.temp = temp;
		 this.scale = scale;
	}

	public Temperature()
	{
		 temp = 0;
		 scale = 'C';
	}
	public double getTempF(double temp)
	{
	 	double tempF = (temp*9/5) + 32;
	 	return  tempF;
	}
	public double getTempC(double temp)
	{
	 	double tempC = (temp-32)*5/9;
	 	return  tempC;
	}
	public void setTemp(double temp)
	{
		this.temp = temp;
	} 
	public void setScale(char scale)
	{
		this.scale = scale;
	}
	public void setTempAndScale(double temp, char scale)
	{
		this.temp = temp;
		this.scale = scale;
	}
	public boolean equals(Temperature tempPassed)
	{
		if (tempPassed.scale == this.scale)
			return(tempPassed.temp == this.temp);

		if (tempPassed.scale == 'F' && this.scale =='C')
		{
			double thisTemp = getTempF(this.temp);
			return(tempPassed.temp == thisTemp);
		}

		else if (tempPassed.scale == 'C' && this.scale =='F') 
		{
			double thisTemp = getTempC(this.temp);
			return(tempPassed.temp == thisTemp);
		}
		else
		{
			System.out.println("Error Comparison");
			return false;
		}
	}
	public boolean greaterThan(Temperature tempPassed)
	{
		if (tempPassed.scale == this.scale)
			return(tempPassed.temp < this.temp);

		else if (tempPassed.scale == 'F' && this.scale =='C') 
			return(tempPassed.temp < getTempF(this.temp));

		else if (tempPassed.scale == 'C' && this.scale =='F') 
			return(tempPassed.temp < getTempC(this.temp));
		else
		{
			System.out.println("Error Comparison");
			return false;
		}
	}
	public boolean lesserThan(Temperature tempPassed)
	{
		if (tempPassed.scale == this.scale)
			return(tempPassed.temp < this.temp);

		else if (tempPassed.scale == 'F' && this.scale =='C') 
			return(tempPassed.temp < getTempF(this.temp));

		else if (tempPassed.scale == 'C' && this.scale =='F') 
			return(tempPassed.temp < getTempC(this.temp));
		else
		{
			System.out.println("Error Comparison");
			return false;
		}
	}
	public String toString()
	{
		return (this.temp+ " "+this.scale);
	}

}