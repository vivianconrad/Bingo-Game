
public class ComputerCard
	{
				static String[][] jeffBoard;
				
				public static void createCard ()
				{
					jeffBoard = new String [5][5];
					for (int i=0; i<5; i++)
						{
							for (int j =0; j<5; j++)
								{
									jeffBoard[i][j]="  ";
								}
						}
				}
				
				public static void display()
				{
					System.out.println("       B      I      N      G      O        ");
					System.out.println("    ------------------------------------    ");
					System.out.println("    |" + jeffBoard[0][0] +"|"+ jeffBoard[0][1] + "|" + jeffBoard [0][2] + "|" + jeffBoard[0][3] + "|" + jeffBoard[0][4] + "|");
					System.out.println("    ------------------------------------");
					System.out.println("    |" + jeffBoard[1][0] +"|"+ jeffBoard[1][1] + "|" + jeffBoard [1][2] + "|" + jeffBoard[1][3] + "|" + jeffBoard[1][4] + "|");
					System.out.println("    ------------------------------------");
					System.out.println("    |" + jeffBoard[2][0] +"|"+ jeffBoard[2][1] + "| FREE |" + jeffBoard[2][3] + "|" + jeffBoard[2][4] + "| ");
					System.out.println("    ------------------------------------");
					System.out.println("    |" + jeffBoard[3][0] +"|"+ jeffBoard[3][1] + "|" + jeffBoard [3][2] + "|" + jeffBoard[3][3] + "|" + jeffBoard[3][4] + "| ");
					System.out.println("    ------------------------------------");
					System.out.println("    |" + jeffBoard[4][0] +"|"+ jeffBoard[4][1] + "|" + jeffBoard [4][2] + "|" + jeffBoard[4][3] + "|" + jeffBoard[4][4] + "| ");
					System.out.println("    ------------------------------------");
				}
	}
