//board file

//whats in the box
	//5 ships
	//carrier has 5 pegs
	
	//2 boards
		//rows and columns
		//10x10
		//letters down the side
		//numbers across the top
	//2 colored set of pegs


public class Board
{
	int[][] boardShips = new int[10][10];
	int[][] boardNotes = new int[10][10];
	
	public void toString(int[][] boardShips, int[][] boardNotes)
	{
		int r = 0;
		int c = 0;
		
		//making the printout for your ships
		System.out.println("# A B C D E F G H I J");
		while (r < 10)
		{
			System.out.print("\n" + r + " "); //prints the lft side of the column to show what row its in and moves the row down
			
			while (c < 10)
			{
				System.out.print(boardShips[r][c] + " ");
				c++;
			}
			
			r++;
			c = 0;
		}
		
		//making the printout for your notes
		System.out.println("# A B C D E F G H I J");
		while (r < 10)
		{
			System.out.print("\n" + r + " "); //prints the lft side of the column to show what row its in and moves the row down
			
			while (c < 10)
			{
				System.out.print(boardNotes[r][c] + " ");
				c++;
			}
			
			r++;
			c = 0;
		}
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
