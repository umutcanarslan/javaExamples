package Games;

import java.util.Random;
import java.util.Scanner;

public class rpsGame {
	
	

	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int robot = random.nextInt(3) + 1; //rock(1), paper(2), scissors(3)
		int choice1;
		int choice2;
		int newgame;
		System.out.println("Welcome to Game");
		
		while (true)	{
			
			while(true)	{
				System.out.println("What is yor choice ? ROCK[1] PAPER[2] SCISSORS[3]");
				choice1 = input.nextInt();
				
				if (choice1 == 1)	{
					System.out.println("Your choice of 'ROCK'");
				}
				else if (choice1 == 2)	{
					System.out.println("Your choice of 'PAPER'");
				}
				else if (choice1 == 3)	{
					System.out.println("Your choice of 'SCISSORS'");
				}
				else	{
					System.out.println("Wrong choice !");
				}
				
				System.out.println("Yes[1] No, start the game[2]");
				choice2 = input.nextInt();
	
				if (choice2 == 1)	{
					System.out.println();
				}
				else
				{
				break;
				}
			}
			if (choice1 == 1 && robot == 1)	{
				System.out.println("DRAW ! Your opponent's choice = ROCK");
			}
			else if (choice1 == 2 && robot == 2)	{
				System.out.println("DRAW ! Your opponent's choice = PAPER");
			}
			else if (choice1 == 3 && robot == 3)	{
				System.out.println("DRAW ! Your opponent's choice = SCISSORS");
			}
			else if (choice1 == 1 && robot == 3)	{
				System.out.println("You WIN ! Your opponent's choice = SCISSORS");
			}
			else if (choice1 == 2 && robot == 1)	{
				System.out.println("You WIN ! Your opponent's choice = ROCK");
			}
			else if (choice1 == 3 && robot == 2)	{
				System.out.println("You WIN ! Your opponent's choice = PAPER");
			}
			else if (choice1 == 1 && robot == 2)	{
				System.out.println("You DEFEATED ! Your opponent's choice = PAPER");
			}
			else if (choice1 == 2 && robot == 3)	{
				System.out.println("You DEFEATED ! Your opponent's choice = SCISSORS");
			}
			else if (choice1 == 3 && robot == 1)	{
				System.out.println("You DEFEATED ! Your opponent's choice = ROCK");
			}
			
			System.out.println();
			System.out.println("Would you like to play again ? YES[1] NO[2]");
			newgame = input.nextInt();
			
			if (newgame == 1)	{
				System.out.println();
			}
			else	{
				break;
			}
		}
	}
}