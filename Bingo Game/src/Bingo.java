import java.util.Random;
import java.util.Scanner;

public class Bingo
	{
		static Scanner userInputStrings = new Scanner(System.in);
		static Scanner userInputInt = new Scanner(System.in);
		static String name;
		static int gameChoice;
		public static void main(String[] args)
			{
				//userWelcome();
				decideGameMode();
				playBingoGame();
				blackoutGame();
			}
		public static void userWelcome()
			{
				System.out.println("Hello! What's your name?");
				name = userInputStrings.nextLine();
				System.out.println("Hi " + name + "! Welcome to BINGO! Press enter for the game rules.");
				String resume = userInputStrings.nextLine();
				System.out.println("The caller will say a letter and a number.");
				System.out.println("If you have the number, then you will recieve an X.");
				System.out.println("If you get 5 X's in a row, column or diagonal, then you win.");
				System.out.println("BUT if the computer gets 5 X's first, then you lose.");
				System.out.println("Also, the computer's name is Jeff the Wonder Dog");	
				System.out.println("Press enter to continue");
				String resume2 = userInputStrings.nextLine();
			}
		public static void decideGameMode()
			{
				System.out.println("Would you like eazy, medium or hard? Press 1 for easy, 2 for medium, 3 for hard");
				System.out.println("Psst...do you want a fun secret game? Press 4!");
				gameChoice = userInputInt.nextInt();
				if (gameChoice == 1)
					{
						getEazyBingoCards();
					}
				else if (gameChoice == 2)
					{
						getMediumBingoCards();
					}
				else if (gameChoice == 3)
					{
						getHardBingoCards();
					}
				else if (gameChoice == 4)
					{
						createSecretCards();
						secretBingoGame();
					}
				else 
					{
						System.out.println("You suck");
						System.out.println("No BINGO for you");
						System.exit(0);
					}
			}
		public static void getEazyBingoCards()
			{
				gameChoice = 1;
				System.out.println(name + ", press enter to get your bingo card");
				String getCard = userInputStrings.nextLine();
				UserCard.createCard();
				UserCard.userBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int randomNumber = ((int)(Math.random()*35)+10);
								String randoNum = Integer.toString(randomNumber);
								UserCard.userBoard[i][j]=randoNum;
							}
					}
				UserCard.display();
				System.out.println(name + ", press enter to get Jeff's card");
				String jeffCard = userInputStrings.nextLine();
				ComputerCard.createCard();
				ComputerCard.jeffBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int computerNumber = ((int)(Math.random()*45)+10);
								String compNum = Integer.toString(computerNumber);
								ComputerCard.jeffBoard[i][j]= compNum;
							}
					}
				ComputerCard.display();
				System.out.println("Press enter for your first calling number!");
				String firstNum= userInputStrings.nextLine();
			}
		public static void getMediumBingoCards()
			{
				gameChoice = 2;
				System.out.println(name + ", press enter to get your bingo card");
				String getCard = userInputStrings.nextLine();
				UserCard.createCard();
				UserCard.userBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int randomNumber = ((int)(Math.random()*50)+10);
								String randoNum = Integer.toString(randomNumber);
								UserCard.userBoard[i][j]=randoNum;
							}
					}
				UserCard.display();
				System.out.println(name + ", press enter to get Jeff's card");
				String jeffCard = userInputStrings.nextLine();
				ComputerCard.createCard();
				ComputerCard.jeffBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int computerNumber = ((int)(Math.random()*60)+10);
								String compNum = Integer.toString(computerNumber);
								ComputerCard.jeffBoard[i][j]= compNum;
							}
					}
				ComputerCard.display();
				System.out.println("Press enter for your first calling number!");
				String firstNum= userInputStrings.nextLine();
			}
		public static void getHardBingoCards()
			{
				gameChoice = 3;
				System.out.println(name + ", press enter to get your bingo card");
				String getCard = userInputStrings.nextLine();
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
				String jeffCard = userInputStrings.nextLine();
				ComputerCard.createCard();
				ComputerCard.jeffBoard= new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int computerNumber = ((int)(Math.random()*90)+10);
								String compNum = Integer.toString(computerNumber);
								ComputerCard.jeffBoard[i][j]= compNum;
							}
					}
				ComputerCard.display();
				System.out.println("Press enter for your first calling number!");
				String firstNum= userInputStrings.nextLine();
			}
		public static void playBingoGame()
			{
				int callingNum = 0;
				boolean playingGame = true;
				while (playingGame)
					{
						if (gameChoice == 1)
							{
								callingNum = ((int)(Math.random()*35)+10);
							}
						if (gameChoice == 2)
							{
								callingNum = ((int)(Math.random()*50)+10);
							}
						if (gameChoice == 3)
							{
								callingNum = ((int)(Math.random()*90)+10);
							}
						System.out.println("The calling number is " + callingNum);
						String callingNumber = Integer.toString(callingNum);
						for (int i=0; i<UserCard.userBoard.length; i++)
						{
							for (int j =0; j<UserCard.userBoard[0].length; j++)
								{
									if (UserCard.userBoard[i][j].equals(callingNumber))
										{
											System.out.println("You have " + callingNumber);
											System.out.println("Your Board:");
											UserCard.userBoard[i][j] = "XX";
											UserCard.display();
										}
									if (ComputerCard.jeffBoard[i][j].equals(callingNumber))
										{
											System.out.println("Jeff has " + callingNumber);
											System.out.println("Jeff's Board:");
											ComputerCard.jeffBoard[i][j] = "XX";
											ComputerCard.display();
										}
								}
						}
						playingGame=false;
					}
				if (UserCard.isBingo()==true)
					{
						System.out.println("Do you want to continue and see if you can get a blackout?");
						String playBlackoutMaybe = userInputStrings.nextLine();
						if (playBlackoutMaybe.toLowerCase().equals("no"))
							{
								System.out.println("Thanks for playing!");
								System.exit(0);
							}
						else
							{
								System.out.println("Time to play blackout! The first to fill their Bingo card up entirely with XX wins!");
								blackoutGame();
							}
					}
				else if (ComputerCard.isBingo()==true)
					{
						System.out.println("Thanks for playing. goodbye.");
						System.exit(0);
					}
				else
					{
						System.out.println("Press enter for the next calling number");
						String nextNum= userInputStrings.nextLine();
						playBingoGame();
					}
				
			}
		public static void createSecretCards()
			{
				System.out.println(name + ", press enter to get your bingo card");
				String getCard = userInputStrings.nextLine();
				UserCard.userBoardBlank = new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								UserCard.userBoardBlank[i][j]="  ";
							}
					}
				UserCard.userBoard = new String [5][5];
				for (int i=0; i<5; i++)
					{
						for (int j =0; j<5; j++)
							{
								int randomNumber = ((int)(Math.random()*42)+10);
								String randoNum = Integer.toString(randomNumber);
								UserCard.userBoard[i][j]=randoNum;
							}
					}
				UserCard.secretMode();
				System.out.println("What? Your card is blank?");
				System.out.println("This secret mode is weird");
				System.out.println("In this mode, you don't know what numbers are on your card");
				System.out.println("Guess numbers from 10-42! If the number is on your card, it will be replaced with XX");
				}
		public static void secretBingoGame()
		{
			System.out.println("What do you want the calling number to be?");
			int callingNumber = userInputInt.nextInt();
			for (int i=0; i<UserCard.userBoard.length; i++)
				{
					for (int j =0; j<UserCard.userBoard[0].length; j++)
						{
							if (UserCard.userBoard[i][j].equals(callingNumber))
								{
									System.out.println("You have " + callingNumber);
									System.out.println("Your Board:");
									UserCard.userBoard[i][j] = "XX";
									UserCard.secretMode();
								}
//							if (ComputerCard.jeffBoard[i][j].equals(callingNumber))
//								{
//									System.out.println("Jeff has " + callingNumber);
//									System.out.println("Jeff's Board:");
//									ComputerCard.jeffBoard[i][j] = "XX";
//									ComputerCard.display();
//								}
						}
				}
			if (UserCard.isBingo()==true)
				{
					System.out.println("Do you want to continue and see if you can get a blackout?");
					String playBlackoutMaybe = userInputStrings.nextLine();
					if (playBlackoutMaybe.toLowerCase().equals("no"))
						{
							System.out.println("Thanks for playing!");
							System.exit(0);
						}
					else
						{
							System.out.println("Time to play blackout! The first to fill their Bingo card up entirely with XX wins!");
							blackoutGame();
						}
				}
//			else if (ComputerCard.isBingo()==true)
//				{
//					System.out.println("Thanks for playing. goodbye.");
//					System.exit(0);
//				}
			else
				{
					secretBingoGame();
				}
		}
		public static void blackoutGame()
			{
				int callingNum = 0;
				boolean playingGame = true;
				while (playingGame)
					{
						if (gameChoice == 1)
							{
								callingNum = ((int)(Math.random()*35)+10);
							}
						if (gameChoice == 2)
							{
								callingNum = ((int)(Math.random()*50)+10);
							}
						if (gameChoice == 3)
							{
								callingNum = ((int)(Math.random()*90)+10);
							}
						System.out.println("The calling number is " + callingNum);
						String callingNumber = Integer.toString(callingNum);
						for (int i=0; i<UserCard.userBoard.length; i++)
						{
							for (int j =0; j<UserCard.userBoard[0].length; j++)
								{
									if (UserCard.userBoard[i][j].equals(callingNumber))
										{
											System.out.println("You have " + callingNumber);
											System.out.println("Your Board:");
											UserCard.userBoard[i][j] = "XX";
											UserCard.display();
										}
									if (ComputerCard.jeffBoard[i][j].equals(callingNumber))
										{
											System.out.println("Jeff has " + callingNumber);
											System.out.println("Jeff's Board:");
											ComputerCard.jeffBoard[i][j] = "XX";
											ComputerCard.display();
										}
								}
						}
						playingGame=false;
					}
				if (UserCard.isBlackout()==true)
					{
						System.out.println("You won!");
						System.exit(0);
					}
				else if (ComputerCard.isBlackout()==true)
					{
						System.out.println("You failed!");
						System.out.println("Goodbye.");
						System.exit(0);
					}
				else
					{
						System.out.println("Press enter for the next calling number");
						String nextNum= userInputStrings.nextLine();
						blackoutGame();
					}
				
			}
	}
