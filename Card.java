public class Card 
{
	private String value;
	private String suit;
	public int numValue;

	public Card()
	{
		value = "";
		suit = "";
	}
	public void setValue(String value)
	{
		if (value.equals("11")) 
			this.value = "J";
		else if (value.equals("12")) 
			this.value = "Q";
		else if (value.equals("13")) 
			this.value = "K";
		else if (value.equals("14")) 
			this.value = "A";
		else
			this.value = value;
	}
	public void setSuit(String suit)
	{
		if (suit.equals("1")) 
			this.suit = "hearts";
		else if (suit.equals("2")) 
			this.suit = "spades";
		else if (suit.equals("3")) 
			this.suit = "clubs";
		else if (suit.equals("4"))
			this.suit = "diamonds";
		else 
			this.suit = suit;
	}
	public void setNumValue(int numValue)
	{
		this.numValue = numValue;
	}	
	public String getCard()
	{
		return (value+" of "+suit);
	}
}