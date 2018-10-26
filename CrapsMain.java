/**
 * jane Schneider
 * Craps
 * Period 6
 */
import java.util.Scanner;

public class CrapsMain 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Craps jane = new Craps();
		Craps mae = new Craps();
		
		boolean playAgain = true;
		
		while(playAgain)
		{
	
		System.out.println("Welcome to the game Craps! Press enter to play.");
		scan.nextLine();
		System.out.println("press enter to roll your die.");
		scan.nextLine();
		
//first roll, PT 1
		
		int firstRoll = jane.roll();
		int secondRoll = mae.roll();
		int roll = firstRoll + secondRoll;
		System.out.println("first roll: " + roll);
		
//dice print roll 1		
		if(firstRoll == 1)
		{
			System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
		}
		else if(firstRoll == 2)
		{
			System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
		}
		else if(firstRoll == 3)
		{
			System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
		}
		else if(firstRoll == 4)
		{
			System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
		}
		else if(firstRoll == 5)
		{
			System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
		}
		else if(firstRoll == 6)
		{
			System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
		}
//dice print roll 2	
		else if(secondRoll == 1)
		{
			System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
		}
		else if(secondRoll == 2)
		{
			System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
		}
		else if(secondRoll == 3)
		{
			System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
		}
		else if(secondRoll == 4)
		{
			System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
		}
		else if(secondRoll == 5)
		{
			System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
		}
		else if(secondRoll == 6)
		{
			System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
		}
		
//WINNER	 
		
			if(roll == 7 || roll == 11)
			{
				System.out.println("Congrats you've rolled a " + roll + ". YOU WIN!");
		//play again
				System.out.println("Do you want to play again? y or n");
				String answer = scan.nextLine();
				
		//invalid input chance
				while(!answer.equals("y") && !answer.equals("n"))
						{
						//ask again
						System.out.println("enter a valid input. do you want to play again? type y or n");
						answer = scan.nextLine();
						}
				
	   //responses
					if(answer.equals("y")) //need to loop this and make sure I typed y or n
					{
						playAgain = true;
					}
					if(answer.equals("n"))
					{
						playAgain = false;
					}
			}
			
			
//LOSER		
			else if (roll == 2 || roll == 12)
			{
				System.out.println("you've rolled a " + roll + ". YOU LOSE!");
	//play again
				System.out.println("do you want to play again. y or n");
				String answer = scan.nextLine();
				
	//invalid input chance
				while(!answer.equals("y") && !answer.equals("n"))
						{
						//ask again
						System.out.println("enter a valid input. do you want to play again? type y or n");
						answer = scan.nextLine();
						}
	//responses			
					if(answer.equals("y"))
					{
						playAgain = true;
					}
					if(answer.equals("n"))
					{
						playAgain = false;
					}
			}
			
			
//ROLL POINT, PT 2	
			else
			{
				
				System.out.println("you've rolled a " + roll + ". your roll point is " + roll);
				
	//second roll			
				int anotherRoll = jane.roll();
				int anotherSecondRoll = mae.roll();
				int newRoll = anotherRoll + anotherSecondRoll;
				
//LOOP to continue rolling until the new roll is equal to roll or new roll equals 7
				while(newRoll != roll && newRoll != 7)
				{
					System.out.print("press enter to roll");
					scan.nextLine();
					anotherRoll = jane.roll();
					anotherSecondRoll = mae.roll();
					newRoll = anotherRoll + anotherSecondRoll;
					System.out.println("you've rolled a " + newRoll);
	//print dice first dice				
					if(anotherRoll == 1)
					{
						System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
					}
					else if(anotherRoll == 2)
					{
						System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
					}
					else if(anotherRoll == 3)
					{
						System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
					}
					else if(anotherRoll == 4)
					{
						System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
					}
					else if(anotherRoll == 5)
					{
						System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
					}
					else if(anotherRoll == 6)
					{
						System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
					}
	//print dice second dice
					else if(anotherSecondRoll == 1)
					{
						System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
					}
					else if(anotherSecondRoll == 2)
					{
						System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
					}
					else if(anotherSecondRoll == 3)
					{
						System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
					}
					else if(anotherSecondRoll == 4)
					{
						System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
					}
					else if(anotherSecondRoll == 5)
					{
						System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
					}
					else if(anotherSecondRoll == 6)
					{
						System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
					}	
					
				}
//WINNER			
				if(newRoll == roll)
				{	
	//print dice first dice				
					if(anotherRoll == 1)
					{
						System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
					}
					else if(anotherRoll == 2)
					{
						System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
					}
					else if(anotherRoll == 3)
					{
						System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
					}
					else if(anotherRoll == 4)
					{
						System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
					}
					else if(anotherRoll == 5)
					{
						System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
					}
					else if(anotherRoll == 6)
					{
						System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
					}
	//print dice second dice
					else if(anotherSecondRoll == 1)
					{
						System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
					}
					else if(anotherSecondRoll == 2)
					{
						System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
					}
					else if(anotherSecondRoll == 3)
					{
						System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
					}
					else if(anotherSecondRoll == 4)
					{
						System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
					}
					else if(anotherSecondRoll == 5)
					{
						System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
					}
					else if(anotherSecondRoll == 6)
					{
						System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
					}
					
	//print won				
					System.out.println("you've rolled a " + roll + ". YOU WON!");
	//play again
					System.out.println("do you want to play again? y or n");
					String answer = scan.nextLine();
	//invalid input chance
					while(!answer.equals("y") && !answer.equals("n"))
							{
							System.out.println("enter a valid input. do you want to play again? type y or n");
							answer = scan.nextLine();
							}
	//responses				
						if(answer.equals("y"))
								{
									playAgain = true;
								}
						if(answer.equals("n"))
								{
									playAgain = false;
								}
				}
				
	//LOSER
				else if(newRoll == 7)
				{
	//dice visual
	//print dice first dice				
					if(anotherRoll == 1)
					{
						System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
					}
					else if(anotherRoll == 2)
					{
						System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
					}
					else if(anotherRoll == 3)
					{
						System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
					}
					else if(anotherRoll == 4)
					{
						System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
					}
					else if(anotherRoll == 5)
					{
						System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
					}
					else if(anotherRoll == 6)
					{
						System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
					}
	//print dice second dice
					else if(anotherSecondRoll == 1)
					{
						System.out.println("  ----\n |    |\n | *  |\n |    |\n  ----");
					}
					else if(anotherSecondRoll == 2)
					{
						System.out.println("  ----\n |*   |\n |    |\n |  * |\n  ----");
					}
					else if(anotherSecondRoll == 3)
					{
						System.out.println("  ----\n |*   |\n | *  |\n |  * |\n  ----");
					}
					else if(anotherSecondRoll == 4)
					{
						System.out.println("  ----\n | ** |\n |    |\n | ** |\n  ----");
					}
					else if(anotherSecondRoll == 5)
					{
						System.out.println("  ----\n | ** |\n | *  |\n | ** |\n  ----");
					}
					else if(anotherSecondRoll == 6)
					{
						System.out.println("  ----\n | ** |\n | ** |\n | ** |\n  ----");
					}
	//print loss
					System.out.println("sorry, you've rolled a " + newRoll + " YOU LOSE.");
	//play again	
					System.out.println("do you want to play again? y or n");
					String answer = scan.nextLine();
					
	//invalid input chance
					while(!answer.equals("y") && !answer.equals("n"))
							{
							//ask again
							System.out.println("enter a valid input. do you want to play again? type y or n");
							answer = scan.nextLine();
							}
					
					if(answer.equals("y"))
					{
						playAgain = true;
					}
					if(answer.equals("n"))
					{
						playAgain = false;
					}	
				}
			}
				
		}
	}
}
	
			
		
	


