import java.util.ArrayList;
public class Player 
{
	public ArrayList<Card> playerCards = new ArrayList<Card>();
	private int playerNumber;
	private Deck deck = new Deck();
	private boolean[] warArray = new boolean[2];

	public Player(int playerNumber)
	{
		this.playerNumber = playerNumber;
		for (int i=1;i<27;i++) 
		{
			playerCards.add(deck.Deal());
		}
	}
	public Card flip()
	{
		Card card = new Card();
		if (playerCards.size()!=0) 
		{
			card = playerCards.get(0);
			playerCards.remove(0);
		}
		return card;
				
	}
	public void collect(Card cardOne, Card cardTwo)
	{
		playerCards.add(cardOne);
		playerCards.add(cardTwo);

	}
	public void collect(Card cardOne)
	{
		playerCards.add(cardOne);
	}
	public boolean hasWon()
	{
		if (playerCards.size() == 52)
			return true;
		else
			return false;
	}
	public boolean[] war(Player playerOne, Player playerTwo)
	{
		ArrayList<Card> warCards = new ArrayList<Card>();
		if (playerOne.playerCards.size()>4 && playerTwo.playerCards.size()>4)
		{
			for (int i=1;i<4;i++) 
			{
				warCards.add(playerOne.flip());
				warCards.add(playerTwo.flip());
			}
		}
		else if (playerTwo.playerCards.size()<4) 
		{
			for (int i=1;i<4;i++) 
			{
				warCards.add(playerOne.flip());
			}
			for (int i=1;i<playerTwo.playerCards.size();i++) 
			{
				warCards.add(playerTwo.flip());
			}
		}
		else
		{
			for (int i=1;i<4;i++) 
				warCards.add(playerTwo.flip());
			for (int i=1;i<playerOne.playerCards.size();i++) 
				warCards.add(playerOne.flip());
		}
		
		Card cardPlayerOne = playerOne.flip();
		Card cardPlayerTwo = playerTwo.flip();

		if (cardPlayerOne.numValue> cardPlayerTwo.numValue)
		{
			playerOne.collect(cardPlayerTwo, cardPlayerOne);
			for (int i=0;i<warCards.size();i++) 
				playerOne.collect(warCards.get(i));
			return new boolean[] {true, false};
		}
		else if (cardPlayerOne.numValue< cardPlayerTwo.numValue)
		{
			playerTwo.collect(cardPlayerOne, cardPlayerTwo);
			for (int i=0;i<warCards.size();i++) 
				playerTwo.collect(warCards.get(i));
			return new boolean[] {false, false};
		}
		else
			return new boolean[] {false, true};

	}
}