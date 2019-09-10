import java.util.Random;
import java.util.ArrayList;
public class Deck 
{
	public ArrayList<Card> cardList = new ArrayList<Card>();

	public Deck()
	{
		for (int i=1;i<5;i++)
			for (int x=2;x<15;x++)
			{
				Card card = new Card();
				card.setSuit(Integer.toString(i));
				card.setValue(Integer.toString(x));
				card.setNumValue(x);
				cardList.add(card);
			}		
	}

	public Card Deal()
	{
   		Random rn = new Random();
		int i = rn.nextInt(cardList.size());
		Card card = cardList.get(i);
		cardList.remove(i);
	   	return (card);
	}
}