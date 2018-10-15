import java.util.Random;
import java.util.Scanner;

public class Bingo
	{
		static Scanner userInput = new Scanner(System.in);
		static String name;
		public static void main(String[] args)
			{
				//userWelcome();
				getBingoCards();
				playGame();
			}
		public static void userWelcome()
			{
				System.out.println("Hello! What's your name?");
				name = userInput.nextLine();
				System.out.println("Hi " + name + "! Welcome to BINGO! Press enter for the game rules.");
				String resume = userInput.nextLine();
				System.out.println("The caller will say a letter and a number.");
				System.out.println("If you have the number, then you will recieve an X.");
				System.out.println("If you get 5 X's in a row, column or diagonal, then you win.");
				System.out.println("BUT if the computer gets 5 X's first, then you lose.");
				System.out.println("Also, the computer's name is Jeff the Wonder Dog");
			}
		public static void getBingoCards()
			{
				System.out.println(name + ", press enter to get your bingo card");
				String getCard = userInput.nextLine();
				UserCard.createCard();
				UserCard.userBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int randomNumber = ((int)(Math.random()*90)+10);
								String randoNum = Integer.toString(randomNumber);
								UserCard.userBoard[i][j]=randoNum;
							}
					}
				UserCard.display();
				System.out.println(name + ", press enter to get Jeff's card");
				String jeffCard = userInput.nextLine();
				ComputerCard.createCard();
				ComputerCard.jeffBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								ComputerCard.jeffBoard[i][j]= "  " + ((int)(Math.random()*90)+10) + "  ";
							}
					}
				ComputerCard.display();
			}
		public static void playGame()
			{
				int callingNum = ((int)(Math.random()*90)+10);
				boolean playingGame = true;
				while (playingGame)
					{
						System.out.println(callingNum);
						String callingNumber = Integer.toString(callingNum);
						for (int i=0; i<UserCard.userBoard.length; i++)
						{
							for (int j =0; j<UserCard.userBoard[0].length; j++)
								{
//									System.out.println(UserCard.userBoard[i][j]);
//									System.out.println(callingNumber);
									if (UserCard.userBoard[i][j].equals(callingNumber))
										{
											System.out.println("You have " + callingNumber);
										}
									if (ComputerCard.jeffBoard[i][j].equals(callingNumber))
										{
											System.out.println("Jeff has " + callingNumber);
										}
									else
										{
											System.out.println("you dont have it");
										}
								}
						}
						playingGame=false;
					}
			}
		public void isBingo(char[][] array,char g)
			{
				boolean bingo = false;
				int countB=0;
				for(int i=0;i<array.length;i++)
					{
						for(int j=0;j<=i;j++)
							{
								if(array[0][j]==g&&array[1][j]==g&&array[2][j]==g&&array[3][j]==g&&array[4][j]==g)
									{
										bingo = true;
										countB++;
									}
								else if(array[i][0]==g&&array[i][1]==g&&array[i][2]==g&&array[i][3]==g&&array[i][4]==g)
									{
										bingo = true;
										countB++;
									}
								else if(array[0][0]==g&&array[1][1]==g&&array[2][2]==g&&array[3][3]==g&&array[4][4]==g)
									{
										bingo =true;
										countB++;
									}
								else if(array[0][4]==g&&array[1][3]==g&&array[2][2]==g&&array[3][1]==g&&array[4][0]==g)
									{
										bingo= true;
										countB++;
									}
								else
									{
										bingo = false;
									}
							}
					}  
		}
		public static void callingNumber()
			{
				Random generate = new Random();
			    String[] randomName = {"B", "I", "N", "G", "O"};
			    System.out.println(randomName[generate.nextInt(4)] + ((int)(Math.random()*90)+10));
			}
		
	}
