import java.util.Scanner;
public class Ch6Ex10 
{
	

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		TicTacToe TTT = new TicTacToe();
		while (!TTT.checkWin() && !TTT.boardFull())
		{
			TTT.showBoard();
			System.out.println(TTT.playerXO +" : Turn ~ ~ ~ ~ ~");
			System.out.println("Where to move? (1-9)");
			int userInput = input.nextInt();
			System.out.println();
			TTT.move(userInput);
			TTT.changePlayer();
			System.out.println();
		}

		if (TTT.checkWin())
		{
			TTT.showBoard();
			TTT.changePlayer();
			System.out.println(TTT.playerXO +": is the winner");
		}
		else if (TTT.boardFull())
		{
			TTT.showBoard();
			System.out.println("Looks like it's a tie");
		}
	}	
}