import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bingo
	{
		static Scanner userInputStrings = new Scanner(System.in);
		static Scanner userInputInt = new Scanner(System.in);
		static String name;
		static int gameChoice;
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		
		public static void main(String[] args)
			{
				//userWelcome();
				decideGameMode();
				playBingoGame();
				blackoutGame();
			}
		public static void userWelcome()
			{
				name = JOptionPane.showInputDialog("What is your name?");  
				JOptionPane.showMessageDialog(frame, "Hi, " + name + "! Welcome to BINGO!");
				
				JOptionPane.showMessageDialog(frame, "The caller will say a letter and a number. If you have the number, then you will recieve an X. If you get 5 X's in a row, column or diagonal, then you win. Also, the computer's name is Jeff the Wonder Dog. ");
			}
		public static void decideGameMode()
			{
				Object[] options = {"Eazy", "Medium", "Hard", "Secret"};
				gameChoice = JOptionPane.showOptionDialog(frame, "Would you like eazy, medium or hard??",
						"Game Option",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[0]);
				
				if (gameChoice == 0)
					{
						JOptionPane.showMessageDialog(frame, name + ", taking the easy way out? Well okay then...");
						getEazyBingoCards();
					}
				else if (gameChoice == 1)
					{
						JOptionPane.showMessageDialog(frame, "Medium is the way to go...if you're ordering a steak");
						getMediumBingoCards();
					}
				else if (gameChoice == 2)
					{
						JOptionPane.showMessageDialog(frame, "Hard mode? Now we're talking...");
						getHardBingoCards();
					}
				else if (gameChoice == 3)
					{
						JOptionPane.showMessageDialog(frame, "Secret mode? What's this?");
						createSecretCards();
						secretBingoGame();
					}
				else 
					{
						JOptionPane.showMessageDialog(frame, "You suck");
						System.exit(0);
					}
			}
		public static void getEazyBingoCards()
			{
				gameChoice = 1;
				JOptionPane.showMessageDialog(frame, name + ", I guess you want your bingo card then");
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
				System.out.println("Your Bingo Card");
				UserCard.display();
				JOptionPane.showMessageDialog(frame, "It might be helpful to get Jeff's card");
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
				System.out.println("Jeff's Bingo Card");
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
