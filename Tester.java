//Main driver or tester
//test
public class Tester
{
	public static void main(String[] args)
	{
			Board player1 = new Board();
			
			player1.placeShip(2, 1, 1, "East");
			player1.placeShip(3, 0, 0, "South");
			player1.placeShip(3, 5, 0, "East");
			player1.placeShip(4, 9, 0, "East");
			player1.placeShip(5, 6, 4, "West");
			
			player1.printB();
	}
}
			
			
	
