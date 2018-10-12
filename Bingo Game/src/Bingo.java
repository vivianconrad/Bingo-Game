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
				//playGame();
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
								UserCard.userBoard[i][j]= "  " + ((int)(Math.random()*90)+10) + "  ";
							}
					}
				UserCard.display();
				System.out.println(name + ", press enter to get the Jeff's card");
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
				boolean playingGame = true;
				while (playingGame)
					{
						callingNumber();
					}
			}
		public static void callingNumber()
			{
				Random generate = new Random();
			    String[] randomName = {"B", "I", "N", "G", "O"};
			    System.out.println(randomName[generate.nextInt(4)] + ((int)(Math.random()*90)+10));
			}
		
	}
