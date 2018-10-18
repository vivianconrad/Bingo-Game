
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
					System.out.println("    |  " + jeffBoard[0][0] +"  |  "+ jeffBoard[0][1] + "  |  " + jeffBoard [0][2] + "  |  " + jeffBoard[0][3] + "  |  " + jeffBoard[0][4] + "  |");
					System.out.println("    ------------------------------------");
					System.out.println("    |  " + jeffBoard[1][0] +"  |  "+ jeffBoard[1][1] + "  |  " + jeffBoard [1][2] + "  |  " + jeffBoard[1][3] + "  |  " + jeffBoard[1][4] + "  |");
					System.out.println("    ------------------------------------");
					System.out.println("    |  " + jeffBoard[2][0] +"  |  "+ jeffBoard[2][1] + "  | FREE |  " + jeffBoard[2][3] + "  |  " + jeffBoard[2][4] + "  | ");
					System.out.println("    ------------------------------------");
					System.out.println("    |  " + jeffBoard[3][0] +"  |  "+ jeffBoard[3][1] + "  |  " + jeffBoard [3][2] + "  |  " + jeffBoard[3][3] + "  |  " + jeffBoard[3][4] + "  | ");
					System.out.println("    ------------------------------------");
					System.out.println("    |  " + jeffBoard[4][0] +"  |  "+ jeffBoard[4][1] + "  |  " + jeffBoard [4][2] + "  |  " + jeffBoard[4][3] + "  |  " + jeffBoard[4][4] + "  | ");
					System.out.println("    ------------------------------------");
				}
				
				public static boolean isBingo()
					{
						if ((jeffBoard[0][0].equals(jeffBoard[0][1]) && jeffBoard[0][1].equals(jeffBoard[0][2]) && jeffBoard[0][2].equals(jeffBoard[0][3]) && jeffBoard[0][3].equals(jeffBoard[0][4]) && !jeffBoard[0][1].equals("  ")) ||
							(jeffBoard[1][0].equals(jeffBoard[1][1]) && jeffBoard[1][1].equals(jeffBoard[1][2]) && jeffBoard[1][2].equals(jeffBoard[1][3]) && jeffBoard[1][3].equals(jeffBoard[1][4]) && !jeffBoard[1][1].equals("  ")) ||
							(jeffBoard[2][0].equals(jeffBoard[2][1]) && jeffBoard[2][1].equals(jeffBoard[2][3]) && jeffBoard[2][3].equals(jeffBoard[2][4]) && !jeffBoard[2][1].equals("  ")) ||
							(jeffBoard[3][0].equals(jeffBoard[3][1]) && jeffBoard[3][1].equals(jeffBoard[3][2]) && jeffBoard[3][2].equals(jeffBoard[3][3]) && jeffBoard[3][3].equals(jeffBoard[3][4]) && !jeffBoard[3][1].equals("  ")) ||
							(jeffBoard[4][0].equals(jeffBoard[4][1]) && jeffBoard[4][1].equals(jeffBoard[4][2]) && jeffBoard[4][2].equals(jeffBoard[4][3]) && jeffBoard[4][3].equals(jeffBoard[4][4]) && !jeffBoard[4][1].equals("  ")) ||
							//across
							(jeffBoard[0][0].equals(jeffBoard[1][0]) && jeffBoard[1][0].equals(jeffBoard[2][0]) && jeffBoard[2][0].equals(jeffBoard[3][0]) && jeffBoard[3][0].equals(jeffBoard[4][0]) && !jeffBoard[1][0].equals("  ")) ||
							(jeffBoard[0][1].equals(jeffBoard[1][1]) && jeffBoard[1][1].equals(jeffBoard[2][1]) && jeffBoard[2][1].equals(jeffBoard[3][1]) && jeffBoard[3][1].equals(jeffBoard[4][1]) && !jeffBoard[1][1].equals("  ")) ||
							(jeffBoard[0][2].equals(jeffBoard[1][2]) && jeffBoard[1][2].equals(jeffBoard[2][2]) && jeffBoard[2][2].equals(jeffBoard[3][2]) && jeffBoard[3][2].equals(jeffBoard[4][2]) && !jeffBoard[1][2].equals("  ")) ||
							(jeffBoard[0][3].equals(jeffBoard[1][3]) && jeffBoard[1][3].equals(jeffBoard[2][3]) && jeffBoard[2][3].equals(jeffBoard[3][3]) && jeffBoard[3][3].equals(jeffBoard[4][3]) && !jeffBoard[1][3].equals("  ")) ||
							(jeffBoard[0][4].equals(jeffBoard[1][4]) && jeffBoard[1][4].equals(jeffBoard[2][4]) && jeffBoard[2][4].equals(jeffBoard[3][4]) && jeffBoard[3][4].equals(jeffBoard[4][4]) && !jeffBoard[1][4].equals("  ")) ||
							//down
							(jeffBoard[0][0].equals(jeffBoard[1][1]) && jeffBoard[1][1].equals(jeffBoard[3][3]) && jeffBoard[3][3].equals(jeffBoard[4][4]) && !jeffBoard[0][1].equals("  ")) ||
							(jeffBoard[0][4].equals(jeffBoard[1][3]) && jeffBoard[1][3].equals(jeffBoard[3][1]) && jeffBoard[3][1].equals(jeffBoard[4][0]) && !jeffBoard[0][1].equals("  ")))
							//diagonal 
							{
								System.out.println("Jeff has a Bingo!");
								System.out.println("Good game! You failed to beat the computer");
								System.exit(0);
								return true;
							}
						return false;
					}
				public static boolean isBlackout()
					{
						if ((jeffBoard[0][0].equals(jeffBoard[0][1]) && jeffBoard[0][1].equals(jeffBoard[0][2]) && jeffBoard[0][2].equals(jeffBoard[0][3]) && jeffBoard[0][3].equals(jeffBoard[0][4]) && !jeffBoard[0][1].equals("  ")) &&
								(jeffBoard[1][0].equals(jeffBoard[1][1]) && jeffBoard[1][1].equals(jeffBoard[1][2]) && jeffBoard[1][2].equals(jeffBoard[1][3]) && jeffBoard[1][3].equals(jeffBoard[1][4]) && !jeffBoard[1][1].equals("  ")) &&
								(jeffBoard[2][0].equals(jeffBoard[2][1]) && jeffBoard[2][1].equals(jeffBoard[2][3]) && jeffBoard[2][3].equals(jeffBoard[2][4]) && !jeffBoard[2][1].equals("  ")) ||
								(jeffBoard[3][0].equals(jeffBoard[3][1]) && jeffBoard[3][1].equals(jeffBoard[3][2]) && jeffBoard[3][2].equals(jeffBoard[3][3]) && jeffBoard[3][3].equals(jeffBoard[3][4]) && !jeffBoard[3][1].equals("  ")) &&
								(jeffBoard[4][0].equals(jeffBoard[4][1]) && jeffBoard[4][1].equals(jeffBoard[4][2]) && jeffBoard[4][2].equals(jeffBoard[4][3]) && jeffBoard[4][3].equals(jeffBoard[4][4]) && !jeffBoard[4][1].equals("  ")) &&
								//across
								(jeffBoard[0][0].equals(jeffBoard[1][0]) && jeffBoard[1][0].equals(jeffBoard[2][0]) && jeffBoard[2][0].equals(jeffBoard[3][0]) && jeffBoard[3][0].equals(jeffBoard[4][0]) && !jeffBoard[1][0].equals("  ")) &&
								(jeffBoard[0][1].equals(jeffBoard[1][1]) && jeffBoard[1][1].equals(jeffBoard[2][1]) && jeffBoard[2][1].equals(jeffBoard[3][1]) && jeffBoard[3][1].equals(jeffBoard[4][1]) && !jeffBoard[1][1].equals("  ")) &&
								(jeffBoard[0][2].equals(jeffBoard[1][2]) && jeffBoard[1][2].equals(jeffBoard[2][2]) && jeffBoard[2][2].equals(jeffBoard[3][2]) && jeffBoard[3][2].equals(jeffBoard[4][2]) && !jeffBoard[1][2].equals("  ")) &&
								(jeffBoard[0][3].equals(jeffBoard[1][3]) && jeffBoard[1][3].equals(jeffBoard[2][3]) && jeffBoard[2][3].equals(jeffBoard[3][3]) && jeffBoard[3][3].equals(jeffBoard[4][3]) && !jeffBoard[1][3].equals("  ")) &&
								(jeffBoard[0][4].equals(jeffBoard[1][4]) && jeffBoard[1][4].equals(jeffBoard[2][4]) && jeffBoard[2][4].equals(jeffBoard[3][4]) && jeffBoard[3][4].equals(jeffBoard[4][4]) && !jeffBoard[1][4].equals("  ")) &&
								//down
								(jeffBoard[0][0].equals(jeffBoard[1][1]) && jeffBoard[1][1].equals(jeffBoard[3][3]) && jeffBoard[3][3].equals(jeffBoard[4][4]) && !jeffBoard[0][1].equals("  ")) &&
								(jeffBoard[0][4].equals(jeffBoard[1][3]) && jeffBoard[1][3].equals(jeffBoard[3][1]) && jeffBoard[3][1].equals(jeffBoard[4][0]) && !jeffBoard[0][1].equals("  ")))
								//diagonal 
								{
									System.out.println("Jeff got a blackout!");
									System.out.println("Congrats, you failed to beat the computer!");
									return true;
								}
						return false;
					}
	}
