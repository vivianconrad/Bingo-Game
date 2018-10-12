
public class UserCard
	{
		static String[][] userBoard;
		
		public static void createCard ()
		{
			userBoard = new String [5][5];
			for (int i=0; i<5; i++)
				{
					for (int j =0; j<5; j++)
						{
							userBoard[i][j]="  ";
						}
				}
		}
		
		public static void display()
		{
			System.out.println("       B      I      N      G      O        ");
			System.out.println("    ------------------------------------    ");
			System.out.println("    |" + userBoard[0][0] +"|"+ userBoard[0][1] + "|" + userBoard [0][2] + "|" + userBoard[0][3] + "|" + userBoard[0][4] + "|");
			System.out.println("    ------------------------------------");
			System.out.println("    |" + userBoard[1][0] +"|"+ userBoard[1][1] + "|" + userBoard [1][2] + "|" + userBoard[1][3] + "|" + userBoard[1][4] + "|");
			System.out.println("    ------------------------------------");
			System.out.println("    |" + userBoard[2][0] +"|"+ userBoard[2][1] + "| FREE |" + userBoard[2][3] + "|" + userBoard[2][4] + "| ");
			System.out.println("    ------------------------------------");
			System.out.println("    |" + userBoard[3][0] +"|"+ userBoard[3][1] + "|" + userBoard [3][2] + "|" + userBoard[3][3] + "|" + userBoard[3][4] + "| ");
			System.out.println("    ------------------------------------");
			System.out.println("    |" + userBoard[4][0] +"|"+ userBoard[4][1] + "|" + userBoard [4][2] + "|" + userBoard[4][3] + "|" + userBoard[4][4] + "| ");
			System.out.println("    ------------------------------------");
		}
	}
