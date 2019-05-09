package Games;

import java.util.Scanner;
import java.util.Random;

public class diceGame {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int dice;
		int control;
		
		while(true)
		{
			dice = random.nextInt(6) + 1;
			
			System.out.println("Do you want to throw a dice ? YES[1] NO[2]");
			control = input.nextInt();
			
			if(control == 1)
			{
				System.out.println("The value of your dice = " + dice);
				System.out.println();
			}
			else if(control == 2)
			{
				System.out.println("OK. Have a nice day :)");
				break;
			}
			else
			{
				System.out.println("Wrong Choice :(");
				System.out.println();
			}
		}

	}

}