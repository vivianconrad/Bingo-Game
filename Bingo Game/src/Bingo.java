
public class Bingo
	{
		public static void main(String[] args)
			{
				BingoCard.createCard();
				BingoCard.display();
				randomCard();
				System.out.println((int)(Math.random()*90)+10);
			}
		public static void randomCard()
		{
//			BingoCard.grid = new String [5][5];
//			for (int i=0; i<5; i++)
//				{
//					for (int j =0; j<5; j++)
//						{
//							BingoCard.grid[i][j];
//						}
//				}
		}
		
	}
