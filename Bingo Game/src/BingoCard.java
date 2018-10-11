
public class BingoCard
	{
		static String[][] grid;
		
		public static void createCard ()
		{
			grid = new String [5][5];
			for (int i=0; i<5; i++)
				{
					for (int j =0; j<5; j++)
						{
							grid[i][j]="  ";
						}
				}
		}
		
		public static void display()
		{
			System.out.println("       B      I      N      G      O        ");
			System.out.println("    ------------------------------------    ");
			System.out.println("    |  " + grid[0][0] +"  |  "+ grid[0][1] + "  |  " + grid [0][2] + "  |  " + grid[0][3] + "  |  " + grid[0][4] + "  | ");
			System.out.println("    ------------------------------------");
			System.out.println("    |  " + grid[1][0] +"  |  "+ grid[1][1] + "  |  " + grid [1][2] + "  |  " + grid[1][3] + "  |  " + grid[1][4] + "  | ");
			System.out.println("    ------------------------------------");
			System.out.println("    |  " + grid[2][0] +"  |  "+ grid[2][1] + "  |  " + grid [2][2] + "  |  " + grid[2][3] + "  |  " + grid[2][4] + "  | ");
			System.out.println("    ------------------------------------");
			System.out.println("    |  " + grid[3][0] +"  |  "+ grid[3][1] + "  |  " + grid [3][2] + "  |  " + grid[3][3] + "  |  " + grid[3][4] + "  | ");
			System.out.println("    ------------------------------------");
			System.out.println("    |  " + grid[4][0] +"  |  "+ grid[4][1] + "  |  " + grid [4][2] + "  |  " + grid[4][3] + "  |  " + grid[4][4] + "  | ");
			System.out.println("    ------------------------------------");
		}
	}
