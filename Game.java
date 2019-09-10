public class Game
{
	private Player playerOne = new Player(1);
	private Player playerTwo = new Player(2);
	private int battleCount = 0;
	private int warCount = 0;
	private int doubleWarCount = 0;
	private boolean[] warArray;

	public void play()
	{
		while (!playerOne.hasWon() && !playerTwo.hasWon())
		{	
			Card cardPlayerOne = playerOne.flip();
			Card cardPlayerTwo = playerTwo.flip();

			if (cardPlayerOne.numValue> cardPlayerTwo.numValue)
			{
				playerOne.collect(cardPlayerTwo, cardPlayerOne);
				battleCount++;
			}
			else if (cardPlayerOne.numValue< cardPlayerTwo.numValue)
			{
				playerTwo.collect(cardPlayerOne, cardPlayerTwo);
				battleCount++;
			}
			else if (playerOne.playerCards.size()!=0 && playerTwo.playerCards.size()!=0) 
			{
				while (!playerOne.hasWon() && !playerTwo.hasWon())
				{
					warArray = playerOne.war(playerOne, playerTwo);
					if (warArray[1] == false)
					{
						warCount++;
						break;
					}
					else
					{
						doubleWarCount++;
						continue;
					}
				}
				if (warArray[0] == true) 
					playerOne.collect(cardPlayerOne, cardPlayerTwo);
				else if (warArray[0] == false) 
					playerTwo.collect(cardPlayerOne, cardPlayerTwo);
			}
			else
				break;

		}
	}
	public int getBattleCount()
	{
		return battleCount;
	}
	public int getWarCount()
	{
		return warCount;
	}
	public int getDoubleWarCount()
	{
		return doubleWarCount;
	}
}