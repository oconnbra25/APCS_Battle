/*//board file

//whats in the box
	//5 ships
	//carrier has 5 pegs
	
	//2 boards
		//rows and columns
		//10x10
		//letters down the side
		//numbers across the top
	//2 colored set of pegs
	*/


public class Board
{
	int[][] boardShips;
	int[][] boardNotes;
	
	public Board()
	{
		boardShips = new int[10][10];
		boardNotes = new int[10][10];
		/*
		int[][] boardShips = 
		{ 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int[][] boardNotes = 
		{ 
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		*/
	}
	
	//take in length, start, and direction
	public boolean placeShip(int len, int sr, int sc, String drctn)
	{
		if (drctn.equals("North"))
		{
			if (boardShips[sr][sc] == 0)
			{
				for (int x = 0; x < len; x++)
				{
					if (boardShips[(sr + x)][sc] == 0)
					{
						boardShips[(sr + x)][sc] = 1;
					}
					else
					{
						return false;
					}
					return true;
				}
			}
			else
			{
				return false;
			}
		}
		else if (drctn.equals("East"))
		{
			if (boardShips[sr][sc] == 0)
			{
				for (int x = 0; x < len; x++)
				{
					if (boardShips[sr][(sc + x)] == 0)
					{
						boardShips[sr][(sc + x)] = 1;
					}
					else
					{
						return false;
					}
					return true;
				}
			}
			else
			{
				return false;
			}
		else if (drctn.equals("South"))
		{
			if (boardShips[sr][sc] == 0)
			{
				for (int x = 0; x < len; x++)
				{
					if (boardShips[(sr - x)][sc] == 0)
					{
						boardShips[(sr - x)][sc] = 1;
					}
					else
					{
						return false;
					}
					return true;
				}
			}
			else
			{
				return false;
			}
		}
		else if (drctn.equals("West"))
		{
			if (boardShips[sr][sc] == 0)
			{
				for (int x = 0; x < len; x++) //change this to check every space before placing anything
				{
					if (boardShips[sr][(sc - x)] == 0)
					{
						boardShips[sr][(sc - x)] = 1;
					}
					else
					{
						return false;
					}
					return true;
				}
			}
			else
			{
				return false;
			}
		}
	}
	
	public void printB()
	{
		int r = 0;
		int c = 0;
		
		System.out.print("\n_____________________");
		System.out.print("\n\n     Your Ships:");
		//making the printout for your ships
		System.out.print("\n# A B C D E F G H I J");
		while (r < 10)
		{
			System.out.print("\n" + r + "|"); //prints the lft side of the column to show what row its in and moves the row down
			
			while (c < 10)
			{
				System.out.print(boardShips[r][c] + " ");
				c++;
			}
			
			r++;
			c = 0;
		}
		r = 0;
		System.out.print("\n_____________________");
		System.out.print("\n\n     Your Notes:");
		//making the printout for your notes
		System.out.print("\n# A B C D E F G H I J");
		while (r < 10)
		{
			System.out.print("\n" + r + "|"); //prints the lft side of the column to show what row its in and moves the row down
			
			while (c < 10)
			{
				System.out.print(boardNotes[r][c] + " ");
				c++;
			}
			
			r++;
			c = 0;
		}
		r = 0;
	}
}
		
	/*	
	public boolean checkShip(int r, int c, int[][] boardShips)
	{
		if (boardShips[r][c] == 1) //one is currently a placeholder for a value that indicates whether or not the ship is there
		{
			return true;
		}
		else
		{
			return false;
		}
	}
*/
