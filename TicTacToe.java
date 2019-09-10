public class TicTacToe 
{
	private String[][] board; 
	public String playerXO;
	private String[] check = new String[8];


	public TicTacToe() 
	{
		board = new String[3][3];
		playerXO = "X";
		makeBoard();
	}
	
	public void makeBoard() 
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				board[i][j] = (Integer.toString(3*i+j+1));
			}
		}
	}
	
	public void showBoard() 
	{
		
		for (int i = 0; i < 3; i++) 
		{
			System.out.print("");
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(board[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public boolean boardFull() {
		boolean isFull = true;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals("1") ||
					board[i][j].equals("2") ||
					board[i][j].equals("3") ||
					board[i][j].equals("4") ||
					board[i][j].equals("5") ||
					board[i][j].equals("6") ||
					board[i][j].equals("7") ||
					board[i][j].equals("8") ||
					board[i][j].equals("9")) 
				{
					isFull = false;
				}
			}
		}
		
		return isFull;
	}
	
	public boolean checkWin() 
	{
		return (RowsWin() || 
			ColumnsWin() || 
			DiagonalsWin());
	}
	
	
	private boolean RowsWin() 
	{
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) 
				return true;
		}
		return false;
	}
	
	private boolean ColumnsWin() 
	{
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
				return true;
		}
		return false;
	}
	
	private boolean DiagonalsWin() 
	{
		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	}
	
	
	private boolean checkRowCol(String c1, String c2, String c3) 
	{
		return ((c1 == c2) && (c2 == c3));
	}
	
	public void changePlayer() 
	{
		if (playerXO == "X") 
			playerXO = "O";
		else
			playerXO = "X";
	}
	
	public boolean move(int num) 
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (board[i][j].equals(Integer.toString(num))) 
				{
					board[i][j] = playerXO;
					return true;
				} 
			}
		}		
		return false;
	}
}