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
		if (sr > 9 || sc > 9)
		{
			return false;
		}
		if (drctn.equals("North"))
		{
			if (boardShips[sr][sc] == 0)
			{
				for (int x = 0; x < len; x++)
				{
					if ((boardShips[(sr + x)][sc] != 0) || ((sr + x) > 9))
					{
						return false;
					}
				}
				for (int x = 0; x < len; x++)
				{
						boardShips[(sr + x)][sc] = 1;
				}
				return true;
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
					if (boardShips[sr][(sc + x)] != 0  || ((sc + x) > 9))
					{
						return false;
					}
				}
				for (int x = 0; x < len; x++)
				{
						boardShips[sr][(sc + x)] = 1;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
		else if (drctn.equals("South"))
		{
			if (boardShips[sr][sc] == 0)
			{
				for (int x = 0; x < len; x++)
				{
					if (boardShips[(sr + x)][sc] != 0  || ((sr - x) > 9))
					{
						return false;
					}
				}
				for (int x = 0; x < len; x++)
				{
						boardShips[(sr + x)][sc] = 1;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
		else if (drctn.equals("West"))  //takes in direction that the player wants to place it
		{
			if (boardShips[sr][sc] == 0)  //checks to see if there is nothing there
			{
				for (int x = 0; x < len; x++)  //this loop runs through to check that there isnt something else already in the place
				{
					if (boardShips[sr][(sc - x)] != 0  || ((sc - x) > 9)) //checks to see if its out of bounds or if something is not equal to 0
					{
						return false;
					}
				}
				for (int x = 0; x < len; x++) //this loop places the ship, if nothing else fails it will print the ship
				{
					boardShips[sr][(sc - x)] = 1;
				}
				return true;
			}
			else
			{
				return false; //if something is in the starting spot it'll return false
			}
		}
		return true;
	}
	
	public void printB()
	{
		int r = 0;  //row
		int c = 0;  //column
		
		System.out.print("\n_____________________");  //spacer
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
		System.out.print("\n_____________________");  //spacer
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
